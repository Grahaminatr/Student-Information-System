import java.util.Scanner;


public class ChangeClasses {
	static int total;
	static int counter=0;
	static int chooseStudent;
	static int fillerInt;
	static String new1,new2,new3;
	public static void ChangeClasses() 
	{
	Scanner input = new Scanner(System.in);
	System.out.println("Here are the names of the students, which one would you like to change?"+ "\n");
	for (int j = 0; j < StudentData.studentRoster.size(); j++)
		{
		total++;
		System.out.println(total+ ")"+ "\t"
				+ StudentData.studentRoster.get(j).getFirstName()+ " "
				+ StudentData.studentRoster.get(j).getLastName() + "\t" + " Period 1:" 
				+ StudentData.studentRoster.get(j).getPeriod1()+ "\t" + " Period 2:"
				+ StudentData.studentRoster.get(j).getPeriod2()+ "\t" + "Period 3:"
				+ StudentData.studentRoster.get(j).getPeriod3());
		}
	chooseStudent = input.nextInt();
	fillerInt = chooseStudent - 1;
	System.out.println("\n"+ "Here is the schedule of "+ StudentData.studentRoster.get(fillerInt)
					.getFirstName()+ " "+ StudentData.studentRoster.get(fillerInt).getLastName() + ".");
	System.out.println("\n"+ StudentData.studentRoster.get(fillerInt).getPeriod1()+ " "
			+ StudentData.studentRoster.get(fillerInt).getPeriod2()+ " "
			+ StudentData.studentRoster.get(fillerInt).getPeriod3());
	System.out.println("\n"+ "What would you like to change period one to?");
	new1 = input.next();
	System.out.println("\n"+ "What would you like to change period two to?");
	new2 = input.next();
	System.out.println("\n" + "What would you like to change period three to?");
	new3 = input.next();
	System.out.println("\n"+ "Here is the new schedule of "+ StudentData.studentRoster.get(fillerInt)
					.getFirstName()+ " "+ StudentData.studentRoster.get(fillerInt).getLastName() + ".");
	StudentData.studentRoster.get(fillerInt).setPeriod1(new1);
	StudentData.studentRoster.get(fillerInt).setPeriod2(new2);
	StudentData.studentRoster.get(fillerInt).setPeriod3(new3);
	System.out.println("\n" + "Period One: "+ StudentData.studentRoster.get(fillerInt)
					.getPeriod1() + "\n" + "Period Two: " + StudentData.studentRoster.get(fillerInt)
					.getPeriod2() +  "\n" + "Period Three: " + StudentData.studentRoster.get(fillerInt)
					.getPeriod3()); 
	}
}