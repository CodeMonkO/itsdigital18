package main.java.finedine.util.com;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class MailTemplateReader {

	public static void main(String[] args) throws IOException {

		String pdfFilename = "OutPut.pdf";
		MailTemplateReader printReport = new MailTemplateReader();
		printReport.createPDF(pdfFilename);

	}

	private void createPDF(String pdfFilename) throws IOException {

		Document doc = new Document();
		PdfWriter docWriter = null;

		DecimalFormat df = new DecimalFormat("0.00");
		FileOutputStream fileOutputStream=null;
		try {

			// special font sizes
			Font bfBold12 = new Font(FontFamily.TIMES_ROMAN, 12, Font.BOLD,
					new BaseColor(0, 0, 0));
			Font bf12 = new Font(FontFamily.TIMES_ROMAN, 12);

			// file path
			String path = "D:/" + pdfFilename;
			fileOutputStream = new FileOutputStream(path);
			docWriter = PdfWriter.getInstance(doc, fileOutputStream);
			// document header attributes
			doc.addAuthor("Inceded Minded Machines");
			doc.addCreationDate();
			doc.addProducer();
			doc.addCreator("MySampleCode.com");
			doc.addTitle("Restaurant Name Bill");
			doc.setPageSize(PageSize.A4);

			// open document
			doc.open();

			// create a paragraph
			Paragraph paragraph = new Paragraph(
					"iText ® is a library that allows you to create and "
							+ "manipulate PDF documents. It enables developers looking to enhance web and other "
							+ "applications with dynamic PDF document generation and/or manipulation.");

			// specify column widths
			float[] columnWidths = { 2.5f, 2.5f, 2.5f, 2.5f, 2.5f };
			// create PDF table with the given widths
			PdfPTable table = new PdfPTable(columnWidths);
			// set table width a percentage of the page width
			table.setWidthPercentage(100);
			// insert column headings
			insertCell(table, "Sr No", Element.ALIGN_LEFT, 1, bfBold12);
			insertCell(table, "Item", Element.ALIGN_LEFT, 1, bfBold12);
			insertCell(table, "Quantity", Element.ALIGN_LEFT, 1, bfBold12);
			insertCell(table, "Amount", Element.ALIGN_LEFT, 1, bfBold12);
			insertCell(table, "Discount", Element.ALIGN_LEFT, 1, bfBold12);
			table.setHeaderRows(1);
			
			// insert an empty row
			insertCell(table, "", Element.ALIGN_LEFT, 4, bfBold12);
			// create section heading by cell merging
			/*insertCell(table, "New York Orders ...", Element.ALIGN_LEFT, 4,
					bfBold12);*/
			double orderTotal, total = 0;

			// just some random data to fill
			for (int x = 1; x < 5; x++) {

				insertCell(table, "Himanshu", Element.ALIGN_LEFT, 1, bf12);
				insertCell(table, "Himanshu", Element.ALIGN_LEFT, 1, bf12);
				insertCell(table, "Himanshu Tiwari" + x,
						Element.ALIGN_LEFT, 1, bf12);

				orderTotal = Double.valueOf(df.format(Math.random() * 1000));
				total = total + orderTotal;
				insertCell(table, df.format(orderTotal), Element.ALIGN_LEFT,
						1, bf12);

			}
			// add the PDF table to the paragraph
			paragraph.add(table);
			// add the paragraph to the document
			doc.add(paragraph);

		} catch (DocumentException dex) {
			dex.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (doc != null) {
				// close the document
				doc.close();
			}
			if (docWriter != null) {
				// close the writer
				docWriter.close();
			}
			fileOutputStream.flush();
			fileOutputStream.close();
		}
	}

	private void insertCell(PdfPTable table, String text, int align,
			int colspan, Font font) {

		// create a new cell with the specified Text and Font
		PdfPCell cell = new PdfPCell(new Phrase(text.trim(), font));
		// set the cell alignment
		cell.setHorizontalAlignment(align);
		// set the cell column span in case you want to merge two or more cells
		cell.setColspan(colspan);
		// in case there is no text and you wan to create an empty row
		if (text.trim().equalsIgnoreCase("")) {
			cell.setMinimumHeight(10f);
		}
		// add the call to the table
		table.addCell(cell);

	}

}
