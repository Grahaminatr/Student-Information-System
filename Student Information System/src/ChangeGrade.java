import java.util.*;

public class ChangeGrade
	{
	static int chooseStudent;
	static int counter = 0;
	static int bobs;
	static int fillerInt;
	static int whichPeriod;
	static String newGrade;
	

	public static void ChangeGrade()
		{
			Scanner input = new Scanner(System.in);
			Collections.sort(StudentData.studentRoster, new NameSorter());
			System.out.println("\n"+ "Here are the names of the students, which one would you like to change?"+ "\n");
			for (int i = 0; i < StudentData.studentRoster.size(); i++)
				{
				counter++;
				System.out.println(counter+ ")"+ " "+ StudentData.studentRoster.get(i).getFirstName()+ " "+ StudentData.studentRoster.get(i).getLastName());
				}
				
			chooseStudent = input.nextInt();
			fillerInt = chooseStudent;
			System.out.println("\n" + "Here are the classes and scores of "
					+ StudentData.studentRoster.get(fillerInt).getFirstName()+ " "+ StudentData.studentRoster.get(fillerInt).getLastName()+ ".");
			System.out.println("\n"+ StudentData.studentRoster.get(fillerInt).getPeriod1()+ " "+ StudentData.studentRoster.get(fillerInt).getPeriod1Grade()+ " "
					+ StudentData.studentRoster.get(fillerInt).getPeriod2()+ " "+ StudentData.studentRoster.get(fillerInt).getPeriod2Grade()+ " "
					+ StudentData.studentRoster.get(fillerInt).getPeriod3()+ " "+ StudentData.studentRoster.get(fillerInt).getPeriod3Grade());
			System.out.println("\n" + "Which grade of "+ StudentData.studentRoster.get(fillerInt).getFirstName()+ " "+ StudentData.studentRoster.get(fillerInt).getLastName()+ " would you like to change.");
			System.out.println("1) "+ StudentData.studentRoster.get(fillerInt).getPeriod1());
			System.out.println("2) "+ StudentData.studentRoster.get(fillerInt).getPeriod2());
			System.out.println("3) "+ StudentData.studentRoster.get(fillerInt).getPeriod3());
			whichPeriod = input.nextInt();
			if (whichPeriod == 1)
				{
				System.out.println("\n"+ "What would you like to change that grade to?");
				newGrade = input.next();
				StudentData.studentRoster.get(fillerInt).setPeriod1Grade(newGrade);
				}
			else if (whichPeriod == 2)
				{
				System.out.println("\n"+ "What would you like to change that grade to?");
				newGrade = input.next();
				StudentData.studentRoster.get(fillerInt).setPeriod2Grade(newGrade);
				}
			else if (whichPeriod == 3)
				{
				System.out.println("\n"+ "What would you like to change that grade to?");
				newGrade = input.next();
				StudentData.studentRoster.get(fillerInt).setPeriod3Grade(newGrade);
				}
			System.out.println("\n" + "Here are the new grades of "+ StudentData.studentRoster.get(fillerInt).getFirstName()+ " "+ StudentData.studentRoster.get(fillerInt).getLastName()+ ".");
			System.out.println("\n"+ StudentData.studentRoster.get(fillerInt).getPeriod1()+ " "+ StudentData.studentRoster.get(fillerInt).getPeriod1Grade()
					+ " "+ StudentData.studentRoster.get(fillerInt).getPeriod2()+ " "+ StudentData.studentRoster.get(fillerInt).getPeriod2Grade()
					+ " "+ StudentData.studentRoster.get(fillerInt).getPeriod3()+ " "+ StudentData.studentRoster.get(fillerInt).getPeriod3Grade());

			}
		}
			
			