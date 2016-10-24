import java.util.Arrays;


public class SortStringArray {

	public static void main(String[] args) {
		String zz[]={"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman" };
		Arrays.sort(zz);
		
		System.out.println("Ascend: ");
		for (int i=0;i<zz.length;i++)
		{
			System.out.println(zz[i]);
		}
	
	
	}

}
