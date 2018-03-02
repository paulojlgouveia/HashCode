import java.io.*;
import java.util.*;

public class InputReader {

    private Map<String,Integer> _paramsMap;
    private List<String> _rides;
    
//     private String _inputFile;
    private String _expectedOutputFile;

	public InputReader(String fileName) {	

		String line = null;
		
		_rides = new ArrayList<String>();
		_paramsMap = new HashMap<String,Integer>();
        String[] params;
        
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);
                
            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);
                
            if((line = bufferedReader.readLine()) != null) {
				params = line.split(" ");
				
				_paramsMap.put("R",Integer.parseInt(params[0]));
                _paramsMap.put("C",Integer.parseInt(params[1]));
                _paramsMap.put("F",Integer.parseInt(params[2]));
                _paramsMap.put("N",Integer.parseInt(params[3]));
                _paramsMap.put("B",Integer.parseInt(params[4]));
                _paramsMap.put("T",Integer.parseInt(params[5]));
            }
            
            _rides = new ArrayList<String>(_paramsMap.get("N"));
            
            for(int i = 0; i < _paramsMap.get("N"); i++) {
            	if((line = bufferedReader.readLine()) != null) {
					_rides.add(line);
            	}
            }
            
            bufferedReader.close();
            
            int slash = fileName.lastIndexOf("/") + 1;
            int dot = fileName.lastIndexOf(".");
            _expectedOutputFile = fileName.substring(slash, dot) + ".out";
            
            
        } catch(FileNotFoundException ex) {
            System.out.println("Unable to find file '" + fileName + "'");
			
        } catch(IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");                  
        }
		
	}
	
    public Map<String,Integer> getParams() { return _paramsMap; }
    public List<String> getRides(){ return _rides; }
    
    public String getOutputFileName() { return _expectedOutputFile; }

}