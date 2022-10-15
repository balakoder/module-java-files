package com.javacodestuffs.io.files.convert.tobytes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFileAsByteUsingNIO {
	public static void main(String[] args) throws IOException {
		{

			Path path = Paths.get("src/main/resources/abc.txt");
			byte[] data = Files.readAllBytes(path);
			System.out.println(data);
		}
	}
}

