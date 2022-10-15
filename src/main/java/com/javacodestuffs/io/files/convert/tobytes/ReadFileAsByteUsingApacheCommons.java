package com.javacodestuffs.io.files.convert.tobytes;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

public class ReadFileAsByteUsingApacheCommons {

	public static void main(String[] args) throws IOException {
		{
			// Using FileUtils.readFileToByteArray()
			File file1 = new File("src/main/resources/abc1.txt");
			File file2 = new File("src/main/resources/abc2.txt");

			FileInputStream fileInputStream = new FileInputStream(file1);

			byte[] bytes1 = FileUtils.readFileToByteArray(file2);

			// Using IOUtils.toByteArray
			byte[] bytes2 = IOUtils.toByteArray(fileInputStream);

			System.out.println("printing the byte array content1:");
			for (int i = 0; i < bytes1.length; i++) {

				System.out.print((char) bytes1[i]);
			}
            
			System.out.println();
			System.out.println("printing the byte array content2:");
			for (int i = 0; i < bytes2.length; i++) {

				System.out.print((char) bytes2[i]);
			}

		}
	}
}



