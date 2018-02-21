import java.io.*;
import java.util.*;

public class InputReader{

    private int N,M,T,C,S;
    private String fileName = "files/paris_54000.txt";

    private String[] params;
    private List<String> junctions = new ArrayList<String>();
    private List<String> streets = new ArrayList<String>();

	public InputReader(){	

		String line = null;

		N=M=T=C=S=0;
		String coords;
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            if((line = bufferedReader.readLine()) != null) {
				params = line.split(" ");
				N = Integer.parseInt(params[0]);
				M = Integer.parseInt(params[1]);
				T = Integer.parseInt(params[2]);
				C = Integer.parseInt(params[3]);
				S = Integer.parseInt(params[4]);
            }

            for(int i = 1; i <=N;i++){
            	if((line = bufferedReader.readLine()) != null) {
					junctions.add(line);
            	}
            }

            for(int i = 1; i <=M;i++){
            	if((line = bufferedReader.readLine()) != null) {
					streets.add(line);
            	}
            }
     
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
        }

	}

    public List<String> getJunctions(){
        return junctions;
    }

    public List<String> getStreets(){
        return streets;
    }

    public int getParam(char param){
        switch (param){
            case 'N':
                return N;
            case 'M':
                return M;
            case 'T':
                return T;
            case 'C':
                return C;
            case 'S':
                return S;
            default:
                return 0;
        }
    }

}