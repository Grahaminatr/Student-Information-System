public class Students
{
	private String firstName;
	private String lastName;
	private double GPA;
	private String period1;
	private String period1Grade;
	private String period2;
	private String period2Grade;
	private String period3;
	private String period3Grade;
	
	
	public Students (String fn, String ln, double GPA, String p1, String p1G, String p2, String p2G, String p3, String p3G)
		{
		firstName = fn;
		lastName = ln;
		GPA = GPA;
		period1 = p1;
		period1Grade = p1G;
		period2 = p2;
		period2Grade = p2G;
		period3 = p3;
		period3Grade = p3G;		
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


	public double getGPA() {
		return GPA;
	}


	public void setGPA(double gPA) {
		GPA = gPA;
	}


	public String getPeriod1() {
		return period1;
	}


	public void setPeriod1(String period1) {
		this.period1 = period1;
	}


	public String getPeriod1Grade() {
		return period1Grade;
	}


	public void setPeriod1Grade(String period1Grade) {
		this.period1Grade = period1Grade;
	}


	public String getPeriod2() {
		return period2;
	}


	public void setPeriod2(String period2) {
		this.period2 = period2;
	}


	public String getPeriod2Grade() {
		return period2Grade;
	}


	public void setPeriod2Grade(String period2Grade) {
		this.period2Grade = period2Grade;
	}


	public String getPeriod3() {
		return period3;
	}


	public void setPeriod3(String period3) {
		this.period3 = period3;
	}


	public String getPeriod3Grade() {
		return period3Grade;
	}


	public void setPeriod3Grade(String period3Grade) {
		this.period3Grade = period3Grade;
	}
}