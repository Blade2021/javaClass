package mod11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class GenerateSet {

	public static void main(String[] args) {
		
		Set<Integer> intset = new TreeSet<Integer>();
		
		try {
			File readFile = new File("numbers.txt");
			FileReader fr = new FileReader(readFile);
			BufferedReader br = new BufferedReader(fr);


			String nextLine;
			while((nextLine = br.readLine()) != null) {
				intset.add(Integer.parseInt(nextLine));
			}
			System.out.println(intset.size());
			System.out.println(intset);

			br.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}