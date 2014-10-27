import java.util.Comparator;

public class CourseSorter implements Comparator<Students>
	{
		public int compare (Students s1, Students s2)
			{
			return s1.getCourseOne().compareTo(s2.getCourseOne());
			}
	}