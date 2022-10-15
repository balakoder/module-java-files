package com.javacodestuffs.io.files.convert.tobytes;

import java.io.File;
import java.io.FileInputStream;

public class ReadFileAsByteArray1 {
	public static void main(String[] args) {

		File file = new File("src/main/resources/abc.txt"); // this file we kept in classpath

		FileInputStream fileInputStream = null;
		byte[] bytes = new byte[(int) file.length()];
		try {
			// convert file into byte array

			fileInputStream = new FileInputStream(file);
			fileInputStream.read(bytes);
			fileInputStream.close();

			for (int i = 0; i < bytes.length; i++) {
				System.out.print((char) bytes[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
