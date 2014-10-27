import java.util.Comparator;

public class SortByPeriod3 implements Comparator<Students>
	{
	public int compare(Students s1,Students s2)
		{
		return s1.getPeriod3().compareTo(s2.getPeriod3());
		}
	}