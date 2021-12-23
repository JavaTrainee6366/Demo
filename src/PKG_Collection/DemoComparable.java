package PKG_Collection;

import java.util.ArrayList;
import java.util.Collections;

public class DemoComparable {
	
	public static void main(String[] args) {
		
		BeanDemo bean = new BeanDemo();
		bean.setName("Jyoti");
		bean.setContact(23456656);
		bean.setRoll_no(131);
		BeanDemo bean1 = new BeanDemo("Vanmathi Ashok", 123, 98989898);
		BeanDemo bean3 = new BeanDemo("Prasanna", 126, 980009898);
		
		ArrayList<BeanDemo> list = new ArrayList<BeanDemo>();
		list.add(bean);
		list.add(bean1);
		list.add(bean3);
		
		Collections.sort(list);
		/*
		 * ContactComparator obj1 = new ContactComparator();
		 * 
		 * Collections.sort(list, obj1);
		 */
		
		for(BeanDemo obj : list) {
			System.out.println(obj.getName()+" : "+obj.getRoll_no()+" : "+obj.getContact());
		}
		
		
	}

}
