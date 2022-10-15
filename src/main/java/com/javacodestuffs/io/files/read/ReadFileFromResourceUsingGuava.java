package com.javacodestuffs.io.files.read;

import java.io.IOException;
import java.nio.charset.Charset;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;

public class ReadFileFromResourceUsingGuava {
	public static void main(String[] args) throws IOException {

		String fileContent = readFileResource("config.properties", Charsets.UTF_8);

		System.out.println("the file contents are : ");
		System.out.println(fileContent);

	}

	public static String readFileResource(final String fileName, Charset charset) throws IOException {
		return Resources.toString(Resources.getResource(fileName), charset);
	}

}