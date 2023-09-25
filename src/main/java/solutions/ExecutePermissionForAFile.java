package solutions;


/**
 * Problem Statement: Team created a file and placed it on server. Now we need to set 777 permission on file but 
 *  some server(stage, prod) don't allow outside code to changes its file permissions.
 * 
 * Sol: 
 * We can create a bash file and placed it inside server
 * Using some cron job we can execute bash file periodically e.g. every 30sec
 * So whenever new file come, it will get 777 permission after 30 sec
 *
 */
public class ExecutePermissionForAFile {

	/*
	//bash file content : abc.sh
	
	OS_USER='whoami'
	while [ 1 -lt 10 ]
	do 
	echo "Permisison to be updated for:"
	chmod -R 777 /apps/path_of_folder_containing_file/*.*
	sleep 5  
	done

	*/
	

	/*
	login to server and run foll cmd
	
	bash /apps/path_of_folder_containing_file/abc.sh
	
	*/
	
	
}
