package file.pdf;

import java.io.FileOutputStream;
import java.io.IOException;

import org.slf4j.LoggerFactory;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

/**
 * image.pdf: its an image kind pdf hence not able to read content
 *
 */
public class ReadPDFContent {

	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ReadPDFContent.class);

	public void readNormalPDF(String filename) {
		String pdfPath = System.getProperty("user.dir")+"\\src\\main\\java\\file\\pdf\\"+filename+".pdf";

		String firstPageContent = "";
		try {
			PdfReader pdfReader = new PdfReader(pdfPath);
			int pageCount = pdfReader.getNumberOfPages();
			System.out.println("pages count:"+ pageCount);

			firstPageContent = PdfTextExtractor.getTextFromPage(pdfReader, 1); // page count
			pdfReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Text:\n"+ firstPageContent);
	}



	/**
	 * Need to add external jar from http://www.bouncycastle.org/latest_releases.html
	 * Not able to get proper maven dependency
	 */
	public void readPasswordProtectedPDF(String filename, String password){
		String pdfPath = System.getProperty("user.dir")+"\\src\\main\\java\\file\\pdf\\"+filename+".pdf";

		PdfReader.unethicalreading = true;
		PdfReader pdfReader = null;
		try {
			//open pwd file
			pdfReader = new PdfReader(pdfPath, password.getBytes());
			String updatedFileName = pdfPath.replace(".pdf", "") + "New.pdf";
			PdfStamper pdfStamper = new PdfStamper(pdfReader, new FileOutputStream(updatedFileName));
			pdfStamper.close();

			//get page count
			int pageCount = pdfReader.getNumberOfPages();
			System.out.println("pages count:"+ pageCount);


			//read first page
			String firstPage = PdfTextExtractor.getTextFromPage(pdfReader, 1);
			System.out.println("Pages Content: \n"+ firstPage);


			//read entire page
			StringBuilder sb = new StringBuilder();

			for(int i=1; i<=pageCount; i++){
				String content = PdfTextExtractor.getTextFromPage(pdfReader, i);
				sb.append(content);
			}

			System.out.println("\n All Pages Content: \n"+ sb.toString());

		} catch (IOException e) {
			logger.info("IO Exception {}", e);
		}
		catch (DocumentException e) {
			logger.info("Document Exception {}", e);
		}


	}



	public static void main(String[] args) {

		ReadPDFContent obj = new ReadPDFContent();
		//obj.readNormalPDF("simplepdf");
		//obj.readPasswordProtectedPDF("Stmt_Pwd_PAN","ENTER_MY_PAN");
		
		
	}

}