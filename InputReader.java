import java.io.*;
import java.util.*;

public class InputReader{

    private Map<String,Integer> _paramsMap;
    private String _fileName = "files/paris_54000.txt";

    private List<String> junctions = new ArrayList<String>();
    private List<String> streets = new ArrayList<String>();

	public InputReader(){	

		String line = null;

		_paramsMap = new HashMap<String,Integer>();
        String[] params;
		String coords;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(_fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            if((line = bufferedReader.readLine()) != null) {
				params = line.split(" ");

				_paramsMap.put("N",Integer.parseInt(params[0]));
                _paramsMap.put("M",Integer.parseInt(params[1]));
                _paramsMap.put("T",Integer.parseInt(params[2]));
                _paramsMap.put("C",Integer.parseInt(params[3]));
                _paramsMap.put("S",Integer.parseInt(params[4]));
            }

            for(int i = 1; i <=_paramsMap.get("N");i++){
            	if((line = bufferedReader.readLine()) != null) {
					junctions.add(line);
            	}
            }

            for(int i = 1; i <=_paramsMap.get("M");i++){
            	if((line = bufferedReader.readLine()) != null) {
					streets.add(line);
            	}
            }
     
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                _fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + _fileName + "'");                  
        }

	}

    public List<String> getJunctions(){
        return junctions;
    }

    public List<String> getStreets(){
        return streets;
    }

    public Map<String,Integer> getParams(){
        return _paramsMap;
    }

}