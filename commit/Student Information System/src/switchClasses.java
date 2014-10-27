import java.io.IOException;
import java.util.Scanner;


public class SwitchClass
	{

	public static Scanner read = new Scanner(System.in);
	private static int studentNumb;
	private static int change1;
	private static int change2;
	
public static void changeSchedule() throws IOException
{

	//print out database for selection
	
	fillArray.createArraylist();
	makeGPA.createGPA();
	
	for(int x=0;x<Students.database.size(); x++)
		{
		System.out.println("\n"+(x+1)+".)"+" "+Students.database.get(x));
		}
	
	System.out.println("\nPlease enter the number that corresponds with the student whose schedule you would like to change.");
	studentNumb=read.nextInt();
	System.out.println("\nHere is the student's current schedule:");
	System.out.println(Students.database.get(studentNumb-1));
	
	//current schedule "values" needed in order to use correct setters/getters
	
	String cl1 = Students.database.get(studentNumb-1).getClass1();
	String cl2 = Students.database.get(studentNumb-1).getClass2();
	String cl3 = Students.database.get(studentNumb-1).getClass3();
	String g1 = Students.database.get(studentNumb-1).getGradeClass1();
	String g2 = Students.database.get(studentNumb-1).getGradeClass2();
	String g3 = Students.database.get(studentNumb-1).getGradeClass3();
	
	System.out.println("\nPlease enter the period that you would like to change.");
	change1 = read.nextInt();
	System.out.println("\nWhich period would you like to switch period " + change1 + " with?");
	change2 = read.nextInt();
	
	if(change1 ==1)
	{
		if(change2 ==2)
		{
			Students.database.get(studentNumb-1).setClass1(cl2);
			Students.database.get(studentNumb-1).setClass2(cl1);
			Students.database.get(studentNumb-1).setGradeClass1(g2);
			Students.database.get(studentNumb-1).setGradeClass2(g1);
		}
		if(change2 == 3)
		{
			Students.database.get(studentNumb-1).setClass1(cl3);
			Students.database.get(studentNumb-1).setClass3(cl1);
			Students.database.get(studentNumb-1).setGradeClass1(g3);
			Students.database.get(studentNumb-1).setGradeClass3(g1);
		
		}
	}
	
	if(change1 ==2)
	{
		if(change2 ==1)
		{
			Students.database.get(studentNumb-1).setClass2(cl1);
			Students.database.get(studentNumb-1).setClass1(cl2);
			Students.database.get(studentNumb-1).setGradeClass2(g1);
			Students.database.get(studentNumb-1).setGradeClass1(g2);
		}
		if(change2 == 3)
		{
			Students.database.get(studentNumb-1).setClass2(cl3);
			Students.database.get(studentNumb-1).setClass3(cl2);
			Students.database.get(studentNumb-1).setGradeClass2(g3);
			Students.database.get(studentNumb-1).setGradeClass3(g2);
		}
	}
	
	if(change1 ==3)
	{
		if(change2 ==1)
		{
			Students.database.get(studentNumb-1).setClass3(cl1);
			Students.database.get(studentNumb-1).setClass1(cl3);
			Students.database.get(studentNumb-1).setGradeClass3(g1);
			Students.database.get(studentNumb-1).setGradeClass1(g3);
		
		}
		if(change2 == 2)
		{
			Students.database.get(studentNumb-1).setClass3(cl2);
			Students.database.get(studentNumb-1).setClass2(cl3);
			Students.database.get(studentNumb-1).setGradeClass3(g2);
			Students.database.get(studentNumb-1).setGradeClass2(g3);
		}
	}
	System.out.println("\nHere is the student's new and updated schedule!");
	System.out.println(Students.database.get(studentNumb-1));
	System.exit(0);
}
	
	
	
	}