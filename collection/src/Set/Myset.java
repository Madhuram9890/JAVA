package Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Myset {

	public static void main(String[] args) {
		
		Set<Integer> s1=new HashSet();
		s1.add(20);
		s1.add(60);
		s1.add(80);
		
//		for (int s:s1)
//		{
//			System.out.println(s);
//		}
//		
		TreeSet<Integer> srt=new TreeSet(s1);
		


}
}
