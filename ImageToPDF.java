package com.tavant.sample;

import java.io.FileOutputStream;

import com.lowagie.text.Document;
import com.lowagie.text.Image;
import com.lowagie.text.pdf.PdfWriter;

public class ImageToPDF {
	
	public static void main(String args[]){
		
		/*try {
			RandomAccessFileOrArray myTifFile = new RandomAccessFileOrArray("C:/Users/praveen.m/Downloads/nadal.png");
			int numberOfPages = TiffImage.getNumberOfPages(myTifFile);
			Document document = new Document();
			PdfWriter.getInstance(document, new FileOutputStream("C:/Users/praveen.m/Downloads/capturetif.pdf"));
			document.open();
			for(int tiffImageCounter = 1;tiffImageCounter <= numberOfPages;tiffImageCounter++) {
				 Image img = TiffImage.getTiffImage(myTifFile, tiffImageCounter);
				 document.add(img);
			}
			document.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		Document document = new Document();
	    String input = "C:/Users/praveen.m/Downloads/nadal.png"; // .gif and .jpg are ok too!
	    String output = "C:/Users/praveen.m/Downloads/capturepng.pdf";
	    try {
	      FileOutputStream fos = new FileOutputStream(output);
	      PdfWriter writer = PdfWriter.getInstance(document, fos);
		  writer.open1();
	      document.open2();
	      document.add(Image.getInstance(input));
	      document.close();
	      writer.close();
	    }
	    catch (Exception e) {
	      e.printStackTrace();
	    }
	}

}
