package com.training.quest2;

public class ZipExtractor implements Extractor {

	@Override
	public void extractFiles(String... filenames) {
		System.out.println("extracting from Zipfile =>files as .txt,jpeg, .doc files ");
	     for (String file : filenames) {
			System.out.println(file);
		}


	}

}
