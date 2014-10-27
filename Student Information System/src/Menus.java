import java.util.Collections;
import java.util.Scanner;


public class Menus
	{
	public static int choice4;
	private static int choice;
	private static int choice1, choice2,choice3;
	public static void navigate()
		{
		System.out.println("What would you like to do?");
		System.out.println("(1) Add or delete a student.");
		System.out.println("(2) Change students grade/schedule.");
		System.out.println("(3) Sort students.");
		Scanner userInput = new Scanner(System.in);
		choice = userInput.nextInt();
		switch (choice)
			{
			case 1:
				System.out.println("Add or delete a student.");
				System.out.println("(1) Add a student.");
				System.out.println("(2) Delete a student.");
				Scanner userInput1 = new Scanner(System.in);
				choice1 = userInput1.nextInt();
				if (choice1 == 1)
					{
					addStudent.addStudent();
					}
				else if (choice1 == 2)
					{
					DeleteStudent.DeleteStudent();
					}
				break;
			case 2:
				System.out.println("Change students grade/schedule.");
				System.out.println("(1) Change grade.");
				System.out.println("(2) Switch classes.");
				Scanner userInput2 = new Scanner(System.in);
				choice2 = userInput2.nextInt();
				if (choice2 == 1)
					{
					ChangeGrade.ChangeGrade();
					}
				else if (choice2 == 2)
					{
					ChangeClasses.ChangeClasses();
					}
				break;
			case 3:
				System.out.println("Sort students.");
				System.out.println("(1) Sort by last name.");
				System.out.println("(2) Sort by GPA.");
				System.out.println("(3) Sort by class.");
				Scanner userInput3 = new Scanner(System.in);
				choice3 = userInput3.nextInt();
				if (choice3 == 1)
					{
					Collections.sort(StudentData.studentRoster, new NameSorter());
					}
				else if (choice3 == 2)
					{
					Collections.sort(StudentData.studentRoster, new GPASorter());
					}
				else if (choice3 == 3)
					{
					System.out.println("Which period do you want to sort by?");
					System.out.println("1)Period 1");
					System.out.println("2)Period 2");
					System.out.println("3)Period 3");
					Scanner userInput4 = new Scanner(System.in);
					choice4 = userInput4.nextInt();
					if (choice4 == 1)
						{
						Collections.sort(StudentData.studentRoster, new SortByperiod1());
						}
					else if (choice4 == 2)
						{
						Collections.sort(StudentData.studentRoster, new SortByPeriod2());
						}
					else
						{
						Collections.sort(StudentData.studentRoster, new SortByPeriod3());
						}
					
					}
				break;
			}
		}
	}
