

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Finally {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream f = null;
		try {
			f = new FileInputStream("./src/demo.txt");
			System.out.println((char) f.read());
			
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found Exception");
		} catch (IOException e) {
			System.out.println("IO Exception");
		} finally {
			
			//try-with resources statement
			if (f != null) {
				System.out.println("Finally block.");
				try {
					f.close();
				} catch (IOException e) {
					
				}
			}
		}
	}
	
	// Finally block runs after a try block regardless of exception
	// useful for closing resources like files, connections, etc.
	// Not to be confused with final keyword
		// Variable value cannot be changed (constant)
		// Method cannot be overridden
		// Classes cannot be extended
	
}
