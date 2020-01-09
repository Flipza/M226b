package ch.modul225b.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ConsoleReader {

	BufferedReader reader;
	String line;

	File dataFile = new File("myFile.txt");try
	{
		reader = new BufferedReader( new FileReader(dataFile));
		while((line = reader.readLine()) .= null) {
			...
		}
		reader.close();
	}catch(
	IOException e)
	{
		...
	}

}

public boolean action() {
	while (true) {
		anzeigen();
		
		int eingabe = Consolereader.readInteger("Ihre Wahl");
		switch (eingabe) {
		case 1:
			ankunft();
			return true;
		case 2:
			abfahrt();
			return true;
		case 3:
			gateDatenAnzeigen();
			return true;
		case 4:
			return false;
		default:
			System.out.println("Ungueltige Wahl!");
		}
	}
}
