package com.louis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FindLetter {

	private char searchforThis;
	private FileReader file = null;

	FindLetter(FileReader file, char searchFor) throws IOException {
	    this.file = file;
	    this.searchforThis = searchFor;

	}

	public String readFile() throws IOException {

	    String everythingonFile;

	    try (BufferedReader buffreader = new BufferedReader(file)) {
	        StringBuilder sbuilder = new StringBuilder();
	        String line = buffreader.readLine();

	        while (line != null) {
	            sbuilder.append(line);
	            sbuilder.append(System.lineSeparator());
	            line = buffreader.readLine();

	        }
	        everythingonFile = sbuilder.toString();
	    }
	    return everythingonFile;
	}

	public int count(String line) {
	    int count = 0;

	    for (int i = 0; i < line.length(); i++) {
	        if (line.charAt(i) == searchforThis) {
	            count++;
	        }
	    }

	    return count;
	}
	
	
}
