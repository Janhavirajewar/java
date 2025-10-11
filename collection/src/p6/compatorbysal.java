package p6;

import java.util.Comparator;
import p6.employe;

public class compatorbysal  implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		employe e1=(employe)o1;
		employe e2=(employe)o2;
		
		return (int) (e1.salary-e2.salary);
	}

}
