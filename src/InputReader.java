
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;


public class InputReader {
    
    private String _inputFile;
    private String _expectedOutputFile;

    private Map<String,Integer> _paramsMap;
    private List<String> _rides;

	public InputReader(String fileName) {	

		String line = null;
		
		_rides = new ArrayList<String>();
		_paramsMap = new HashMap<String,Integer>();
        String[] params;
        
        try {
            FileReader fileReader = new FileReader(fileName);
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
            
            int slash = fileName.lastIndexOf("/") + 1;;
            _inputFile = fileName.substring(slash, fileName.length());
            
            
        } catch(FileNotFoundException ex) {
            System.out.println("Unable to find file '" + fileName + "'");
			
        } catch(IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");                  
        }
		
	}
	
    public Map<String,Integer> getParams() { return _paramsMap; }
    public List<String> getRides(){ return _rides; }
    
    
    // return expected name for the respective output file
    public String getOutputFileName() {
		return _inputFile.substring(0, _inputFile.lastIndexOf(".")) + ".out";
	}

}

