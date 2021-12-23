package PKG_Collection;

import java.util.Comparator;

public class ContactComparator implements Comparator {

	BeanDemo b1;
	BeanDemo b2;
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		b1 = (BeanDemo) o1;
		b2 = (BeanDemo) o2;
		
		if(b1.contact==b2.contact)
		{
			return 0;
		}else if(b1.contact >b2.contact)
		{
			return 1;
			
		}else{
			return -1;
		}
		
	}

}
