package file.linux;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FilenameUtils;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.optional.ssh.Scp;

import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

/**
 * Upload file on server and change file mode to 777
 *
 */
public class UploadFileOnServer {

	public static void main(String[] args) {
		UploadFileOnServer obj = new UploadFileOnServer();
		String fileName = "ABC.DAT";
		String fileNameToBeUploaded = "./src/main/java/file/linux/" + fileName;
		String remotePath = "/path/to/folder/";
		obj.uploadFileAndExecuteShellCommandOnFile(fileNameToBeUploaded, remotePath);
	}

	
	// https://commons.apache.org/proper/commons-io/javadocs/api-2.5/org/apache/commons/io/FilenameUtils.html
	public void uploadFileAndExecuteShellCommandOnFile(String localFilePath, String remotePath) {
		File localFile = new File(localFilePath);

		int portSSH = 1234;
		String serverIPSSH = "xx.xxx.xx.xxx";
		String userNameSSH = "username";
		String passwordSSH = "password";
		
		if (localFile.exists()) {
			uploadFile(serverIPSSH, portSSH, userNameSSH, passwordSSH,localFilePath, remotePath);
			
			//to change mode of uploaded file
			String shellcmd = "chmod 777 " + remotePath + FilenameUtils.getName(localFilePath);
			executeShellCmdOnFile(shellcmd, serverIPSSH, portSSH, userNameSSH, passwordSSH);
		} else {
			throw new RuntimeException(String.format("File not present on path: (%s)", localFilePath));
		}

	}

	public static void uploadFile(String hostName, int portNo, String userName,String password, String localsource, String remoteDir) {
		Scp scp = new Scp();
		int portSSH = portNo;
		String serverIPSSH = hostName;
		String userNameSSH = userName;
		String passwordSSH = password;

		scp.setPort(portSSH);
		scp.setLocalFile(localsource);
		scp.setTodir(userNameSSH + ":" + passwordSSH + "@" + serverIPSSH + ":"+ remoteDir);
		scp.setProject(new Project());
		scp.setTrust(true);
		scp.execute();
	}

	
	public static List<String> executeShellCmdOnFile(String shellCommand, String hostName, int portNo, String userName, String password) {
		List<String> result = new ArrayList<>();
		try {
			JSch jsch = new JSch();
			Session session = jsch.getSession(userName, hostName, portNo);
			session.setConfig("StrictHostKeyChecking", "no");
			session.setPassword(password);
			session.connect();

			ChannelExec channelExec = (ChannelExec) session.openChannel("exec");
			InputStream in = channelExec.getInputStream();
			channelExec.setCommand(shellCommand);
			channelExec.connect();

			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			String line;

			while ((line = reader.readLine()) != null) {
				result.add(line);
			}

			int exitStatus = channelExec.getExitStatus();
			channelExec.disconnect();
			session.disconnect();

			if (exitStatus < 0) {
				System.out.println("Done with exit status not set...");
			} else if (exitStatus > 0) {
				System.out.println("Done with some error...");
			} else {
				System.out.println("Done...");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
