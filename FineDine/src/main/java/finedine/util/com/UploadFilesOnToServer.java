package main.java.finedine.util.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public class UploadFilesOnToServer {

	public Boolean fileWriting(MultipartFile multipartFile, String fileName,
			String filePath) throws IOException {

		File file = new File(filePath);
		file.mkdirs();
		file = new File(filePath + fileName);
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file);
			// Writes bytes from the specified byte array to this file output
			// stream
			fos.write(multipartFile.getBytes());
			return true;
		} catch (FileNotFoundException e) {
			//log.info("File not found" + e);
		} catch (IOException ioe) {
			//log.info("Exception while writing file " + ioe);
		} finally {
			// close the streams using close method
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException ioe) {
				//log.info("Error while closing stream: " + ioe);
			}

		}
		return false;
	}

}