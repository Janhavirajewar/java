package p7;
import java.util.*;

 class Itterator {

	public static void main(String[] args)
	{
		
		List<String> s1=new ArrayList<String>();
		
		s1.add("janhavi");
		s1.add("pallavi");
		s1.add("rohan");
		s1.add("rohan");
		s1.add("rohan");
		
//		for(String name:s1)
//		{
//			if(name.equals("janhavi"))
//			{
//				name.remove("janhavi");
//			}
//			
//			System.out.println("s1");
//		}
		
		Iterator<String> myit=s1.iterator();
		
		while(myit.hasNext())
		{
			String a1=(String) myit.next();
			if(myit.equals("janhavi"))
				{
					myit.remove();
				}
					
		}
		
		System.out.println(s1);
		
		
		
	}
	
}
