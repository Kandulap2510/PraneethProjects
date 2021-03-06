//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	
	public MadLib()
	{
		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();
		



	}

	public MadLib(String fileName)
	{
		
		this();
		
		loadVerbs();
		loadNouns();
		loadAdjectives();
		
		try{
			Scanner file = new Scanner(new File(fileName));
			while (file.hasNext()) {
				
				String test = file.next();
				
				if (test.equals("#")){
					out.print(getRandomNoun()+" ");
				}
				else if (test.equals("@")){
					out.print(getRandomVerb()+ " ");
				}
				else if (test.equals("&")){
					out.print(getRandomAdjective()+ " ");
				}
				else{
					System.out.print(test + " ");
				}
				
				
			}
		}
		
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		try{
			Scanner fileNouns = new Scanner(new File("C:\\Users\\Kandulap2510\\Desktop\\Unit10\\Unit10-2016\\Unit10-Assignments\\Lab16d\\nouns.dat"));
			while (fileNouns.hasNext()) {
				nouns.add(fileNouns.next());
			}
		
		
		
		
		
		}
		catch(Exception e)
		{
			out.println("error with loading nouns");
		}	
		
	}
	
	public void loadVerbs()
	{
		try{
			Scanner fileVerbs = new Scanner(new File("C:\\Users\\Kandulap2510\\Desktop\\Unit10\\Unit10-2016\\Unit10-Assignments\\Lab16d\\verbs.dat"));
			while (fileVerbs.hasNext()) {
				verbs.add(fileVerbs.next());
			}
	
	
	
	
		}
		catch(Exception e)
		{
			out.println("error with loading verbs");
		}
	}

	public void loadAdjectives()
	{
		try{
			Scanner fileAdjectives = new Scanner(new File("C:\\Users\\Kandulap2510\\Desktop\\Unit10\\Unit10-2016\\Unit10-Assignments\\Lab16d\\adjectives.dat"));
			while (fileAdjectives.hasNext()) {
				adjectives.add(fileAdjectives.next());
			}
	
	
	
	
	
		}
		catch(Exception e)
		{
			out.println("error with loading adjectives");
		}
	}

	public String getRandomVerb()
	{
		int random = (int )(Math.random() * (verbs.size() - 1));
		String verb = verbs.get(random);
		return verb;
	}
	
	public String getRandomNoun()
	{
		int random = (int )(Math.random() *  (nouns.size() - 1));
		String noun = nouns.get(random);
		return noun;
	}
	
	public String getRandomAdjective()
	{
		int random = (int )(Math.random() *  (adjectives.size() - 1));
		String adjective = adjectives.get(random);
		return adjective;
	}		

	public String toString()
	{
		return "\n\n\n";
	}
}