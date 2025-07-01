package devops;

import java.util.HashSet;
import java.util.Set;

public class duplicateFinder
{
    public static Set<String> duplicatesFind(String[] array)
    {
	Set<String> word = new HashSet<String>();
	Set<String> duplicate = new HashSet<String>();
	
	for(String item : array)
	{
		if(!word.add(item))
		{
			duplicate.add(item);
		}
	}
	return duplicate;
    }
    public static void main (String[] args)
    {
    	String[] worlds = {"Java","COM","Java"};
    	System.out.print("Original " +worlds);
    	
    	Set<String> duplicate = duplicatesFind(worlds);
    	System.out.print("Original Duplicate " +duplicate);
    }
}
