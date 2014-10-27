import java.util.Collection;
import java.util.Scanner;
import java.util.ArrayList;

public class addStudent
	{
	private static String firstName, lastName, firstPeriod, firstGrade, secondPeriod, secondGrade, thirdPeriod, thirdGrade;
	private static double gPA;
	private static int oneP, twoP;
	private static ArrayList<String> subject = new ArrayList<String>();
	
	public static void addStudent()
		{
		promptAllInput();
		makeStudentJoinClass();
		}
	
	public static void makeStudentJoinClass()
		{
		((ArrayList<String>) Students.studentRoster).addAll((Collection<? extends String>) new Students(firstName, lastName, gPA, firstPeriod, firstGrade, secondPeriod, secondGrade, thirdPeriod, thirdGrade));
		}
	
	public static void promptAllInput()
		{
		subject.add("Biology");
		subject.add("English");
		subject.add("Algebra");
		System.out.println("What is the first name of the new student?");
		Scanner keyboard = new Scanner(System.in);
		firstName = keyboard.nextLine();
		System.out.println();
		System.out.println("What is the last name of the new student?");
		lastName = keyboard.nextLine();
		System.out.println();
		System.out.println("What is the GPA of the new student?");
		gPA = keyboard.nextDouble();
		System.out.println();
		System.out.println("What 1st period is the new student in?");
		System.out.println();
		System.out.println("Your options are:");
		for(int i = 0; i < subject.size(); i++)
			{
			System.out.println("	" + (i + 1) + ") " + subject.get(i));
			}
		oneP = keyboard.nextInt();
		firstPeriod = subject.get(oneP - 1);
		subject.remove(oneP - 1);
		System.out.println("What is the student's grade for " + firstPeriod + "?");
		Scanner keyboard2 = new Scanner(System.in);
		firstGrade = keyboard2.nextLine();
		System.out.println();
		System.out.println("What 2nd period is the new student in?");
		System.out.println();
		System.out.println("Your options are:");
		for(int i = 0; i < subject.size(); i++)
			{
			System.out.println("	" + (i + 1) + ") " + subject.get(i));
			}
		twoP = keyboard.nextInt();
		secondPeriod = subject.get(twoP - 1);
		subject.remove(twoP - 1);
		thirdPeriod = subject.get(0);
		System.out.println("What is the student's grade for " + secondPeriod + "?");
		secondGrade = keyboard2.nextLine();
		System.out.println("The student's third period will be " + thirdPeriod + ".");
		System.out.println("What is the student's grade for " + thirdPeriod + "?");
		thirdGrade = keyboard2.nextLine();
		}
	}