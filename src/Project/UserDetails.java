package Project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;



public class UserDetails {
	
	ArrayList<StudentDetails> arrList;
	StudentDetails studentDetails;
	Scanner sn;
	InputStreamReader r;  
    BufferedReader brr;            
   
	
	public UserDetails() {
		// TODO Auto-generated constructor stub
		sn = new Scanner(System.in);
		r=new InputStreamReader(System.in); 
		brr=new BufferedReader(r);
		studentDetails  = new StudentDetails();
		arrList = new ArrayList<StudentDetails>();
			
	}
	
	public ArrayList<StudentDetails> userInputData() throws Exception {
		
		System.out.println("Enter Student's Id :");
		int id = sn.nextInt();
		studentDetails.setId(id);
		
		System.out.println("Enter Student's Name:");
		String name  = brr.readLine();
		studentDetails.setName(name);
		
		System.out.println("Enter Student's Contact:");
		String contact  = brr.readLine();
		studentDetails.setContact(contact);
		
		System.out.println("Enter Student's Course:");
		String course  = brr.readLine();
		studentDetails.setCourse(course);
		
		System.out.println("Enter Student's Marks in English:");
		double marks1  = sn.nextDouble();
		studentDetails.setEng(marks1);
		
		System.out.println("Enter Student's Marks in Maths:");
		double marks2  = sn.nextDouble();
		studentDetails.setMaths(marks2);
		
		System.out.println("Enter Student's Marks in Science:");
		double marks3  = sn.nextDouble();
		studentDetails.setScience(marks3);
		
		System.out.println("Enter Student's Marks in Computer Science:");
		double marks4  = sn.nextDouble();
		studentDetails.setComputers(marks4);
		
		arrList.add(studentDetails);
		return arrList;
		
		//studentDetails = new StudentDetails(id, name, contact, course, marks1, marks2, marks3, marks4);
	}

}
