import java.io.*;
import java.util.*;

public class InputReader{

    private Map<String,Integer> _paramsMap;
    private String _fileName = "input/b_should_be_easy.in";

    private List<String> _rides = new ArrayList<String>();

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

				_paramsMap.put("R",Integer.parseInt(params[0]));
                _paramsMap.put("C",Integer.parseInt(params[1]));
                _paramsMap.put("F",Integer.parseInt(params[2]));
                _paramsMap.put("N",Integer.parseInt(params[3]));
                _paramsMap.put("B",Integer.parseInt(params[4]));
                _paramsMap.put("T",Integer.parseInt(params[5]));
            }

            for(int i = 1; i <=_paramsMap.get("N");i++){
            	if((line = bufferedReader.readLine()) != null) {
					_rides.add(line);
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


    public List<String> getRides(){
        return _rides;
    }

    public Map<String,Integer> getParams(){
        return _paramsMap;
    }

}