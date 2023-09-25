package file.linux;

import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.optional.ssh.Scp;
import com.jcraft.jsch.JSchException;

public class DownloadFileFromLinuxServer {

	
	/**
	 *  This method will download given file from linux server path to local folder path
	 */
	public void downloadFile(String remoteFilePath,String localFolderPath) throws JSchException, InterruptedException {
		System.out.println("downloading...");
		Scp scp = new Scp();
		int portSSH = 1234;
		String serverIPSSH = "xx.xxx.xx.xxx";
		String userNameSSH = "username";
		String passwordSSH = "password";
		scp.setPort(portSSH);
		scp.setRemoteFile(userNameSSH + ":" + passwordSSH + "@" + serverIPSSH + ":"+ remoteFilePath);
		scp.setLocalTodir(localFolderPath);
		scp.setProject(new Project());
		scp.setTrust(true);
		scp.execute();
		System.out.println("done");
	}
    
	
	
	public static void main(String[] args) {
		DownloadFileFromLinuxServer obj = new DownloadFileFromLinuxServer();
    	String fileNameToBeDownloaded = "abc.dat";
    	String remotePath = "/path/to/file/" + fileNameToBeDownloaded;
    	String localFolderPath = "./src/main/java/file/linux";
    	try {
			obj.downloadFile(remotePath, localFolderPath);
		} catch (JSchException | InterruptedException e) {
			e.printStackTrace();
		}
	}

}
