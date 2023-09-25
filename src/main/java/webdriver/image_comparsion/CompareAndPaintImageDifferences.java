package webdriver.image_comparsion;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * This class will compare both image and colour the result diff image
 */
public class CompareAndPaintImageDifferences {

	public static BufferedImage getDifferenceImage(BufferedImage img1, BufferedImage img2) {
	    final int w = img1.getWidth();
	    final int h = img1.getHeight(); 
	    final int highlight = Color.RED.getRGB(); // difference colour
	    
	    //convert images to int pixel arrays
	    final int[] p1 = img1.getRGB(0, 0, w, h, null, 0, w);
	    final int[] p2 = img2.getRGB(0, 0, w, h, null, 0, w);
	    
	    //compare both image pixel by pixel and update the first int array with differences
	    for (int i = 0; i < p1.length; i++) {
	        if (p1[i] != p2[i]) {
	            p1[i] = highlight;
	        }
	    }

	    // create a result image and update it with differences
	    final BufferedImage out = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
	    out.setRGB(0, 0, w, h, p1, 0, w);
	    return out;
	}
	
	
	public static void main(String[] args) throws IOException {
		BufferedImage expectedImage = ImageIO.read(new File(".\\src\\main\\java\\webdriver\\image_comparsion\\expected_image.png")) ;
		BufferedImage actualImage = ImageIO.read(new File(".\\src\\main\\java\\webdriver\\image_comparsion\\actual_image.png")) ;
		File resultImage = new File(".\\src\\main\\java\\webdriver\\image_comparsion\\result_image.png");
		
		BufferedImage imageDifference = getDifferenceImage(expectedImage,actualImage );
		ImageIO.write(imageDifference, "png", resultImage);
		System.out.println("Done");
	}
	
	
}
