package com.javacodestuffs.io.files.read;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.springframework.util.ResourceUtils;

public class ReadFileFromResourceUsingSpring {

	public static void main(String[] args) throws IOException {

		File file = ResourceUtils.getFile("classpath:application.properties");

		System.out.println("The File Found :" + file.exists());

		String content = new String(Files.readAllBytes(file.toPath()));
		System.out.println("the file contents are : ");
		System.out.println(content);
	}

}
