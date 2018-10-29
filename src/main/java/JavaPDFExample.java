package main.java;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.URL;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import javax.imageio.ImageIO;

public class JavaPDFExample
{
    public static void main(String[] args)
    {
        Document document = new Document();
        try
        {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("AddImageExample.pdf"));
            document.open();
            document.add(new Paragraph("Image Example"));

            //Add Image
            Image image1 = Image.getInstance("BMI.png");
            //Fixed Positioning
            image1.setAbsolutePosition(100f, 550f);
            //Scale to new height and new width of image
            image1.scaleAbsolute(200, 100);
            //Add to document
            document.add(image1);

            /*String imageUrl = "http://www.eclipse.org/xtend/images/java8_logo.png";
            Image image2 = Image.getInstance(new URL(imageUrl));
            document.add(image2);*/

            String bmi= "27.7";

            //Creating the dynamic image
            final BufferedImage image = ImageIO.read(new File("You.png"));
            Graphics g = image.getGraphics();
            g.setFont(g.getFont().deriveFont(10f));
            g.drawString(bmi, 50, 25);
            g.dispose();

            //Renamed "You" image to "weight"
            ImageIO.write(image, "png", new File("weight.png"));


            Image image2 = Image.getInstance("weight.png");

            //Dynamic positioning of "You" image
            float xCord = Float.parseFloat(bmi);
            if(xCord<18.5f) {
                image2.setAbsolutePosition(110f, 533f);
            }
            else if(xCord>=18.5f && xCord<=24.9f) {
                image2.setAbsolutePosition(150f, 533f);
            }
            else if(xCord>24.9f && xCord<=29.9f) {
                image2.setAbsolutePosition(190f, 533f);
            }
            else if(xCord>29.9f && xCord<=34.9f) {
                image2.setAbsolutePosition(230f, 533f);
            }
            else {
                image2.setAbsolutePosition(270f, 533f);
            }
            image2.scaleAbsolute(30, 15);
            document.add(image2);

            document.close();
            writer.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}