
import java.util.List;
import java.io.FileOutputStream;
import java.io.IOException;


public class OutputWriter {
    
    private String _outputFile;
    

	public OutputWriter(String fileName) {
		_outputFile = fileName;
	}
	
	public void writeToFile(List<Car> cars) {
		
		try {
			String str = "";
			for (Car car : cars) {
				str = str + car.toOutput() + "\n";
			}
			
			FileOutputStream outputStream = new FileOutputStream(_outputFile);
			byte[] strToBytes = str.getBytes();
			outputStream.write(strToBytes);
			
			outputStream.close();
			
		} catch(IOException ex) {
			System.out.println("Unable to write to output file '" + _outputFile + "'");                  
		}
	}
	
	public static void writeToFile(String outFile, List<Car> cars) {
		
		try {
			String str = "";
			for (Car car : cars) {
				str = str + car.toOutput() + "\n";
			}
			
			FileOutputStream outputStream = new FileOutputStream(outFile);
			byte[] strToBytes = str.getBytes();
			outputStream.write(strToBytes);
			
			outputStream.close();
			
		} catch(IOException ex) {
			System.out.println("Unable to write to output file '" + outFile + "'");                  
		}
	}
	

}

