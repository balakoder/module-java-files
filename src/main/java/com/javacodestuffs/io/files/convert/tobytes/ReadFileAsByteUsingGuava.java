package com.javacodestuffs.io.files.convert.tobytes;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import com.google.common.io.ByteStreams;
import com.google.common.io.Files;

public class ReadFileAsByteUsingGuava {

	public static void main(String[] args) throws IOException {
		{
			// Using FileUtils.readFileToByteArray()
			File file1 = new File("src/main/resources/abc1.txt");
			File file2 = new File("src/main/resources/abc2.txt");
			
			//Using Files.toByteArray()
			byte[] bytes1 = Files.toByteArray(file1);

			//Using ByteStreams.toByteArray	
			FileInputStream fileInputStream = new FileInputStream(file2);
			byte[] bytes2 = ByteStreams.toByteArray(fileInputStream);

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