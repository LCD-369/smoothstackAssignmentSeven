package com.louis;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter letter to find in file: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		scanner.close();
		char c=input.charAt(0);
		FileReader file = new FileReader("/Users/louiscdiaz/Desktop/myfile.txt");
		
	    FindLetter findFileChar = new FindLetter(file, c);

	    System.out.println("Character "+c+" appears "+findFileChar.count(findFileChar.readFile())+" times");

	}

}
