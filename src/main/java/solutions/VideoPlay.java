package solutions;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.awt.image.RenderedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VideoPlay {

    WebDriver driver;
    public void checkVideoPlaying(String videoPlayerPath) throws Exception {
        Thread.sleep(1000);
        takeScreenshotVideo("Image1", videoPlayerPath);
        Thread.sleep(3000);
        takeScreenshotVideo("Image2", videoPlayerPath);

        String file1 = "VideoComparison\\Image1.png";
        String file2 = "VideoComparison\\Image2.png";

        processImage(file1, file2);

    }


    public void takeScreenshotVideo(String screenshotName, String videoPlayerPath) {

        try {
            WebElement ele = driver.findElement(By.xpath(videoPlayerPath));
            if (ele.isDisplayed()) {
                File screen = (File) ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

                int ImageWidth = ele.getSize().getWidth();
                int ImageHeight = ele.getSize().getHeight();
                Point point = ele.getLocation();
                int xcord = point.getX();
                int ycord = point.getY();
                BufferedImage img = ImageIO.read(screen);
                BufferedImage dest = img.getSubimage(xcord, ycord, ImageWidth, ImageHeight);
                ImageIO.write(dest, "png", screen);
                FileUtils.copyFile(screen, new File("VideoComparison\\" + screenshotName + ".png"));
            }
        } catch (Exception e) {

            try {
                System.out.println("e" + e);
                // rg.logException("Taking Screenshots Fails", e);
            } catch (Exception e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }

            e.printStackTrace();
        }
    }
    
    public void processImage(String file1, String file2) throws Exception {

        try {
            Image image1 = Toolkit.getDefaultToolkit().getImage(file1);
            Image image2 = Toolkit.getDefaultToolkit().getImage(file2);

            PixelGrabber grab1 = new PixelGrabber(image1, 0, 0, -1, -1, false);
            PixelGrabber grab2 = new PixelGrabber(image2, 0, 0, -1, -1, false);

            int[] data1 = null;

            if (grab1.grabPixels()) {
                int width = grab1.getWidth();
                int height = grab1.getHeight();
                data1 = new int[width * height];
                data1 = (int[]) grab1.getPixels();
            }

            int[] data2 = null;

            if (grab2.grabPixels()) {
                int width = grab2.getWidth();
                int height = grab2.getHeight();
                data2 = new int[width * height];
                data2 = (int[]) grab2.getPixels();
            }

            boolean result = java.util.Arrays.equals(data1, data2);

            if (result == false) {
                System.out.println("Result = Video is playing - PASS ");

            } else {
                System.out.println("Result = Video is not Playing - FALSE");
//                ExtentUtility.getTest().log(LogStatus.FAIL, " Result = Video is not Playing - FALSE ",
//                        ExtentUtility.getTest().addScreenCapture(takeScreenShot()));
                throw new Exception(" Result = Video is not Playing - FALSE ");

            }

        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
    }


    public void validateImage(String imageName1, String imageName2) throws Exception {

        try {
            String file1 = "PhotoPassScreenshots/" + imageName1 + "" + ".png";
            String file2 = "PhotoPassScreenshots/" + imageName2 + "" + ".png";
            Image image1 = Toolkit.getDefaultToolkit().getImage(file1);
            Image image2 = Toolkit.getDefaultToolkit().getImage(file2);

            PixelGrabber grab1 = new PixelGrabber(image1, 0, 0, -1, -1, false);
            PixelGrabber grab2 = new PixelGrabber(image2, 0, 0, -1, -1, false);

            int[] data1 = null;

            if (grab1.grabPixels()) {
                int width = grab1.getWidth();
                int height = grab1.getHeight();
                data1 = new int[width * height];
                data1 = (int[]) grab1.getPixels();
            }

            int[] data2 = null;

            if (grab2.grabPixels()) {
                int width = grab2.getWidth();
                int height = grab2.getHeight();
                data2 = new int[width * height];
                data2 = (int[]) grab2.getPixels();
            }

            boolean result = java.util.Arrays.equals(data1, data2);

            if (result) {
                System.out.println("Result = Image validation - Pass ");
            } else {
                System.out.println("Result = Image validation - Fail ");

            }

        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
    }

    public void validateSlideImage(String imageName1, String imageName2) throws Exception {

        try {
            String file1 = "PhotoPassScreenshots/" + imageName1 + "" + ".png";
            String file2 = "PhotoPassScreenshots/" + imageName2 + "" + ".png";
            Image image1 = Toolkit.getDefaultToolkit().getImage(file1);
            Image image2 = Toolkit.getDefaultToolkit().getImage(file2);

            PixelGrabber grab1 = new PixelGrabber(image1, 0, 0, -1, -1, false);
            PixelGrabber grab2 = new PixelGrabber(image2, 0, 0, -1, -1, false);

            int[] data1 = null;

            if (grab1.grabPixels()) {
                int width = grab1.getWidth();
                int height = grab1.getHeight();
                data1 = new int[width * height];
                data1 = (int[]) grab1.getPixels();
            }

            int[] data2 = null;

            if (grab2.grabPixels()) {
                int width = grab2.getWidth();
                int height = grab2.getHeight();
                data2 = new int[width * height];
                data2 = (int[]) grab2.getPixels();
            }

            boolean result = java.util.Arrays.equals(data1, data2);

            if (result) {
                System.out.println("Result = Slide Show Image validation - Fail ");

            } else {

                System.out.println("Result = Slide Show Image validation - Pass ");
            }

        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
    }

    public String takeScreenShot() throws IOException {
        Calendar cal = Calendar.getInstance();
        long s = cal.getTimeInMillis();
        File screen = null;
        try {
            switch ("toolName") {
                case "Appium":
                    screen = (File) ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                    break;
                case "Selenium":
                    screen = (File) ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                    break;
            }
//            FileUtils.copyFile(screen,
//                    new File("ReportGenerator/" + ExtentUtility.reportFolder + "/Screenshots/image" + s + ".png"));
        } catch (Exception e) {
            System.out.println(e);
        }

        return "todo";
//        return (new File("ReportGenerator//" + ExtentUtility.reportFolder + "//Screenshots//image" + s + ".png")
//                .getAbsolutePath());

    }
}
