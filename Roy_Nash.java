
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
public class Roy_Nash {

    public static void main(String[] args) throws IOException
    {    
    	String tempWord = null;
    	String tempDict = null;
    	boolean noMatch = true;
    	
        Scanner s = new Scanner(new File("dictionary.txt"));
        ArrayList<String> dictList = new ArrayList<String>();
        while (s.hasNext()){
        	dictList.add(s.next());
        }
        s.close();

        Scanner c = new Scanner(new File("testStates.txt"));
        ArrayList<String> testList = new ArrayList<String>();
        while (c.hasNext()){
        	testList.add(c.next());
        }
        c.close();
        
        for(int i = 0; i < testList.size(); i++) {   
        	tempWord = testList.get(i);
        	for(int j = 0; j < dictList.size(); j++)
        	{	tempDict = dictList.get(j);
        		if(tempWord.equalsIgnoreCase(tempDict))
        		{
        	       break;
        		}
        		else if(j == dictList.size()-1)
        		{
        			System.out.println("Unknown Word: " + tempWord);
        		}
        	}
        }  
        
    }
    
}
