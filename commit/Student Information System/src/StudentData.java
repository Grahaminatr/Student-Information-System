import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class StudentData {
	
	private static String firstName;
	private static String lastName;
	private double GPA;
	private static String period1;
	private static String period1Grade;
	private static String period2;
	private static String period2Grade;
	private static String period3;
	private static String period3Grade;
	static ArrayList <Students> studentRoster = new ArrayList<Students>();
	public static void fillRoster() throws FileNotFoundException
	 {
	  Scanner file = new Scanner(new File("studentlist.txt"));
	    while(file.hasNext())
	    	{
	    	firstName=file.next();
			lastName=file.next();
			period1=file.next();
			period1Grade=file.next();
			period2=file.next();
			period2Grade=file.next();
			period3=file.next();
			period3Grade=file.next();
			studentRoster.add(new Students(firstName, lastName, 0.0, period1, period1Grade, period2, period2Grade, period3, period3Grade));
	 }
}
}