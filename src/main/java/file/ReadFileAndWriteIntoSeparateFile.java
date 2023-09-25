package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadFileAndWriteIntoSeparateFile {

	public void readFileAndFetchFewColumns() {
//		String inputFile = "/home/xeadmin/Documents/projects/ctr/jmeter/CTR_BASKET_SALES_SUMM_20150818020026.dat";
		String inputFile = "/home/xeadmin/workspace/CTR-TestData-Generator/src/main/resources/generated/CTR_BASKET_SALES_SUMM_20150825145251_New.dat";
		String outputFile = "/home/xeadmin/Documents/projects/ctr/jmeter/New65k.csv";
		String fileSeparator = "\\|";
		StringBuilder sb = new StringBuilder();
		int counter = 0;
		FileReader fr;
		try {
			fr = new FileReader(inputFile);
			BufferedReader br = new BufferedReader(fr);
			String line;

			while ((line = br.readLine()) != null) {
				counter++;
				List<String> fileList = new ArrayList<String>(
						Arrays.asList(line.split(fileSeparator)));

				String crnNumber = fileList.get(30); // fetch crn column
				String basketId2 = fileList.get(33); // fetch basketid2 column
//				String crnNumber = fileList.get(0); // fetch crn column
//				String basketId2 = fileList.get(1); // fetch basketid2 column
				
				String dateRaw = basketId2.substring(0, 8); // first 8 digit of
															// basketId2
				String yyyy = dateRaw.substring(0, 4);
				String mm = dateRaw.substring(4, 6);
				String dd = dateRaw.substring(6, 8);
				String date = yyyy + "-" + mm + "-" + dd;

				String podId = basketId2.substring(8, 9); // 9th digit
				String txId = basketId2.substring(9, basketId2.length() - 4); // contains all digit starting from 10th & except last 4 digit
				String storeId = basketId2.substring(basketId2.length() - 4, basketId2.length()); // last 4 digit of columnB
				// System.out.println(crnNumber+","+basketId2+","+date+","+podId+","+txId+","+storeId);
				sb.append(crnNumber + "," + date + "," + podId + "," + txId+ "," + storeId + "\n");
			}
			br.close();

			// Write sb to file
			FileWriter fw = new FileWriter(outputFile);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(sb.toString());
			bw.flush();
			bw.close();
			System.out.println("File written successfully");
		} catch (FileNotFoundException e) {
			System.out.println(counter);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(counter);
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception at line no: " + counter);
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ReadFileAndWriteIntoSeparateFile obj = new ReadFileAndWriteIntoSeparateFile();
		obj.readFileAndFetchFewColumns();
	}
}