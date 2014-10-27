import java.util.Comparator;

public class SortByPeriod2 implements Comparator<Students>
	{
	public int compare(Students s1,Students s2)
		{
		return s1.getPeriod2().compareTo(s2.getPeriod2());
		}
	}