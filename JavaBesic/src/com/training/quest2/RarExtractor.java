package com.training.quest2;

public class RarExtractor implements Extractor {

	@Override
	public void extractFiles(String... filenames) {
	     System.out.println("extracting from rar=> files as .tex files from linux os ");
	     for (String file : filenames) {
			System.out.println(file);
		}

	}

}
