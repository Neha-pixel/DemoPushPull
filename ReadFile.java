package javaPrograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:/Neha/Nividous/testing.docx");
		BufferedReader br = new BufferedReader(fr);
		String txtFromFile = null;
		while((txtFromFile=br.readLine())!=null)
		{
		 System.out.println(txtFromFile);	
		}
		br.close();
		fr.close();
	}
}
