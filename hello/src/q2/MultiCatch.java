package q2;

import java.util.concurrent.ExecutionException;
import java.util.zip.DataFormatException;

public class MultiCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			process();
			// Always use exceptions from the most specialized first
			// then go to more generalized versions
		} catch (ExecutionException | DataFormatException e) {
			//
		} catch (RuntimeException e) {
			
		}
	}
	
	static void process() throws DataFormatException, ExecutionException {
		// code
	}

}
