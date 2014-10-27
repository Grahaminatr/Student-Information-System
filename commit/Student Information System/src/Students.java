import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Students
	{
	private String firstName;
	private String lastName;
	private int Period1 = 1;
	private String class1;
	private String gradeClass1;
	private int Period2 = 2;
	private  String class2;
	private String gradeClass2;
	private int Period3 = 3;
	private  String class3;
	private String gradeClass3;
	private  double GPA = 0;
	
	static ArrayList <Students> database = new ArrayList <Students> ();
	public static Object studentRoster;
	
public Students(String f, String l, int p1, String c1, String g1, int p2, String c2, String g2, int p3, String c3, String g3, double GpA)
{
	firstName = f;
	lastName = l; 
	Period1 = p1;
	class1 = c1;
	gradeClass1 = g1;
	Period2 = p2;
	class2 = c2;
	gradeClass2 = g2;
	Period3 = p3;
	class3 = c3;
	gradeClass3 = g3;
	GPA = GpA; 
}

//

public Students(String firstName2, String lastName2, double gPA2,
		String firstPeriod, String firstGrade, String secondPeriod,
		String secondGrade, String thirdPeriod, String thirdGrade) {
	// TODO Auto-generated constructor stub
}

public void createArraylist() throws IOException
{

Scanner file = new Scanner(new File("studentlist2.txt"));

while(file.hasNext())
{
	firstName = file.next();
	lastName = file.next();
	Period1 = 1;
	class1 = file.next();
	gradeClass1 = file.next();
	Period2 = 2;
	class2 = file.next();
	gradeClass2 = file.next();
	Period3 = 3;
	class3 = file.next();
	gradeClass3 = file.next();
	GPA = 0; 
	
	database.add(new Students(firstName, lastName, Period1, class1, gradeClass1, Period2, class2, gradeClass2, Period3, class3, gradeClass3, GPA));
	
}

	}


public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public int getPeriod1() {
	return Period1;
}

public void setPeriod1(int period1) {
	Period1 = period1;
}

public String getClass1() {
	return class1;
}

public void setClass1(String class1) {
	this.class1 = class1;
}

public String getGradeClass1() {
	return gradeClass1;
}

public void setGradeClass1(String gradeClass1) {
	this.gradeClass1 = gradeClass1;
}

public int getPeriod2() {
	return Period2;
}

public void setPeriod2(int period2) {
	Period2 = period2;
}

public String getClass2() {
	return class2;
}

public void setClass2(String class2) {
	this.class2 = class2;
}

public String getGradeClass2() {
	return gradeClass2;
}

public void setGradeClass2(String gradeClass2) {
	this.gradeClass2 = gradeClass2;
}

public int getPeriod3() {
	return Period3;
}

public void setPeriod3(int period3) {
	Period3 = period3;
}

public String getClass3() {
	return class3;
}

public void setClass3(String class3) {
	this.class3 = class3;
}

public String getGradeClass3() {
	return gradeClass3;
}

public void setGradeClass3(String gradeClass3) {
	this.gradeClass3 = gradeClass3;
}

public double getGPA() {
	return GPA;
}

public void setGPA(double gPA) {
	GPA = gPA;
}

public ArrayList<Students> getDatabase() {
	return database;
}

public void setDatabase(ArrayList<Students> database) {
	Students.database = database;
}

@Override
public  String toString() {
	return "\n\n" +firstName + " " + lastName+"\n" + "Period " + Period1 +") " +  class1 + " " +gradeClass1 +" " +  "\nPeriod "+Period2 +  ") " +class2+ " " + gradeClass2 + " " + "\nPeriod "+Period3+ ") " +class3 + " " +gradeClass3 + " " +"\nGPA: " +GPA;
}

public static int getPeriodThreeGrade() {
	// TODO Auto-generated method stub
	return 0;
}


}