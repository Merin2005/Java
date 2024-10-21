package javalab;
import java.io.*;
public class CreateFile 
{
     public static void main(String[] args) 
     {
    	 try
    	 {
    		 File obj=new File("filename2.txt");
    		 if(obj.createNewFile())
    		 {
    			 System.out.println("File created:"+obj.getName());
    		 }
    		 else
    		 {
    			 System.out.println("File already exists");
    		 }
    	 }
    	 catch(IOException e)
    	 {
    		 System.out.println("An error occured");
    		 e.printStackTrace();
    	 }
	}
}
