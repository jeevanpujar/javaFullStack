package com.shristi.inter.assg;

public class FileMain {
	public static void main(String[] args) {
		FileCompressor file=new ZipCompressor();
		file.compressFile();
		file=new JarCompressor();
		file.compressFile();
		file=new RarCompressor();
		file.compressFile();
	}

}
