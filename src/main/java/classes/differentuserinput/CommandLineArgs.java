package classes.differentuserinput;
/*
 *go to run config and give three arg space separated 
 */
public class CommandLineArgs {

	public static void main(String[] args) {
		String str1 = args[0];
		String str2 = args[1];
		String str3 = args[2];
		
		System.out.println("Total arguments: "+args.length);
		System.out.println(str1 + " " + str2 + " " + str3);
	}
}
