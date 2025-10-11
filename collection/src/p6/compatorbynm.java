package p6;

import java.util.Comparator;

public class compatorbynm  implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		employe e1=(employe)o1;
		employe e2=(employe)o2;
		
		return e1.name.compareTo(e2.name);
	}

}
