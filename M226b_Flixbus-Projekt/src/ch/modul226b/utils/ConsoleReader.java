package ch.modul226b.utils;

import java.io.*;


public abstract class ConsoleReader {
	
	private static BufferedReader reader = new BufferedReader(
			new InputStreamReader(System.in));
	
	private ConsoleReader() {
		super();
	}
	
	//Liest ein einzelnes Zeichen von der Konsole ein
	public static char readChar(String prompt) {
		
		char value = 0;
		while (true) {
			try {
				System.out.print(prompt + ": ");
				value = (char) reader.read();
				break;
			}
			
			catch (IOException ex) {
				System.out.println("*** Read Error ***");
				System.out.println("***" + ex.getMessage());
				System.exit(1);
			}
			catch (NumberFormatException ex) {
				System.out.println("*** Conversion Error ***, try again");
			}
		}
		return value;
	}
	
	//Liest Double-Wert von Konsole ein
	public static double readDouble(String prompt) {
		
		double value = 0.0;
		System.out.println(prompt + ": ");
		while (true) {
			try {
				value = Double.valueOf(reader.readLine()).doubleValue();
				break;
			}
			
			catch (IOException ex) {
				System.out.println("*** Read Error ***");
				System.out.println("***" + ex.getMessage());
				System.exit(1);
			}
			catch (NumberFormatException ex) {
				System.out.println("*** Conversion Error ***, try again");
			}
		}
		return value;
	}
	
	//Liest Int-Wert von Konsole ein
	public static int readInteger(String prompt) {
		
		int value = 0;
		while (true) {
			try {
				System.out.print(prompt + " _>");
				value = Integer.valueOf(reader.readLine()).intValue();
				break;
			}
			
			catch (IOException ex) {
				System.out.println("*** Read Error ***");
				System.out.println("***" + ex.getMessage());
				System.exit(1);
			}
			catch (NumberFormatException ex) {
				System.out.println("*** Conversion Error ***, try again");
			}
		}
		return value;
	}
	
	//Liest Long-Wert  von Konsole ein
	public static long readLong(String prompt) {
		
		long value = 0;
		while (true) {
			try {
				System.out.print(prompt + " _>");
				value = Long.valueOf(reader.readLine()).longValue();
				break;
			}
			
			catch (IOException ex) {
				System.out.println("*** Read Error ***");
				System.out.println("***" + ex.getMessage());
				System.exit(1);
			}
			catch (NumberFormatException ex) {
				System.out.println("*** Conversion Error ***, try again");
			}
		}
		return value;
	}
	
	//Liest String von Konsole ein
	public static String readString(String prompt) {
		
		String value = "";
		while (true) {
			try {
				System.out.print(prompt + " _>");
				value = reader.readLine();
				break;
			}
			
			catch (IOException ex) {
				System.out.println("*** Read Error ***");
				System.out.println("***" + ex.getMessage());
				System.exit(1);
			}
			catch (NumberFormatException ex) {
				System.out.println("*** Conversion Error ***, try again");
			}
		}
		return value;
	}
}
