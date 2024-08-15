package com.training.quest2;

public class JarExtractor implements Extractor {

	@Override
	public void extractFiles(String... filenames) {
		System.out.println("extracting from jar=> files as .class files");
	     for (String file : filenames) {
			System.out.println(file);
		}
	}

}
