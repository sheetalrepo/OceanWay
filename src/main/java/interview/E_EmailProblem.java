package interview;

import java.text.ParseException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class E_EmailProblem {

	public static void sendMail(String emailAddress, String message, String[][] friendsArray) {
		
	}

	public static void main(String[] args) throws ParseException {

		String mailIdArr[][] = new String[3][2];
		mailIdArr[0][0] = "rahul@test.com";
		mailIdArr[0][1] = "rajat@test.com,rashmi@test.com,vinod@test.com,jk@test.com";
		mailIdArr[1][0] = "vineet@test.com";
		mailIdArr[1][1] = "ajay@test.com,rajat@test.com,rahul@test.com,ljm@test.com";
		mailIdArr[2][0] = "vinod@test.com";
		mailIdArr[2][1] = "rahul@test.com,nitin@test.com,vineet@test.com,dfg@test.com";

		Set<String> genArr = new HashSet<String>();

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println("mailIdArr[" + i + "][" + j + "] : " + mailIdArr[i][j]);
				if (mailIdArr[i][j].contains(",")) {
					String[] strSplitted = mailIdArr[i][j].split(",");

					for (int k = 0; k < strSplitted.length - 1; k++) {
						for (int l = 0; l < 3; l++) {
							if ((strSplitted[k].trim()).equalsIgnoreCase(mailIdArr[l][0].trim())) {
								System.out.println("Internal data :" + mailIdArr[l][0]);
								mailIdArr[i][j] = mailIdArr[i][j].trim() + "," + mailIdArr[l][1].trim();
								System.out.println("Internal data :" + mailIdArr[i][j]);
							}
						}

						genArr.add(strSplitted[k].trim());
					}

				} else {
					genArr.add(mailIdArr[i][j].trim());
				}
			}
		}
		System.out.println("Done");

		for (int m = 0; m < 3; m++) {
			for (int n = 0; n < 2; n++) {
				System.out.println("mailIdArr[" + m + "][" + n + "] : " + mailIdArr[m][n]);
			}
		}

		for (int z = 0; z < 3; z++) {
			int size = mailIdArr[z][1].split(",").length;
			String arr[] = mailIdArr[z][1].split(",");
			System.out.println("Size before deletion: " + size);
			Set<String> st = new HashSet<String>();

			for (int i = 0; i < arr.length - 1; i++) {
				st.add(arr[i]);
			}
			mailIdArr[z][1] = "";
			Iterator it = st.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
				mailIdArr[z][1] = it.next().toString() + ",";
			}

			System.out.println(mailIdArr[z][1]);
		}

		Iterator it = genArr.iterator();
		while (it.hasNext()) {
			// System.out.println(it.next());
		}

	}

}
