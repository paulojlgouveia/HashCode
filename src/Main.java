
import java.util.List;
import java.util.ArrayList;
import java.io.File;


public class Main {
	
	private static ArrayList<InputReader> getAllInputs(String dirName, String extension) {
		
		ArrayList<InputReader> irList = new ArrayList<InputReader>();
		
		File directory = new File(dirName);
		File[] directoryListing = directory.listFiles();
		if (directoryListing != null) {
			for (File file : directoryListing) {
				irList.add(new InputReader(directory.getName() + "/" + file.getName()));
			}
			
		} else {
			System.out.println("'" + directory + "'" + "is not a directory.");
		}
		
		return irList;
	}
	

	public static void main(String args[]) {
		
		// get all input files
		ArrayList<InputReader> irList = getAllInputs("input/", ".in");
		
		// work on all at the same time, one thread per file
		for (InputReader ir : irList) {
			(new RunnableMain(ir)).start();
		}
		
	}
	
}

