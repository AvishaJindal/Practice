package main.java;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType0Font;
import org.apache.pdfbox.pdmodel.graphics.color.PDColor;
import org.apache.pdfbox.pdmodel.graphics.color.PDDeviceRGB;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.apache.pdfbox.pdmodel.interactive.action.PDActionGoTo;
import org.apache.pdfbox.pdmodel.interactive.action.PDActionURI;
import org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;
import org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;
import org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageXYZDestination;


public class RHI_PDF
{

    public static void main(String[] args) {

        /*Start: Dynamic Values*/
        String customerName = "Hector Anklesaria";
        Integer age = 30;
        Integer height = 173;
        Integer weight = 75;
        Integer bodyFat = 30;
        Integer bodyAge = 45;
        Double visceralFat = 10.9;
        String bloodPressure = "20/80";
        Integer metabolicRate = 60;
        Integer bmi=32;
        /*End: Dynamic Values*/

        PDDocument document = new PDDocument();
        PDFont font1;
        PDFont font2;

        File file = new File("C:/Users/avishaji996/workspace/RHI_PDF/src/main/resources/font/VAG Rounded Bold.ttf");
        File file1 = new File("C:/Users/avishaji996/workspace/RHI_PDF/src/main/resources/font/VAGRounded-Light.ttf");

        //Page sizes Changed by Avisha:Start
        PDRectangle rec1 = new PDRectangle(595, 842);
        PDPage page1 = new PDPage(rec1);
        //PDPage page1 = new PDPage(PDRectangle.A4);
        PDRectangle rec2 = new PDRectangle(595, 600);
        PDPage page2 = new PDPage(rec2);


        PDRectangle rec3 = new PDRectangle(595, 841);
        PDPage page3 = new PDPage(rec3);

        PDRectangle rec4 = new PDRectangle(595, 842);
        PDPage page4 = new PDPage(rec4);

        PDRectangle rec5 = new PDRectangle(595, 800);
        PDPage page5 = new PDPage(rec5);

        PDRectangle rec6 = new PDRectangle(595, 600);
        PDPage page6 = new PDPage(rec6);

        PDRectangle rec7 = new PDRectangle(595, 842);
        PDPage page7 = new PDPage(rec7);

        PDRectangle rec8 = new PDRectangle(595, 750);
        PDPage page8 = new PDPage(rec8);
        //Page sizes Changed by Avisha:Start

        document.addPage(page1);
        document.addPage(page2);
        document.addPage(page3);
        document.addPage(page4);
        document.addPage(page5);
        document.addPage(page6);
        document.addPage(page7);

        //New Page by Avisha
        document.addPage(page8);


        PDImageXObject pdImage;
        PDImageXObject moveTopImage;

        /*Start: Declarations related to making images clickable*/
        PDAnnotationLink face1link = new PDAnnotationLink();
        PDAnnotationLink face2link = new PDAnnotationLink();
        PDAnnotationLink face3link = new PDAnnotationLink();
        PDAnnotationLink face4link = new PDAnnotationLink();
        PDAnnotationLink bodyAgelink = new PDAnnotationLink();
        PDAnnotationLink bmiLink = new PDAnnotationLink();
        PDAnnotationLink moveupLink = new PDAnnotationLink();
        PDAnnotationLink moveupLinkPage3 = new PDAnnotationLink();
        PDPageXYZDestination destFac1 = new PDPageXYZDestination();
        PDPageXYZDestination destFac2 = new PDPageXYZDestination();
        PDPageXYZDestination destFac3 = new PDPageXYZDestination();
        PDPageXYZDestination destFac4 = new PDPageXYZDestination();
        PDPageXYZDestination destBodyAge = new PDPageXYZDestination();
        PDPageXYZDestination destBmi = new PDPageXYZDestination();
        PDPageXYZDestination destMoveup = new PDPageXYZDestination();
        PDActionGoTo face1Action = new PDActionGoTo();
        PDActionGoTo face2Action = new PDActionGoTo();
        PDActionGoTo face3Action = new PDActionGoTo();
        PDActionGoTo face4Action = new PDActionGoTo();
        PDActionGoTo bodyAgeAction = new PDActionGoTo();
        PDActionGoTo bmiAction = new PDActionGoTo();
        PDActionGoTo moveupAction = new PDActionGoTo();
        PDRectangle face1Rect = new PDRectangle();
        PDRectangle face2Rect = new PDRectangle();
        PDRectangle face3Rect = new PDRectangle();
        PDRectangle face4Rect = new PDRectangle();
        PDRectangle moveupRect = new PDRectangle();
        PDRectangle bodyAgeRect = new PDRectangle();
        PDRectangle bmiRect = new PDRectangle();
        destMoveup.setPage(document.getPage(0));//all move up links will point to first page
        destMoveup.setZoom(1);//to set the zoom % of landing page as 100
        destMoveup.setTop(new Float(page1.getMediaBox().getHeight()).intValue());//to move to the top of the lonked page
        moveupAction.setDestination(destMoveup);
        moveupLink.setAction(moveupAction);
        moveupLinkPage3.setAction(moveupAction);
        moveupRect.setLowerLeftX(543);
        moveupRect.setLowerLeftY(35);
        moveupRect.setUpperRightX(586);
        moveupRect.setUpperRightY(78);
        moveupLink.setRectangle(moveupRect);

        PDAnnotationLink txtLinkPage3 = new PDAnnotationLink();
        PDAnnotationLink txtLinkPage4 = new PDAnnotationLink();
        PDAnnotationLink txtLinkPage5_1 = new PDAnnotationLink();
        PDAnnotationLink txtLinkPage5_2 = new PDAnnotationLink();
        PDAnnotationLink txtLinkPage5_3 = new PDAnnotationLink();
        PDAnnotationLink txtLinkPage5_4 = new PDAnnotationLink();
        PDAnnotationLink txtLinkPage7_1 = new PDAnnotationLink();
        PDAnnotationLink txtLinkPage7_2 = new PDAnnotationLink();
        PDAnnotationLink txtLinkPage7_3 = new PDAnnotationLink();
        PDRectangle positionPage3 = new PDRectangle();
        PDRectangle positionPage4 = new PDRectangle();
        PDRectangle positionPage5_1 = new PDRectangle();
        PDRectangle positionPage5_2 = new PDRectangle();
        PDRectangle positionPage5_3 = new PDRectangle();
        PDRectangle positionPage5_4 = new PDRectangle();
        PDRectangle positionPage7_1 = new PDRectangle();
        PDRectangle positionPage7_2 = new PDRectangle();
        PDRectangle positionPage7_3 = new PDRectangle();
        PDActionURI actionPage3 = new PDActionURI();
        PDActionURI actionPage4 = new PDActionURI();
        PDActionURI actionPage5_1 = new PDActionURI();
        PDActionURI actionPage5_2 = new PDActionURI();
        PDActionURI actionPage5_3 = new PDActionURI();
        PDActionURI actionPage5_4 = new PDActionURI();
        PDActionURI actionPage7_1 = new PDActionURI();
        PDActionURI actionPage7_2 = new PDActionURI();
        PDActionURI actionPage7_3 = new PDActionURI();
        //A clickable rectangle is created around the image. Below code is to remove the border of that rectangle
        PDBorderStyleDictionary borderULine = new PDBorderStyleDictionary();
        borderULine.setStyle(PDBorderStyleDictionary.STYLE_SOLID);
        borderULine.setWidth(2);
        moveupLink.setBorderStyle(borderULine);
        moveupLinkPage3.setBorderStyle(borderULine);
        /*End: Declarations related to making images clickable*/


        try {
            font1 = PDType0Font.load(document, file);
            font2 = PDType0Font.load(document, file1);

            //ContentStream declarations for each page
            PDPageContentStream contentStream1 = new PDPageContentStream(document, page1);
            PDPageContentStream contentStream2 = new PDPageContentStream(document, page2);
            PDPageContentStream contentStream3 = new PDPageContentStream(document, page3);
            PDPageContentStream contentStream4 = new PDPageContentStream(document, page4);
            PDPageContentStream contentStream5 = new PDPageContentStream(document, page5);
            PDPageContentStream contentStream6 = new PDPageContentStream(document, page6);
            PDPageContentStream contentStream7 = new PDPageContentStream(document, page7);

            //New Page
            PDPageContentStream contentStream8 = new PDPageContentStream(document, page8);

            /*Start: Page 1 formatting*/
            contentStream1.setNonStrokingColor(239,64,91);
            contentStream1.addRect(0, 514, 595, 328);
            contentStream1.fill();

            /*contentStream1.setNonStrokingColor(Color.black);
            contentStream1.addRect(300, 514, 245, 255);
            contentStream1.fill();*/

            //RHI logo
            pdImage = PDImageXObject.createFromFile("C:/Users/avishaji996/workspace/RHI_PDF/src/main/resources/images/logo.png", document);
            contentStream1.drawImage(pdImage, 392,788);

            pdImage = PDImageXObject.createFromFile("C:/Users/avishaji996/workspace/RHI_PDF/src/main/resources/images/forgetfulman.png", document);
            contentStream1.drawImage(pdImage, 300, 514);


            contentStream1.beginText();
            contentStream1.setFont(font1, 36);
            contentStream1.newLineAtOffset(50, 715);
            contentStream1.setNonStrokingColor(Color.white);
            contentStream1.showText("HEALTH CHECK-UP");
            contentStream1.endText();

            contentStream1.beginText();
            contentStream1.setFont(font2, 22);
            contentStream1.newLineAtOffset(50, 690);
            contentStream1.setCharacterSpacing(5.0f);
            contentStream1.showText("REPORT");
            contentStream1.endText();

            contentStream1.setCharacterSpacing(0.0f);
            contentStream1.beginText();
            contentStream1.setFont(font1, 20);
            contentStream1.newLineAtOffset(50, 641);
            //contentStream1.setCharacterSpacing(5.0f);
            contentStream1.showText(customerName);
            contentStream1.endText();

            contentStream1.beginText();
            contentStream1.setFont(font2, 18);
            contentStream1.newLineAtOffset(50, 576);
            //contentStream1.setCharacterSpacing(5.0f);
            contentStream1.showText("Height: ");
            contentStream1.endText();

            contentStream1.beginText();
            contentStream1.setFont(font1, 18);
            contentStream1.newLineAtOffset(110, 576);
            contentStream1.showText( height +" cms");
            contentStream1.endText();

            contentStream1.beginText();
            contentStream1.setFont(font2, 18);
            contentStream1.newLineAtOffset(48, 547);
            //contentStream1.setCharacterSpacing(5.0f);
            contentStream1.showText("Weight: ");
            contentStream1.endText();

            contentStream1.beginText();
            contentStream1.setFont(font1, 18);
            contentStream1.newLineAtOffset(110, 547);
            //contentStream1.setCharacterSpacing(5.0f);
            contentStream1.showText( weight +" kgs");
            contentStream1.endText();

            contentStream1.beginText();
            contentStream1.setFont(font1, 25);
            contentStream1.setNonStrokingColor(77,77,79);
            contentStream1.newLineAtOffset(54, 465);
            //contentStream1.setCharacterSpacing(5.0f);
            contentStream1.showText( " Age:");
            contentStream1.endText();

            //contentStream1.setStrokingColor(167, 169, 172);
            //contentStream1.drawLine(110,455,225,455);

            contentStream1.beginText();
            contentStream1.setFont(font1, 25);
            contentStream1.setNonStrokingColor(239,64,91);
            contentStream1.newLineAtOffset(120, 465);
            //contentStream1.setCharacterSpacing(5.0f);
            contentStream1.showText( age.toString()+" years,");
            contentStream1.endText();

            contentStream1.beginText();
            contentStream1.setFont(font1, 25);
            contentStream1.setNonStrokingColor(77,77,79);
            contentStream1.newLineAtOffset(230, 465);
            //contentStream1.setCharacterSpacing(5.0f);
            contentStream1.showText( "but your Body Age");
            contentStream1.endText();


            pdImage = PDImageXObject.createFromFile("C:/Users/avishaji996/workspace/RHI_PDF/src/main/resources/images/arrow.png", document);
            contentStream1.drawImage(pdImage, 437,441);
            destBodyAge.setPage(document.getPage(1));
            destBodyAge.setZoom(1);
            destBodyAge.setTop(new Float(page2.getMediaBox().getHeight()).intValue());
            bodyAgeAction.setDestination(destBodyAge);
            bodyAgelink.setAction(bodyAgeAction);
            bodyAgeRect.setLowerLeftX(54);
            bodyAgeRect.setLowerLeftY(436);
            bodyAgeRect.setUpperRightX(560);
            bodyAgeRect.setUpperRightY(506);
            bodyAgelink.setRectangle(bodyAgeRect);
            bodyAgelink.setBorderStyle(borderULine);
            page1.getAnnotations().add(bodyAgelink);

            contentStream1.beginText();
            contentStream1.setFont(font1, 24);
            contentStream1.setNonStrokingColor(Color.WHITE);
            contentStream1.newLineAtOffset(442, 465);
            //contentStream1.setCharacterSpacing(5.0f);
            contentStream1.showText( bodyAge.toString());
            contentStream1.endText();

            contentStream1.beginText();
            contentStream1.setFont(font2, 24);
            contentStream1.setNonStrokingColor(Color.WHITE);
            contentStream1.newLineAtOffset(483, 465);
            //contentStream1.setCharacterSpacing(5.0f);
            contentStream1.showText("years");
            contentStream1.endText();

            pdImage = PDImageXObject.createFromFile("C:/Users/avishaji996/workspace/RHI_PDF/src/main/resources/images/gradient.png", document);
            contentStream1.drawImage(pdImage, 0,0);

           /* contentStream1.drawLine(54,436,540,436);
            contentStream1.setLineWidth(100.0f);
            contentStream1.setStrokingColor(77,77,79);*/
            contentStream1.setLineWidth(1f);
            contentStream1.setStrokingColor(77,77,79);
            contentStream1.moveTo(54,436);
            contentStream1.lineTo(540,436);
            contentStream1.closeAndStroke();

            /*contentStream1.setNonStrokingColor(Color.black);
            contentStream1.addRect(392, , 180, 32);
            contentStream1.fill();*/

            //Body Fat face image change based on value
            if(bodyFat<=40) {
                pdImage = PDImageXObject.createFromFile("C:/Users/avishaji996/workspace/RHI_PDF/src/main/resources/images/face-1.png", document);
            }
            else if(bodyFat>40 && bodyFat<=70) {
                pdImage = PDImageXObject.createFromFile("C:/Users/avishaji996/workspace/RHI_PDF/src/main/resources/images/face-2.png", document);
            }
            else if(bodyFat>70) {
                pdImage = PDImageXObject.createFromFile("C:/Users/avishaji996/workspace/RHI_PDF/src/main/resources/images/face-3.png", document);
            }

            contentStream1.drawImage(pdImage, 36, 128);

            destFac1.setPage(document.getPage(2));
            destFac1.setZoom(1);
            destFac1.setTop(new Float(page3.getMediaBox().getHeight()).intValue());
            face1Action.setDestination(destFac1);
            face1link.setAction(face1Action);
            face1Rect.setLowerLeftX(36);
            face1Rect.setLowerLeftY(128);
            face1Rect.setUpperRightX(158);
            face1Rect.setUpperRightY(418);
            face1link.setRectangle(face1Rect);
            face1link.setBorderStyle(borderULine);
            page1.getAnnotations().add(face1link);

            contentStream1.beginText();
            contentStream1.setFont(font1, 24);
            contentStream1.setNonStrokingColor(239,62,91);
            contentStream1.newLineAtOffset(76, 230);
            //contentStream1.setCharacterSpacing(5.0f);
            contentStream1.showText( bodyFat+"%");
            contentStream1.endText();

            //Visceral fat face change based on value
            if(visceralFat>8) {
                pdImage = PDImageXObject.createFromFile("C:/Users/avishaji996/workspace/RHI_PDF/src/main/resources/images/face-4.png", document);
            }
            else if(visceralFat>5 && visceralFat<=8) {
                pdImage = PDImageXObject.createFromFile("C:/Users/avishaji996/workspace/RHI_PDF/src/main/resources/images/face-5.png", document);
            }
            else if(visceralFat<=5) {
                pdImage = PDImageXObject.createFromFile("C:/Users/avishaji996/workspace/RHI_PDF/src/main/resources/images/face-6.png", document);
            }

            contentStream1.drawImage(pdImage, 170, 128);
            destFac2.setPage(document.getPage(3));
            destFac2.setZoom(1);
            destFac2.setTop(new Float(page4.getMediaBox().getHeight()).intValue());
            face2Action.setDestination(destFac2);
            face2link.setAction(face2Action);
            face2Rect.setLowerLeftX(170);
            face2Rect.setLowerLeftY(128);
            face2Rect.setUpperRightX(292);
            face2Rect.setUpperRightY(418);
            face2link.setRectangle(face2Rect);
            face2link.setBorderStyle(borderULine);
            page1.getAnnotations().add(face2link);


            contentStream1.beginText();
            contentStream1.setFont(font1, 24);
            contentStream1.setNonStrokingColor(239,62,91);
            contentStream1.newLineAtOffset(210, 230);
            //contentStream1.setCharacterSpacing(5.0f);
            contentStream1.showText( visceralFat.toString());
            contentStream1.endText();

            //Blood pressure face change based on value
            //Below code needs to be edited
            if(bodyFat>8) {
                pdImage = PDImageXObject.createFromFile("C:/Users/avishaji996/workspace/RHI_PDF/src/main/resources/images/face-7.png", document);
            }
            else if(bodyFat>5 && bodyFat<=8) {
                pdImage = PDImageXObject.createFromFile("C:/Users/avishaji996/workspace/RHI_PDF/src/main/resources/images/face-8.png", document);
            }
            else if(bodyFat<=5) {
                pdImage = PDImageXObject.createFromFile("C:/Users/avishaji996/workspace/RHI_PDF/src/main/resources/images/face-9.png", document);
            }

            contentStream1.drawImage(pdImage, 304, 128);

            destFac3.setPage(document.getPage(4));
            destFac3.setZoom(1);
            destFac3.setTop(new Float(page5.getMediaBox().getHeight()).intValue());
            face3Action.setDestination(destFac3);
            face3link.setAction(face3Action);
            face3Rect.setLowerLeftX(304);
            face3Rect.setLowerLeftY(128);
            face3Rect.setUpperRightX(426);
            face3Rect.setUpperRightY(418);
            face3link.setRectangle(face3Rect);
            face3link.setBorderStyle(borderULine);
            page1.getAnnotations().add(face3link);


            contentStream1.beginText();
            contentStream1.setFont(font1, 24);
            contentStream1.setNonStrokingColor(239,62,91);
            contentStream1.newLineAtOffset(332, 230);
            //contentStream1.setCharacterSpacing(5.0f);
            contentStream1.showText( bloodPressure);
            contentStream1.endText();


            //Metabolic rate face change based on value
            if(metabolicRate>60) {
                pdImage = PDImageXObject.createFromFile("C:/Users/avishaji996/workspace/RHI_PDF/src/main/resources/images/face-12.png", document);
            }
            else if(metabolicRate>30 && metabolicRate<=60) {
                pdImage = PDImageXObject.createFromFile("C:/Users/avishaji996/workspace/RHI_PDF/src/main/resources/images/face-11.png", document);
            }
            else if(metabolicRate<=30) {
                pdImage = PDImageXObject.createFromFile("C:/Users/avishaji996/workspace/RHI_PDF/src/main/resources/images/face-10.png", document);
            }
            contentStream1.drawImage(pdImage, 438, 128);
            destFac4.setPage(document.getPage(5));
            destFac4.setZoom(1);
            destFac4.setTop(new Float(page6.getMediaBox().getHeight()).intValue());
            face4Action.setDestination(destFac4);
            face4link.setAction(face4Action);
            face4Rect.setLowerLeftX(438);
            face4Rect.setLowerLeftY(128);
            face4Rect.setUpperRightX(560);
            face4Rect.setUpperRightY(418);
            face4link.setRectangle(face4Rect);
            face4link.setBorderStyle(borderULine);
            page1.getAnnotations().add(face4link);


            //Below part will also be showing stars conditionally
            pdImage = PDImageXObject.createFromFile("C:/Users/avishaji996/workspace/RHI_PDF/src/main/resources/images/star-1.png", document);
            contentStream1.drawImage(pdImage, 65, 192);
            pdImage = PDImageXObject.createFromFile("C:/Users/avishaji996/workspace/RHI_PDF/src/main/resources/images/star-2.png", document);
            contentStream1.drawImage(pdImage, 198, 192);
            pdImage = PDImageXObject.createFromFile("C:/Users/avishaji996/workspace/RHI_PDF/src/main/resources/images/star-3.png", document);
            contentStream1.drawImage(pdImage, 333, 192);
            pdImage = PDImageXObject.createFromFile("C:/Users/avishaji996/workspace/RHI_PDF/src/main/resources/images/star-4.png", document);
            contentStream1.drawImage(pdImage, 468, 192);

            contentStream1.beginText();
            contentStream1.setFont(font1, 24);
            contentStream1.setNonStrokingColor(245,62,91);
            contentStream1.newLineAtOffset(477, 230);
            //contentStream1.setCharacterSpacing(5.0f);
            contentStream1.showText(metabolicRate.toString()+"%");
            contentStream1.endText();

            pdImage = PDImageXObject.createFromFile("C:/Users/avishaji996/workspace/RHI_PDF/src/main/resources/images/BMIunit.png", document);
            contentStream1.drawImage(pdImage, 36,36);
            destBmi.setPage(document.getPage(6));
            destBmi.setZoom(1);
            destBmi.setTop(new Float(page7.getMediaBox().getHeight()).intValue());
            bmiAction.setDestination(destBmi);
            bmiLink.setAction(bmiAction);
            bmiRect.setLowerLeftX(36);
            bmiRect.setLowerLeftY(36);
            bmiRect.setUpperRightX(559);
            bmiRect.setUpperRightY(113);
            bmiLink.setRectangle(bmiRect);
            bmiLink.setBorderStyle(borderULine);
            page1.getAnnotations().add(bmiLink);


            contentStream1.beginText();
            contentStream1.setFont(font1, 24);
            contentStream1.setNonStrokingColor(77,77,79);
            contentStream1.newLineAtOffset(140, 56);
            //contentStream1.setCharacterSpacing(5.0f);
            contentStream1.showText(bmi.toString());
            contentStream1.endText();

            contentStream1.close();
            /*End: Page 1 formatting*/

            /*contentStream2.setNonStrokingColor(239,62,91);
            contentStream2.addRect(0, 0, 595, 842);
            contentStream2.fill();*/

            /*Start: Page 2 formatting*/
            moveTopImage = PDImageXObject.createFromFile("C:/Users/avishaji996/workspace/RHI_PDF/src/main/resources/images/movetop.png", document);

            pdImage = PDImageXObject.createFromFile("C:/Users/avishaji996/workspace/RHI_PDF/src/main/resources/images/inside pages.png", document);
            contentStream2.drawImage(pdImage, 0,0);
            contentStream2.drawImage(moveTopImage, 543,35);
            page2.getAnnotations().add(moveupLink);

            contentStream2.beginText();
            contentStream2.setFont(font1, 24);
            contentStream2.setNonStrokingColor(239,64,91);
            //contentStream2.setNonStrokingColor(Color.black);
            contentStream2.newLineAtOffset(400, 450);
            //contentStream1.setCharacterSpacing(5.0f);
            contentStream2.showText(bodyAge.toString()+"yrs");
            contentStream2.endText();

            contentStream2.beginText();
            contentStream2.setFont(font1, 30);
            contentStream2.setNonStrokingColor(Color.WHITE);
            //contentStream2.setNonStrokingColor(Color.black);
            contentStream2.newLineAtOffset(268, 366);
            //contentStream1.setCharacterSpacing(5.0f);
            contentStream2.showText("Body Age");
            contentStream2.endText();

            contentStream2.beginText();
            contentStream2.newLineAtOffset(268, 342);
            contentStream2.setFont(font2, 16);
            contentStream2.setLeading(24);
            //contentStream2.setNonStrokingColor(Color.black);
            contentStream2.showText("Body age is calculated by using the");
            contentStream2.newLine();
            contentStream2.showText("weight and body fat percentage. It can");
            contentStream2.newLine();
            contentStream2.showText("be used to judge whether the body");
            contentStream2.newLine();
            contentStream2.showText("age is above or below the actual age.");
            contentStream2.newLine();
            contentStream2.showText("Body age varies according to body");
            contentStream2.newLine();
            contentStream2.showText("composition and metabolism, even if the");
            contentStream2.newLine();
            contentStream2.showText("height and weight is the optimal.");
            contentStream2.newLine();
            contentStream2.showText("This is an interesting data point for one");
            contentStream2.newLine();
            contentStream2.showText("to bring in a check on lifestyle, diet and");
            contentStream2.newLine();
            contentStream2.showText("physical activities. After all it is always");
            contentStream2.newLine();
            contentStream2.showText("desirable to stay forever young, both in");
            contentStream2.newLine();
            contentStream2.showText("our mind and body.");
            contentStream2.endText();

            contentStream2.close();
            /*End: Page 2 formatting*/

            /*Start: Page 3 formatting*/
            //Changed to jpg by Avisha
            pdImage = PDImageXObject.createFromFile("C:/Users/avishaji996/workspace/RHI_PDF/src/main/resources/images/inside pages2.jpg", document);
            contentStream3.drawImage(pdImage, 0,0);
            contentStream3.drawImage(moveTopImage, 543,50);
            PDRectangle moveupRectPage3 = new PDRectangle();
            moveupRectPage3.setLowerLeftX(543);
            moveupRectPage3.setLowerLeftY(50);
            moveupRectPage3.setUpperRightX(586);
            moveupRectPage3.setUpperRightY(93);
            moveupLinkPage3.setRectangle(moveupRectPage3);
            page3.getAnnotations().add(moveupLinkPage3);

            //Changed Content by Avisha:start
            contentStream3.beginText();
            contentStream3.setFont(font1, 28);
            contentStream3.setNonStrokingColor(Color.WHITE);
            //contentStream3.setNonStrokingColor(Color.black);
            contentStream3.newLineAtOffset(64, 738);
            //contentStream1.setCharacterSpacing(5.0f);
            contentStream3.showText("Body Fat");
            contentStream3.endText();

            contentStream3.beginText();
            contentStream3.newLineAtOffset(64, 713);
            contentStream3.setFont(font2, 14);
            contentStream3.setLeading(16);
            //contentStream3.setNonStrokingColor(Color.black);
            contentStream3.showText("Body fat percentage is the amount of fat compared");
            contentStream3.newLine();
            contentStream3.showText("to the total body weight. It plays a vital role in storing");
            contentStream3.newLine();
            contentStream3.showText("energy and protecting internal organs. While too much");
            contentStream3.newLine();
            contentStream3.showText("body fat may be unhealthy, having too little fat can be");
            contentStream3.newLine();
            contentStream3.showText("just as bad. Also, the distrbution of body fat in men");
            contentStream3.newLine();
            contentStream3.showText("and women is different.");


            contentStream3.setLeading(22);
            contentStream3.newLine();
            contentStream3.showText("There are some known and unknown effects");
            contentStream3.setLeading(16);
            contentStream3.newLine();
            contentStream3.showText("of high and low body. One generally faces");
            contentStream3.newLine();
            contentStream3.showText("One generally faces problems like breathing");
            contentStream3.newLine();
            contentStream3.showText("difficulties, arthritis and heart disease with");
            contentStream3.newLine();
            contentStream3.showText("high body fat. While in case of low body fat");
            contentStream3.newLine();
            contentStream3.showText("our body is prone to serious heart problems,");
            contentStream3.newLine();
            contentStream3.showText("low energy levels, feeling cold, tired muscle,");
            contentStream3.newLine();
            contentStream3.showText("lusterless skin, brittle bones and frequent");
            contentStream3.newLine();
            contentStream3.showText("illness including heart ailments.");

            contentStream3.setLeading(22);
            contentStream3.newLine();
            contentStream3.showText("Body fat can be managed through");
            contentStream3.setLeading(16);
            contentStream3.newLine();
            contentStream3.showText("low calorie meals with lean proteins");
            contentStream3.newLine();
            contentStream3.showText("like fish and egg. Fruits and leafy");
            contentStream3.newLine();
            contentStream3.showText("vegetables are good but");
            contentStream3.newLine();
            contentStream3.showText("grains like dal etc. are");
            contentStream3.newLine();
            contentStream3.showText("avoidable. Make water");
            contentStream3.newLine();
            contentStream3.showText("your number one drink.");
            contentStream3.newLine();
            contentStream3.showText("Eat fermented foods,");
            contentStream3.newLine();
            contentStream3.showText("avoid added sugars");
            contentStream3.newLine();
            contentStream3.showText("and artificial sweeteners.");
            contentStream3.endText();

            contentStream3.beginText();
            contentStream3.setFont(font1, 24);
            contentStream3.setNonStrokingColor(245,62,91);
            //contentStream3.setNonStrokingColor(Color.black);
            contentStream3.newLineAtOffset(265, 340);
            contentStream3.showText(bodyFat.toString()+"%");
            contentStream3.endText();

            contentStream3.beginText();
            contentStream3.newLineAtOffset(64, 30);
            contentStream3.setFont(font2, 10);
            contentStream3.setNonStrokingColor(Color.WHITE);
            contentStream3.showText("Source:");
            contentStream3.endText();
            contentStream3.beginText();
            contentStream3.setNonStrokingColor(3,78,162);
            contentStream3.newLineAtOffset(90,30);
            float textWidth = (font2.getStringWidth("https://www.manualslib.com/manual/799747/Omron-Hbf-375.html?page=2#manual ") / 1000) * 10;
            contentStream3.showText("   https://www.manualslib.com/manual/799747/Omron-Hbf-375.html?page=2#manual");
            positionPage3.setLowerLeftX(97);
            positionPage3.setLowerLeftY(30);
            positionPage3.setUpperRightX(97 + textWidth);
            positionPage3.setUpperRightY(40);
            txtLinkPage3.setRectangle(positionPage3);
            txtLinkPage3.setBorderStyle(borderULine);
            actionPage3.setURI("https://www.manualslib.com/manual/799747/Omron-Hbf-375.html?page=2#manual");
            txtLinkPage3.setAction(actionPage3);
            page3.getAnnotations().add(txtLinkPage3);
            contentStream3.endText();
            //Changed by Avisha: End

            contentStream3.close();
            /*End: Page 3 formatting*/

            /*Start: Page 4 formatting*/
            pdImage = PDImageXObject.createFromFile("C:/Users/avishaji996/workspace/RHI_PDF/src/main/resources/images/inside pages3.png", document);
            contentStream4.drawImage(pdImage, 0,0);
            contentStream4.drawImage(moveTopImage, 543,35);
            page4.getAnnotations().add(moveupLink);

            contentStream4.beginText();
            contentStream4.setFont(font1, 30);
            contentStream4.setNonStrokingColor(Color.WHITE);
            contentStream4.newLineAtOffset(228, 721);
            contentStream4.showText("Visceral Fat");
            contentStream4.endText();

            List<String> lines = new ArrayList<String>();
            lines.add("Visceral fat is found in the abdomen and surrounding vital organs. This fat is not");
            lines.add("visible to our naked eyes. Therefore, one of the techniques used to detect visceral");
            lines.add("fat is through Magnetic Resonance Imaging(MRI). Hence, this has little to do with");
            lines.add("your body weight, you can be a person of lean built but can have high level of");
            PDRectangle mediabox = page4.getMediaBox();
            float margin = 64;
            float width = mediabox.getWidth() - 2*margin;
            int i= 0;

            contentStream4.setFont(font2, 14);
            for (String line: lines)
            {
                float charSpacing = 0;
                float size = 14 * font2.getStringWidth(line) / 1000;
                float free = width - size;
                charSpacing = free / (line.length() - 1);
                contentStream4.beginText();
                contentStream4.setCharacterSpacing(charSpacing);
                float y = (float) (695-(16.8*i));
                contentStream4.newLineAtOffset(64, y);
                contentStream4.showText(line);
                contentStream4.endText();
                ++i;
            }

            contentStream4.setCharacterSpacing(0);
            contentStream4.beginText();
            contentStream4.newLineAtOffset(64, 627.8f);
            contentStream4.setFont(font2, 14);
            contentStream4.showText("Visceral fat.");
            contentStream4.endText();

            String line = "Too much visceral fat may lead to high cholesterol, heart disease and type 2 diabetes";
            float charSpacing = 0;
            float size = 14 * font2.getStringWidth(line) / 1000;
            float free = width - size;
            charSpacing = free / (line.length() - 1);
            contentStream4.beginText();
            contentStream4.setCharacterSpacing(charSpacing);
            contentStream4.newLineAtOffset(64, 605.8f);
            contentStream4.showText(line);
            contentStream4.setLeading(16.8);
            contentStream4.newLine();
            contentStream4.showText("raised blood pressure, stroke, breast, colorectal cancer and alzheimer’s disease.");
            contentStream4.endText();
            contentStream4.beginText();
            line = "Keeping a watch on our diet and lifestyle along with a few Cardio exercises and";
            size = 14 * font2.getStringWidth(line) / 1000;
            free = width - size;
            charSpacing = free / (line.length() - 1);
            contentStream4.setCharacterSpacing(charSpacing);
            contentStream4.newLineAtOffset(64, 567);
            contentStream4.showText(line);
            contentStream4.setLeading(16.8);
            contentStream4.newLine();
            contentStream4.showText("reduced stress can help in managing visceral fat.");
            contentStream4.endText();
            //Changed by Avisha: End

            contentStream4.beginText();
            contentStream4.setFont(font1, 24);
            contentStream4.setNonStrokingColor(245,62,91);
            //contentStream4.setNonStrokingColor(Color.black);
            contentStream4.newLineAtOffset(420, 220);
            contentStream4.showText(visceralFat.toString());
            contentStream4.endText();

            //Changed by Avisha: Start
            contentStream4.beginText();
            contentStream4.newLineAtOffset(64, 345);
            contentStream4.setFont(font2, 10);
            contentStream4.setNonStrokingColor(Color.WHITE);
            contentStream4.showText("Source:");
            contentStream4.endText();
            contentStream4.beginText();
            contentStream4.setNonStrokingColor(3,78,162);
            contentStream4.newLineAtOffset(90,345);
            textWidth = (font2.getStringWidth("https://www.manualslib.com/manual/799747/Omron-Hbf-375.html?page=2#manual") / 1000) * 10;
            contentStream4.showText("   https://www.manualslib.com/manual/799747/Omron-Hbf-375.html?page=2#manual");
            positionPage4.setLowerLeftX(97);
            positionPage4.setLowerLeftY(345);
            positionPage4.setUpperRightX(97 + textWidth);
            positionPage4.setUpperRightY(355);
            txtLinkPage4.setRectangle(positionPage4);
            txtLinkPage4.setBorderStyle(borderULine);
            actionPage4.setURI("https://www.manualslib.com/manual/799747/Omron-Hbf-375.html?page=2#manual");
            txtLinkPage4.setAction(actionPage4);
            page4.getAnnotations().add(txtLinkPage4);
            contentStream4.endText();
            contentStream4.beginText();
            contentStream4.newLineAtOffset(64, 333);
            contentStream4.setFont(font2, 10);
            contentStream4.setNonStrokingColor(Color.WHITE);
            contentStream4.showText("NOTE: Visceral fat levels are relative and not absolute values");
            contentStream4.endText();
            //Changed by Avisha: End

            contentStream4.close();
            /*End: Page 4 formatting*/

            /*Start: Page 5 formatting*/
            //Changed to jpg by Avisha
            pdImage = PDImageXObject.createFromFile("C:/Users/avishaji996/workspace/RHI_PDF/src/main/resources/images/inside pages4.jpg", document);
            contentStream5.drawImage(pdImage, 0,0);
            contentStream5.drawImage(moveTopImage, 543,35);
            page5.getAnnotations().add(moveupLink);

            contentStream5.beginText();
            contentStream5.setFont(font1, 30);
            contentStream5.setNonStrokingColor(Color.WHITE);
            contentStream5.newLineAtOffset(274, 682);
            contentStream5.showText("Blood Pressure");
            contentStream5.setFont(font2, 16);
            contentStream5.setLeading(24);
            contentStream5.newLine();
            contentStream5.showText("Blood pressure usually is regarded as");
            contentStream5.newLine();
            contentStream5.showText("a lifestyle disease. It is also commonly");
            contentStream5.newLine();
            contentStream5.showText("known as Hypertension.");
            contentStream5.newLine();
            contentStream5.showText("High blood pressure causes several");
            contentStream5.newLine();
            contentStream5.showText("adverse effects like stroke by damaging");
            contentStream5.newLine();
            contentStream5.showText("and weakening your brain's blood");
            contentStream5.newLine();
            contentStream5.showText("vessels, blood clots, dementia. Low");
            contentStream5.newLine();
            contentStream5.showText("blood pressure may sometimes lead to");
            contentStream5.newLine();
            contentStream5.showText("blurred vision, dizziness, palpitation and");
            contentStream5.newLine();
            contentStream5.showText("nausea.");
            contentStream5.newLine();
            contentStream5.showText("It may be a good idea to get that little");
            contentStream5.newLine();
            contentStream5.showText("extra stress off your life and indulge in");
            contentStream5.newLine();
            contentStream5.showText("good diet along with physical activities.");
            contentStream5.endText();

            contentStream5.beginText();
            contentStream5.setFont(font1, 24);
            contentStream5.setNonStrokingColor(245,62,91);
            //contentStream5.setNonStrokingColor(Color.black);
            contentStream5.newLineAtOffset(40, 560);//Changed by Avisha
            contentStream5.showText(bloodPressure.toString());//Changed by Avisha
            contentStream5.endText();

            //Changed by Avisha: Start
            contentStream5.beginText();
            contentStream5.newLineAtOffset(62, 60);
            contentStream5.setFont(font2, 10);
            contentStream5.setNonStrokingColor(Color.WHITE);
            contentStream5.showText("Source:");
            contentStream5.endText();
            contentStream5.beginText();
            contentStream5.setFont(font2, 8);
            contentStream5.setNonStrokingColor(3,78,162);
            contentStream5.newLineAtOffset(62,48);
            contentStream5.setLeading(9.6);
            contentStream5.showText("1. American Heart association https://www.heart.org/en/health-topics/high-blood-pressure/understanding-blood-pressure-readings");
            textWidth = (font2.getStringWidth("https://www.heart.org/en/health-topics/high-blood-pressure/understanding-blood-pressure-readings") / 1000) * 8;
            positionPage5_1.setLowerLeftX(163);
            positionPage5_1.setLowerLeftY(48);
            positionPage5_1.setUpperRightX(163 + textWidth);
            positionPage5_1.setUpperRightY(56);
            txtLinkPage5_1.setRectangle(positionPage5_1);
            txtLinkPage5_1.setBorderStyle(borderULine);
            actionPage5_1.setURI("https://www.heart.org/en/health-topics/high-blood-pressure/understanding-blood-pressure-readings");
            txtLinkPage5_1.setAction(actionPage5_1);
            page5.getAnnotations().add(txtLinkPage5_1);
            contentStream5.newLine();
            contentStream5.showText("2. American Heart association https://www.heart.org/en/health-topics/high-blood-pressure/health-threats-from-high-blood-pressure");
            textWidth = (font2.getStringWidth("https://www.heart.org/en/health-topics/high-blood-pressure/health-threats-from-high-blood-pressure") / 1000) * 8;
            positionPage5_2.setLowerLeftX(164);
            positionPage5_2.setLowerLeftY(38.4f);
            positionPage5_2.setUpperRightX(164 + textWidth);
            positionPage5_2.setUpperRightY(46.4f);
            txtLinkPage5_2.setRectangle(positionPage5_2);
            txtLinkPage5_2.setBorderStyle(borderULine);
            actionPage5_2.setURI("https://www.heart.org/en/health-topics/high-blood-pressure/health-threats-from-high-blood-pressure");
            txtLinkPage5_2.setAction(actionPage5_2);
            page5.getAnnotations().add(txtLinkPage5_2);
            contentStream5.newLine();
            contentStream5.showText("3. Agency for Health Care Administration , Florida- http://www.guidewellemergency.com/hypertensive-and-hypotensive-cri-");
            float extraTextWidth = (font2.getStringWidth("3. Agency for Health Care Administration , Florida- ") / 1000) * 8;
            textWidth = (font2.getStringWidth("http://www.guidewellemergency.com/hypertensive-and-hypotensive-cri-") / 1000) * 8;
            positionPage5_3.setLowerLeftX(62+extraTextWidth);
            positionPage5_3.setLowerLeftY(28.8f);
            positionPage5_3.setUpperRightX(62+extraTextWidth+ textWidth);
            positionPage5_3.setUpperRightY(36.8f);
            txtLinkPage5_3.setRectangle(positionPage5_3);
            txtLinkPage5_3.setBorderStyle(borderULine);
            actionPage5_3.setURI("http://www.guidewellemergency.com/hypertensive-and-hypotensive-crises-what-you-should-know");
            txtLinkPage5_3.setAction(actionPage5_3);
            page5.getAnnotations().add(txtLinkPage5_3);
            contentStream5.newLine();
            contentStream5.showText("ses-what-you-should-know");
            textWidth = (font2.getStringWidth("ses-what-you-should-know") / 1000) * 8;
            positionPage5_4.setLowerLeftX(62);
            positionPage5_4.setLowerLeftY(19.2f);
            positionPage5_4.setUpperRightX(62 + textWidth);
            positionPage5_4.setUpperRightY(27.2f);
            txtLinkPage5_4.setRectangle(positionPage5_4);
            txtLinkPage5_4.setBorderStyle(borderULine);
            actionPage5_4.setURI("http://www.guidewellemergency.com/hypertensive-and-hypotensive-crises-what-you-should-know");
            txtLinkPage5_4.setAction(actionPage5_4);
            page5.getAnnotations().add(txtLinkPage5_4);
            contentStream5.endText();
            //Changed by Avisha: End

            contentStream5.close();
            /*End: Page 5 formatting*/

            /*Start: Page 6 formatting*/
            pdImage = PDImageXObject.createFromFile("C:/Users/avishaji996/workspace/RHI_PDF/src/main/resources/images/inside pages5.png", document);
            contentStream6.drawImage(pdImage, 0,0);
            contentStream6.drawImage(moveTopImage, 543,35);
            page6.getAnnotations().add(moveupLink);

            contentStream6.beginText();
            contentStream6.setFont(font1, 30);
            contentStream6.setNonStrokingColor(Color.WHITE);
            contentStream6.newLineAtOffset(64, 458);
            contentStream6.showText("Resting Metabolism");
            contentStream6.endText();

            contentStream6.beginText();
            contentStream6.setFont(font2, 16);
            contentStream6.setNonStrokingColor(Color.WHITE);
            contentStream6.newLineAtOffset(64,423);
            contentStream6.setLeading(28);
            contentStream6.showText("Resting metabolism is the minimal level of energy");
            contentStream6.newLine();
            contentStream6.showText("required by our body to function while we are resting or");
            contentStream6.newLine();
            contentStream6.showText("asleep. It differs for individuals depending on variables");
            contentStream6.newLine();
            contentStream6.showText("such as age, weight, body composition, and energy");
            contentStream6.newLine();
            contentStream6.showText("burning. Interestingly, 60-70% of our daily energy used");
            contentStream6.newLine();
            contentStream6.showText("is for resting metabolism");
            contentStream6.endText();

            contentStream6.beginText();
            contentStream6.setFont(font1, 24);
            contentStream6.setNonStrokingColor(245,62,91);
            //contentStream6.setNonStrokingColor(Color.black);
            contentStream6.newLineAtOffset(115, 190);
            contentStream6.showText(metabolicRate.toString()+"%");
            contentStream6.endText();

            contentStream6.close();
            /*End: Page 6 formatting*/

            /*Start: Page 7 formatting*/
            //Changed to jpg by Avisha
            pdImage = PDImageXObject.createFromFile("C:/Users/avishaji996/workspace/RHI_PDF/src/main/resources/images/inside pages6.jpg", document);
            contentStream7.drawImage(pdImage, 0,0);
            contentStream7.drawImage(moveTopImage, 543,35);
            page7.getAnnotations().add(moveupLink);

            //Changed text coordinates by Avisha:Start
            contentStream7.beginText();
            contentStream7.setFont(font1, 26);
            contentStream7.setNonStrokingColor(Color.WHITE);
            contentStream7.newLineAtOffset(140, 728);
            contentStream7.showText("BMI");
            contentStream7.endText();

            contentStream7.beginText();
            contentStream7.setFont(font2, 26);
            contentStream7.newLineAtOffset(190, 728);
            contentStream7.showText("means Body Mass Index");
            contentStream7.endText();

            String page7line1 = "It is a renowned method that considers our height and weight for measuring";
            mediabox = page7.getMediaBox();
            size = 14 * font2.getStringWidth(page7line1) / 1000;
            free = width - size;
            charSpacing = free / (page7line1.length() - 1);
            contentStream7.beginText();
            contentStream7.setFont(font2, 14);
            contentStream7.setCharacterSpacing(charSpacing);
            contentStream7.newLineAtOffset(64, 701);
            contentStream7.showText(page7line1);
            contentStream7.endText();
            contentStream7.beginText();
            contentStream7.newLineAtOffset(64, 687);
            contentStream7.setCharacterSpacing(0);
            contentStream7.showText("obesity. It is a very easy and user-friendly technique. Ideal BMI is 22.");
            contentStream7.endText();


            lines = new ArrayList<String>();
            lines.add("When our BMI is high, it leads to several other risks like High blood pressure");
            lines.add("(hypertension), High LDL cholesterol (“bad” cholesterol), Low HDL cholesterol");

            i=0;
            for (String page8line: lines)
            {
                size = 14 * font2.getStringWidth(page8line) / 1000;
                free = width - size;
                charSpacing = free / (page8line.length() - 1);
                contentStream7.beginText();
                contentStream7.setCharacterSpacing(charSpacing);
                float y = (float) (417-(14*i));
                contentStream7.newLineAtOffset(64, y);
                contentStream7.showText(page8line);
                contentStream7.endText();
                ++i;
            }


            contentStream7.beginText();
            contentStream7.newLineAtOffset(64,389);//Changed by Avisha
            contentStream7.showText("(\"good\" cholesterol), High triglycerides, High blood glucose (sugar), etc.");
            contentStream7.endText();

            lines = new ArrayList<String>();
            lines.add("However, there are ways to lessen these risks by doing some simple things like");
            lines.add("eat leafy vegetables, fruits, whole grains, and fat-free or low-fat dairy products,");
            lines.add("include lean meats, poultry, fish, beans, eggs, and nuts, limit saturated and trans");

            i=0;
            for (String page8line: lines)
            {
                size = 14 * font2.getStringWidth(page8line) / 1000;
                free = width - size;
                charSpacing = free / (page8line.length() - 1);
                contentStream7.beginText();
                contentStream7.setCharacterSpacing(charSpacing);
                float y = (float) (375-(14*i));
                contentStream7.newLineAtOffset(64, y);
                contentStream7.showText(page8line);
                contentStream7.endText();
                ++i;
            }

            contentStream7.beginText();
            contentStream7.setCharacterSpacing(0);
            contentStream7.newLineAtOffset(64, 333);
            contentStream7.showText("fats, sodium, and added sugars, control portion sizes.");
            contentStream7.endText();

            contentStream7.beginText();
            contentStream7.setFont(font1, 24);
            contentStream7.setNonStrokingColor(245,62,91);
            //contentStream7.setNonStrokingColor(Color.black);
            contentStream7.newLineAtOffset(430, 225);//Changed by Avisha
            contentStream7.showText(bmi.toString());
            contentStream7.endText();

            contentStream7.beginText();
            contentStream7.newLineAtOffset(64, 464);
            contentStream7.setFont(font2, 10);
            contentStream7.setNonStrokingColor(Color.WHITE);
            contentStream7.showText("Source:");
            contentStream7.setNonStrokingColor(3,78,162);
            contentStream7.showText("  https://www.manualslib.com/manual/799747/Omron-Hbf-375.html?page=2#manual ");
            extraTextWidth = (font2.getStringWidth("Source:  ") / 1000) * 10;
            textWidth = (font2.getStringWidth("https://www.manualslib.com/manual/799747/Omron-Hbf-375.html?page=2#manual ") / 1000) * 10;
            positionPage7_1.setLowerLeftX(64+extraTextWidth);
            positionPage7_1.setLowerLeftY(464);
            positionPage7_1.setUpperRightX(64+extraTextWidth+ textWidth);
            positionPage7_1.setUpperRightY(474);
            txtLinkPage7_1.setRectangle(positionPage7_1);
            txtLinkPage7_1.setBorderStyle(borderULine);
            actionPage7_1.setURI("https://www.manualslib.com/manual/799747/Omron-Hbf-375.html?page=2#manual");
            txtLinkPage7_1.setAction(actionPage7_1);
            page7.getAnnotations().add(txtLinkPage7_1);
            contentStream7.setNonStrokingColor(Color.WHITE);
            contentStream7.setLeading(12);
            contentStream7.newLine();
            contentStream7.showText("The above-mentioned indices refer to the values for obesity judgment proposed by the WHO, the ");
            contentStream7.newLine();
            contentStream7.showText("World Health Organization.");
            contentStream7.endText();
            //Changed text coordinates by Avisha: End

            contentStream7.beginText();
            contentStream7.newLineAtOffset(36, 90);
            contentStream7.setFont(font1, 8);
            contentStream7.setNonStrokingColor(Color.WHITE);
            contentStream7.showText("Disclaimner:");
            contentStream7.setFont(font2,8);
            contentStream7.showText("     Reliance Health Insurance Limited makes no endorsements, representations or warranties of any kind with regards to the information displayed");
            contentStream7.setLeading(9.6);
            contentStream7.newLine();
            contentStream7.showText("in this document. The information presented is not intended to match or replace that from medical or scientific measurement devices and shall not constitute");
            contentStream7.endText();
            String str = "medical advice. Reliance Health Insurance Limited disclaims all liability with regards to the accuracy, reliability and/or use of the information.";
            int fontSize = 8;
            PDRectangle mediaBox = page7.getMediaBox();
            float lineWidth = font2.getStringWidth(str) / 1000 * fontSize;
            float startX = (mediaBox.getWidth() - lineWidth) / 2;
            float startY = 70.8f;

            contentStream7.beginText();
            contentStream7.setFont(font2, fontSize);
            contentStream7.newLineAtOffset(startX, startY);
            contentStream7.showText(str);
            contentStream7.endText();
            contentStream7.beginText();
            contentStream7.setFont(font1,fontSize);
            contentStream7.newLineAtOffset(startX+20,53.0f);
            contentStream7.showText("Registered address:");
            contentStream7.setFont(font2,fontSize);
            contentStream7.showText("   Reliance Center, 2nd Floor, North Wing, Off Western Express Highway, Santacruz (East), Mumbai – 400 055");
            contentStream7.endText();
            contentStream7.beginText();
            contentStream7.setFont(font1,fontSize);
            contentStream7.newLineAtOffset(startX+16, 43.4f);
            contentStream7.showText("Customer care: ");
            contentStream7.setFont(font1, fontSize);
            contentStream7.showText("022-33426868");
            contentStream7.setFont(font2, fontSize);
            contentStream7.showText(", Email ID: ");
            contentStream7.setFont(font1, fontSize);
            contentStream7.showText("reliancehealth.service@relanceada.com");
            extraTextWidth = (font2.getStringWidth("Customer care: 022-33426868, Email ID:") / 1000) * 8;
            textWidth = (font2.getStringWidth("reliancehealth.service@relanceada.com    ") / 1000) * 8;
            positionPage7_2.setLowerLeftX(startX+22+extraTextWidth);
            positionPage7_2.setLowerLeftY(43.4f);
            positionPage7_2.setUpperRightX(startX+22+extraTextWidth+ textWidth);
            positionPage7_2.setUpperRightY(51.4f);
            txtLinkPage7_2.setRectangle(positionPage7_2);
            txtLinkPage7_2.setBorderStyle(borderULine);
            actionPage7_2.setURI("mailto:reliancehealth.service@relanceada.com");
            txtLinkPage7_2.setAction(actionPage7_2);
            page7.getAnnotations().add(txtLinkPage7_2);
            contentStream7.setFont(font2, fontSize);
            contentStream7.showText(" Website: ");
            contentStream7.setFont(font1, fontSize);
            contentStream7.showText("www.reliancehealthinsurance.com");
            extraTextWidth = (font2.getStringWidth("Customer care: 022-33426868, Email ID: reliancehealth.service@relanceada.com Website:  ") / 1000) * 8;
            textWidth = (font2.getStringWidth("www.reliancehealthinsurance.com   ") / 1000) * 8;
            positionPage7_3.setLowerLeftX(startX+24+extraTextWidth);
            positionPage7_3.setLowerLeftY(43.4f);
            positionPage7_3.setUpperRightX(startX+24+extraTextWidth+ textWidth);
            positionPage7_3.setUpperRightY(51.4f);
            txtLinkPage7_3.setRectangle(positionPage7_3);
            txtLinkPage7_3.setBorderStyle(borderULine);
            actionPage7_3.setURI("www.reliancehealthinsurance.com");
            txtLinkPage7_3.setAction(actionPage7_3);
            page7.getAnnotations().add(txtLinkPage7_3);
            contentStream7.endText();

            str = "Trade Logo displayed above belongs to Anil Dhirubhai Ambani Ventures Private Limited and used by Reliance Health Insurance under License.";

            lineWidth = font2.getStringWidth(str) / 1000 * fontSize;
            startX = (mediaBox.getWidth() - lineWidth) / 2;
            startY = 25.6f;

            contentStream7.beginText();
            contentStream7.setFont(font2, fontSize);
            contentStream7.newLineAtOffset(startX, startY);
            contentStream7.showText(str);
            contentStream7.endText();
            str = "Reliance Health Insurance Limited, CIN- U66000MH2017PLC294682, IRDAI Regn. No. XXXXX";

            lineWidth = font2.getStringWidth(str) / 1000 * fontSize;
            startX = (mediaBox.getWidth() - lineWidth) / 2;
            startY = 16.0f;

            contentStream7.beginText();
            contentStream7.setFont(font2, fontSize);
            contentStream7.newLineAtOffset(startX, startY);
            contentStream7.showText(str);
            contentStream7.endText();


            contentStream7.close();
            /*End: Page 7 formatting*/


            //New Page by Avisha
            pdImage = PDImageXObject.createFromFile("C:/Users/avishaji996/workspace/RHI_PDF/src/main/resources/images/Blank_last_page.jpg", document);
            contentStream8.drawImage(pdImage, 0,0);
            contentStream8.drawImage(moveTopImage, 543,35);
            page8.getAnnotations().add(moveupLink);

            contentStream8.beginText();
            contentStream8.setFont(font1, 38);
            contentStream8.setNonStrokingColor(Color.WHITE);
            contentStream8.newLineAtOffset(42, 606);
            contentStream8.showText("Hello from");
            contentStream8.endText();

            contentStream8.beginText();
            contentStream8.setFont(font1, 38);
            contentStream8.setNonStrokingColor(Color.WHITE);
            contentStream8.newLineAtOffset(42, 566);
            contentStream8.showText("Reliance Health Insurance!");
            contentStream8.endText();

            lines = new ArrayList<String>();
            lines.add("Health-related issues can arise");
            lines.add("without any warnings. At such times,");
            lines.add("health insurance ensures that your");
            lines.add("health remains your wealth. But why");
            lines.add("choose an ordinary health insurance");
            lines.add("when Reliance Health Insurance gives");
            lines.add("you more? Paperless, future-ready");
            lines.add("and affordable, we customise your");
            mediabox = page8.getMediaBox();
            margin = 42;
            width = mediabox.getWidth() - margin - 290;
            i= 0;

            contentStream8.setFont(font2, 16);
            for (String page8line: lines)
            {
                charSpacing = 0;
                size = 16 * font2.getStringWidth(page8line) / 1000;
                free = width - size;
                charSpacing = free / (page8line.length() - 1);
                contentStream8.beginText();
                contentStream8.setCharacterSpacing(charSpacing);
                float y = (float) (522-(20*i));
                contentStream8.newLineAtOffset(42, y);
                contentStream8.showText(page8line);
                contentStream8.endText();
                ++i;
            }

            contentStream8.beginText();
            contentStream8.setFont(font2, 16);
            contentStream8.newLineAtOffset(42,362);
            contentStream8.showText("policy as per your needs.");
            contentStream8.endText();


            lines = new ArrayList<String>();
            lines.add("Reliance Health Insurance is EASY TO");
            lines.add("CHOOSE, EASY TO BUY, AND EASY TO");
            mediabox = page8.getMediaBox();

            i=0;

            for (String page8line: lines)
            {
                charSpacing = 0;
                size = 16 * font2.getStringWidth(page8line) / 1000;
                free = width - size;
                charSpacing = free / (page8line.length() - 1);
                contentStream8.beginText();
                contentStream8.setCharacterSpacing(charSpacing);
                float y = (float) (320-(20*i));
                contentStream8.newLineAtOffset(42, y);
                contentStream8.showText(page8line);
                contentStream8.endText();
                ++i;
            }

            contentStream8.beginText();
            contentStream8.setFont(font2, 16);
            contentStream8.newLineAtOffset(42,280);
            contentStream8.showText("USE.");
            contentStream8.endText();


            line="Protect yourself now with a plan just right";
            size = 16 * font2.getStringWidth(line) / 1000;
            free = width - size;
            charSpacing = free / (line.length() - 1);
            contentStream8.beginText();
            contentStream8.setCharacterSpacing(charSpacing);

            contentStream8.newLineAtOffset(42, 238);
            contentStream8.showText(line);
            contentStream8.setLeading(20);
            contentStream8.newLine();
            contentStream8.showText("FOR YOU.");
            contentStream8.setFont(font1, 16);
            contentStream8.setLeading(60);
            contentStream8.newLine();
            contentStream8.showText("TO KNOW MORE");

            contentStream8.setLeading(30);
            contentStream8.newLine();
            contentStream8.showText("     Saumitra Das - 932556695");
            contentStream8.setFont(font2, 16);
            contentStream8.setLeading(20);
            contentStream8.newLine();
            contentStream8.showText("Your Health Manager");
            contentStream8.endText();
            contentStream8.close();


            document.save("RHI_HealthReport.pdf");
            document.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}