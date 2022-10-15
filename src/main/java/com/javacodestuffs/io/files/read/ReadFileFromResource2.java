package com.javacodestuffs.io.files.read;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadFileFromResource2 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		ReadFileFromResource2 object = new ReadFileFromResource2();
		object.readFiles();
	}

	public void readFiles() throws IOException {

		InputStream is = this.getClass().getClassLoader().getResourceAsStream("abc.csv");
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

		byte[] buffer = new byte[1024];
		int len;

		while ((len = is.read(buffer)) != -1) {
			outputStream.write(buffer, 0, len);
		}
		byte[] content = outputStream.toByteArray();	
		System.out.println("the content of the files are: ");
		System.out.println(content);
	}

}