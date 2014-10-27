import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DeleteStudent
	{
	public static void DeleteStudent()
	{
	int counter = 1;
	System.out.println("Which Student do you want to remove?");
	for(int i = 0; i < StudentData.studentRoster.size(); i++)
		{
		System.out.println(counter + "). " + StudentData.studentRoster.get(counter).getFirstName() + " " + StudentData.studentRoster.get(counter).getLastName());
		counter++;
		}

	Scanner userInput1 = new Scanner(System.in);
	int removeChoice = userInput1.nextInt(); 
	StudentData.studentRoster.remove(removeChoice - 1);
	counter = 1;
	System.out.println("The new roster is: ");
	
	for(int j = 0; j < StudentData.studentRoster.size(); j++)
		{
		System.out.println(counter + "). " + StudentData.studentRoster.get(counter).getFirstName() + " " + StudentData.studentRoster.get(counter).getLastName());
		counter++;
		}
	}
	}