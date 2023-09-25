package file.linux;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Properties;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

public class GetLatestFileNameFromServer {

	
	public static String fetchLatestFileNameFromServer(String path, String username, String pwd, String ip, String port) {
        String fileName = null;

        try {
            JSch ssh = new JSch();
            //Session session = new JSch().getSession(username, ip,port); //get session obj
            
            Session session = null;
            session.setPassword(pwd);
            Properties prop = new Properties();
            prop.put("StrictHostKey", "no");
            session.setConfig(prop);
            session.connect();
            String cmd = "cd " + path + ";ls -at | head -1;";
            
            Channel channel = session.openChannel("exec");
            ChannelExec sftp = (ChannelExec) channel;
            
            InputStreamReader isr = new InputStreamReader(sftp.getInputStream());
            BufferedReader in = new BufferedReader(isr);
            sftp.setCommand(cmd);
            channel.connect();

            while ((fileName = in.readLine()) != null) {
                return fileName;
            }

            channel.disconnect();
            session.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fileName;
    }
	
	
	public static void main(String[] args) {
		fetchLatestFileNameFromServer("/a/b/c","user","pass","10.10.10.10","8888");
	}

}
