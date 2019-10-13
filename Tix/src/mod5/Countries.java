package mod5;

//Import Statements
import java.io.*;  // I too am lazy....
import java.util.Scanner;


public class Countries {
	
	public static void main(String[] args) {
		try {
			// Write to file
			
			//Initialize file
			File writeFile = new File("other.txt");
			FileWriter fw = new FileWriter(writeFile, true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			//Initialize scanner
			Scanner kbd = new Scanner(System.in);
			
			String writeLine = "line";
			System.out.println("Enter names of Countries: (type done when finsihed)");
			while(!writeLine.equals("done")) {
				
				writeLine = kbd.nextLine();
				
				//Break if input equals "done"
				if(writeLine.equals("done")) {
					break;
				}
				
				bw.write(writeLine);
				bw.newLine();
			
				/*  ALTERNATIVE?
					
					Is it preferred to use the newLine() method over concentrating a linebreak with the input?
					
				writeLine = writeLine + "\n";
				bw.write(writeLine);
				
				*/
			}
			
			bw.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		catch (Exception e) {
			System.out.println("Good job, you just broke the internet!");
		}
		
		// Reading from file
		
		System.out.println("\nAttempting to readback file:\n");
		try {
			File readFile = new File("other.txt");
			FileReader fr = new FileReader(readFile);
			BufferedReader br = new BufferedReader(fr);
			
			PrintWriter pw = new PrintWriter(System.out);  // Write to console
			
			String nextLine;
			while((nextLine = br.readLine()) != null) {
				pw.println(nextLine);
			}
			
			
			br.close();
			pw.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
