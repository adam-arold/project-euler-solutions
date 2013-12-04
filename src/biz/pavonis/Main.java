package biz.pavonis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Main. "quit" exits. A number solves the problem with the given number.
 */
public class Main {
	public static void main(String[] args) {
		System.out.println("Type in the problem number:");
		String line = ""; // Line read from standard in
		InputStreamReader converter = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(converter);
		while (!(line.toLowerCase().equals("quit"))) {
			try {
				line = in.readLine();
			} catch (IOException e) {
				System.out.println("Error. Fail.");
			}
			if (!(line.equals("quit"))) {
				try {
					int probNum = Integer.parseInt(line);
					try {
						@SuppressWarnings("rawtypes")
						Class probClass = Class.forName("biz.pavonis.Problem" + probNum);
						Solvable instance = (Solvable) probClass.newInstance();
						long start = System.nanoTime();
						long solution = instance.solve();
						long end = System.nanoTime();
						System.out.println("Solution of Problem" + probNum + " is: " + solution + ". Problem solved in " + (end - start) / 1000 / 1000 + "ms.");
					} catch (ClassNotFoundException e) {
						System.out.println("Problem" + probNum + " is not yet solved.");
					} catch (Exception e) {
						e.printStackTrace();
					}
				} catch (NumberFormatException e) {
					System.out.println("Please type in a number next time.");
				}
			}
		}
		System.out.println("Quitting...");
	}
}
