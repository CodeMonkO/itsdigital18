package main.java.finedine.util.com;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;

import main.java.finedine.constants.com.Constants.Constant;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;

public class GenerateInvoice {

	private BaseFont bfBold;
	private BaseFont bf;
	private int pageNumber = 0;
	private List<String> billList = null;
	private Map map;
	private float netTotal = 0;

	public void Generate(List<String> objectList, String filePath, String fileName, Object object) {
		map = (Map) object;
		billList = objectList;
		StringBuffer stringBuffer = new StringBuffer(fileName);
		stringBuffer.append(Constant.BILLPDFEXTENSTION.getConstantValue());
		String pdfFilename = stringBuffer.toString();
		createPDF(pdfFilename, filePath);

	}

	private void createPDF(String pdfFilename, String filePath) {

		Document doc = new Document();
		PdfWriter docWriter = null;
		initializeFonts();

		try {
			StringBuffer stringBuffer = new StringBuffer(filePath);
			stringBuffer.append(pdfFilename);
			String path = stringBuffer.toString();
			docWriter = PdfWriter.getInstance(doc, new FileOutputStream(path));
			doc.addAuthor("Inceded Minded Machines");
			doc.addCreationDate();
			doc.addProducer();
			doc.addCreator("IM^2");
			doc.addTitle("Restaurant Bill");
			doc.setPageSize(PageSize.LETTER);

			doc.open();
			PdfContentByte cb = docWriter.getDirectContent();

			boolean beginPage = true;
			int y = 0;
			// SIZE OF LIST
			for (int i = 0; i < billList.size(); i = i + 4)
			// for(String str:billList)
			{
				if (beginPage) {
					beginPage = false;
					generateLayout(doc, cb);
					generateHeader(doc, cb);
					y = 615;
				}
				generateDetail(doc, cb, y, billList.get(i), billList.get(i + 1), billList.get(i + 2), billList.get(i + 3));
				y = y - 15;
				if (y < 50) {
					printPageNumber(cb);
					doc.newPage();
					beginPage = true;
				}
			}
			cb.moveTo(20, y + 11);
			cb.lineTo(570, y + 11);
			cb.stroke();
			generateFooter(doc, cb, y, "Total Payable Amount");
			printPageNumber(cb);

		} catch (DocumentException dex) {
			dex.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (doc != null) {
				doc.close();
			}
			if (docWriter != null) {
				docWriter.close();
			}
		}
	}

	private void generateLayout(Document doc, PdfContentByte cb) {

		try {

			cb.setLineWidth(1f);
			cb.rectangle(22, 700, 376, 60);
			cb.moveTo(22, 715);
			cb.lineTo(398, 715);
			cb.moveTo(22, 730);
			cb.lineTo(398, 730);
			cb.moveTo(22, 745);
			cb.lineTo(398, 745);
			cb.moveTo(22, 760);
			cb.lineTo(398, 760);
			cb.moveTo(122, 700);
			cb.lineTo(122, 760);
			cb.stroke();
			// Invoice Header box layout
			cb.rectangle(420, 700, 150, 60);
			cb.moveTo(420, 720);
			cb.lineTo(570, 720);
			cb.moveTo(420, 740);
			cb.lineTo(570, 740);
			cb.moveTo(480, 700);
			cb.lineTo(480, 760);
			cb.stroke();

			// Invoice Header box Text Headings
			createHeadings(cb, 422, 743, "Name");
			createHeadings(cb, 422, 723, "Bill No.");
			createHeadings(cb, 422, 703, "Date");

			// Invoice Detail box layout
			cb.rectangle(20, 50, 550, 600);
			cb.moveTo(20, 630);
			cb.lineTo(570, 630);
			cb.moveTo(50, 50);
			cb.lineTo(50, 650);
			cb.moveTo(250, 50);
			cb.lineTo(250, 650);
			cb.moveTo(290, 50);
			cb.lineTo(290, 650);
			cb.moveTo(350, 50);
			cb.lineTo(350, 650);
			cb.moveTo(450, 50);
			cb.lineTo(450, 650);
			cb.stroke();

			// Invoice Detail box Text Headings
			createHeadings(cb, 22, 633, "Sr No");
			createHeadings(cb, 52, 633, "Item Description");
			createHeadings(cb, 252, 633, "Quantity");
			createHeadings(cb, 292, 633, "Amount");
			createHeadings(cb, 352, 633, "Discount in %");
			createHeadings(cb, 452, 633, "Net Amount");
			// add the images
			/*
			 * Image companyLogo = Image
			 * .getInstance("C:/FineDine/FineDine/WebContent/images/vienna-logo.png"
			 * ); companyLogo.setAbsolutePosition(25, 700);
			 * companyLogo.scalePercent(25); doc.add(companyLogo);
			 */
		}

		/*
		 * catch (DocumentException dex) { dex.printStackTrace(); }
		 */catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	private void generateHeader(Document doc, PdfContentByte cb) {

		try {

			createHeadings(cb, 24, 750, "Restaurant Name");
			createHeadings(cb, 24, 735, "Address Line");
			createHeadings(cb, 24, 720, "City, State - ZipCode");
			createHeadings(cb, 24, 705, "Country");

			createHeadings(cb, 124, 750, map.get(Constant.RESTAURANTNAME.getConstantValue()).toString());
			createHeadings(cb, 124, 735, map.get(Constant.RESTAURANTADDRESS.getConstantValue()).toString());
			createHeadings(cb, 124, 720, map.get(Constant.RESTAURANTCITY.getConstantValue()).toString() + ", " + map.get(Constant.RESTAURANTSTATE.getConstantValue()).toString() + " - " + map.get(Constant.RESTAURANTZIPCODE.getConstantValue()).toString());
			createHeadings(cb, 124, 705, map.get(Constant.RESTAURANTCOUNTRY.getConstantValue()).toString());

			createHeadings(cb, 482, 743, map.get(Constant.RESTAURANTNAME.getConstantValue()).toString()+"'s User");
			createHeadings(cb, 482, 723, CustomUtils.getInstance().currentDate("yyyyMMddHHmmssSSS"));
			createHeadings(cb, 482, 703, CustomUtils.getInstance().currentDate("mm/dd/yyyy"));

		}

		catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	// LIST
	int index = 0;

	private void generateDetail(Document doc, PdfContentByte cb, int y, String itemname, String qty, String price, String discount) {
		DecimalFormat df = new DecimalFormat("0.00");

		try {

			createContent(cb, 25, y, String.valueOf(index + 1), PdfContentByte.ALIGN_LEFT);
			createContent(cb, 52, y, itemname, PdfContentByte.ALIGN_LEFT);
			createContent(cb, 252, y, qty, PdfContentByte.ALIGN_LEFT);
			createContent(cb, 292, y, price, PdfContentByte.ALIGN_LEFT);
			createContent(cb, 352, y, discount, PdfContentByte.ALIGN_LEFT);
			float netAmount = getNetAmount(qty, price, discount);
			createContent(cb, 452, y, Float.toString(netAmount), PdfContentByte.ALIGN_LEFT);
			netTotal = netTotal + netAmount;
			index++;
		}

		catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	private void generateFooter(Document doc, PdfContentByte cb, int y, String itemname) {
		DecimalFormat df = new DecimalFormat("0.00");

		try {
			createContent(cb, 52, y, itemname, PdfContentByte.ALIGN_LEFT);
			createContent(cb, 452, y, Float.toString(netTotal), PdfContentByte.ALIGN_LEFT);
			index++;
		}

		catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	private void createHeadings(PdfContentByte cb, float x, float y, String text) {

		cb.beginText();
		cb.setFontAndSize(bfBold, 8);
		cb.setTextMatrix(x, y);
		cb.showText(text.trim());
		cb.endText();

	}

	private void printPageNumber(PdfContentByte cb) {

		cb.beginText();
		cb.setFontAndSize(bfBold, 8);
		cb.showTextAligned(PdfContentByte.ALIGN_RIGHT, "Page No. " + (pageNumber + 1), 570, 25, 0);
		cb.endText();

		pageNumber++;

	}

	private void createContent(PdfContentByte cb, float x, float y, String text, int align) {

		cb.beginText();
		cb.setFontAndSize(bf, 8);
		cb.showTextAligned(align, text.trim(), x, y, 0);
		cb.endText();

	}

	private void initializeFonts() {

		try {
			bfBold = BaseFont.createFont(BaseFont.HELVETICA_BOLD, BaseFont.CP1252, BaseFont.NOT_EMBEDDED);
			bf = BaseFont.createFont(BaseFont.HELVETICA, BaseFont.CP1252, BaseFont.NOT_EMBEDDED);

		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private float getNetAmount(String qty, String price, String discount) {
		int qtyInt = Integer.parseInt(qty);
		float priceInt = Float.parseFloat(price);
		float discountInt = Float.parseFloat(discount);
		float amount = qtyInt * priceInt;
		amount = amount - (amount * discountInt / 100);
		return amount;
	}

}