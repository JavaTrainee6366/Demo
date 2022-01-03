package Project;

import java.util.ArrayList;



public class Students {
	
	public static void main(String[] args) throws Exception {
		
		UserDetails st = new UserDetails();
		ArrayList<StudentDetails> arr =  st.userInputData();
		
		for(StudentDetails s : arr)
		{
			System.out.println("Id : "+s.getId());
			System.out.println("Course : "+s.getCourse());
			System.out.println("English : "+s.getEng());
		}
		
	}

}
