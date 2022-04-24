package com.company.lockers;

import java.io.File;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class Lockedme {

	static final String projectPath="D:\\Git\\Java Projects\\CompanyLockersProject\\LockedmeFiles";
	
			
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		int ch;
		
	do
	{
		displaymenu();
		System.out.println("Enter your choice");
		ch=Integer.parseInt(obj.nextLine());
		
		switch(ch)
		{
		   case 1:getALLFiles();
		   		break;
		   case 2:createFiles();
		   		break;
		   case 3:deleteFiles();
		   		break;
		   case 4:searchFiles();
		   		break;
		   case 5:System.exit(0);
		   		break;
		   default:System.out.println("Invalid Option");
		   		break;
		   
	}
	}
	while(ch>0);
		
	}
	
	public static void displaymenu()
	{
		
		System.out.println("******************************************");
		System.out.println("\tWelcome to Company Lockers -- Lockedme.com");
		System.out.println("\tDeveloper Name : SOURABH G");
		System.out.println("******************************************");
		System.out.println("\t1. Display all the files");
		System.out.println("\t2. Adding a file to the directory");
		System.out.println("\t3. Delete a file");
		System.out.println("\t4. Search a file");
		System.out.println("\t5. Exit");
		System.out.println("*******************************************");
	}
	
	public static void getALLFiles()

	{
		File[] listOfFiles = new File(projectPath).listFiles();
		
		//if folder is empty
		
		if(listOfFiles.length==0)
			System.out.println(" No Files exist in the directory");
		else
			
			for (File l:listOfFiles)
			{
				System.out.println(l.getName());
			}
		}
	
	public static void createFiles()
	{
		try
		{
			Scanner obj = new Scanner(System.in);
			String filename;
			int linescount;
			
			System.out.println(" Enter the filename:");
			filename=obj.nextLine();
			
			System.out.println("Enter the number of lines:");
			linescount=Integer.parseInt(obj.nextLine());
			
			FileWriter fw = new FileWriter(projectPath+'\\'+filename);
			
			for(int i=1;i<=linescount;i++)
			{
				System.out.println("Enter the file contents:");
				fw.write(obj.nextLine()+"\n");
			}
			
			System.out.println("File created successfully.");
			fw.close();
		}
		catch(Exception ex)
		{
			System.out.println(" Some Error Occured.");
		}
	}
	
    public static void deleteFiles()
    
    {
    	Scanner obj = new Scanner(System.in);
    	try
    	{
    		String filename;
    		System.out.println("Enter filename to be deleted:");
    		filename=obj.nextLine();
    		
    		File fl = new File(projectPath+'\\'+filename);
    		if (fl.exists())
    		{
    			fl.delete();
    		System.out.println("File deleted successfully.");
    		}
    		else
    		{
    			System.out.println("File do not exist.");
    		}
    	}
    	catch(Exception Ex)
    	{
    		System.out.println("Some Error Occured.");
    	}
    }
    
    public static void searchFiles()
    {
    	Scanner obj = new Scanner(System.in);
    	try
    	{
    		String filename;
    		System.out.println("Enter filename to be searched:");
    		filename=obj.nextLine();
    		
    		File fl = new File(projectPath+'\\'+filename);
    		if (fl.exists())
    		{
    			fl.delete();
    		System.out.println("File is available.");
    		}
    		else
    		{
    			System.out.println("File is not available.");
    		}
    		
    	}
    	catch (Exception Ex)
    	{
    		
    	}
    }
    
    
}
