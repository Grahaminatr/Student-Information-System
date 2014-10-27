import java.util.Comparator;

public class SortByperiod1 implements Comparator<Students>
	{
	public int compare(Students s1,Students s2)
		{
		return s1.getPeriod1().compareTo(s2.getPeriod1());
		}
	}