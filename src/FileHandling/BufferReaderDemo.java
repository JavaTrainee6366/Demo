package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class BufferReaderDemo {
	
	  public static void main(String args[])throws Exception{    
			
			  FileReader fr=new FileReader("D:\\testout.txt"); 
			  BufferedReader br=new
			  BufferedReader(fr);
			  
			  int i; while((i=br.read())!=-1)
			  { 
				  System.out.print((char)i); 
				 } 
			  br.close();
			  fr.close();
			 
          //Get Data From Console
          
         InputStreamReader r=new InputStreamReader(System.in);    
          BufferedReader brr=new BufferedReader(r);            
          System.out.println("Enter your name");    
          String name=brr.readLine();    
          System.out.println("Enter your age");   
          int x = Integer.parseInt(brr.readLine());
         
          System.out.println("Welcome "+name);    
          System.out.println("Your lucky age is :"+x);
          
          
    }    

}
