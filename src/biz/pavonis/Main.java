package biz.pavonis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Main.
 */
public class Main {

	/**
	 * Main.
	 * 
	 * @param args args
	 */
	public static void main(String[] args) {
		System.out.println("Type in the problem number:");
		String line = ""; // Line read from standard in

		InputStreamReader converter = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(converter);

		while (!(line.equals("quit"))) {
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
						Class probClass = Class.forName("net.projecteuler.Problem" + probNum);
						Solvable instance = (Solvable) probClass.newInstance();
						long start = System.currentTimeMillis();
						long solution = instance.solve();
						long end = System.currentTimeMillis();
						System.out.println("Solution of Problem" + probNum + " is: " + solution + ". Problem solved in " + (end - start) + "ms.");
					} catch (Exception e) {
						e.printStackTrace();
						System.out.println("Problem" + probNum + " is not yet solved.");
					}
				} catch (NumberFormatException e) {
					System.out.println("Please type in a number next time.");
				}

			}
		}
	}
}
