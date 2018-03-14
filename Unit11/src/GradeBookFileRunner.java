//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;

public class GradeBookFileRunner
{
private static final GradeBookFileRunner instance = new GradeBookFileRunner();
	
	public static void main(String[] args) throws Exception{
		instance.execute();
	}
	
	@Override
	public void execute() {
		printLine("Welcome to the Class Stats program!");
		Scanner file;
		try {
			file = new Scanner(new File("gradebook.dat"));
		} catch (FileNotFoundException e) {
			printLine("File not found: " + e.getMessage());
			return;
		}
		
		file.close();
	}
}