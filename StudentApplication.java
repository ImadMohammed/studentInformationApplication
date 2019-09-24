package javapro;

import java.io.*;         
import java.util.*;
public class StudentApplication {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		menu();


	}
	
	private static void menu() throws IOException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

        int choice = 0;

        System.out.print("*********STUDENT RECORD SYSTEM*********\n\n");
        System.out.println("\t MENU ");
        System.out.println("[1]ADD STUDENT");
        System.out.println("[2]DISPLAY ALL");
        System.out.println("[3]SORT");
        System.out.println("[4]UPDATE");
        System.out.println("[5]SEARCH");
        System.out.println("[6]EXIT");
        System.out.println("Choose an option to perform an operation ");
        
        choice = in.nextInt();
        if (choice == 1) 
        {
            add();
        }

        else if (choice == 2) 
        {
            displayAll();
        }

        else if (choice == 3) 
        {
            sort();
        }

        else if (choice == 4) 
        {
        	System.out.println("[1] UPDATE ID");
        	System.out.println("[2] UPDATE FIRST NAME");
        	System.out.println("[3] UPDATE LAST NAME");
        	System.out.println("[4] UPDATE MAJOR");

        	int uChoice;
        	
        	
        	uChoice = in.nextInt();
        	String old; String updated;
        	
        	if(uChoice==1) {
        		//String old; String updated;
        		System.out.println("Enter the Student ID that you would like to change");
        		in.nextLine();
        		old = in.nextLine();
        		//in.nextLine();
        		System.out.println("Enter the new Student ID");
        		updated = in.nextLine();
        		in.hasNextLine();
        		
        		
        		
        		update("\"D:\\Javapro\\output.txt\"", old, updated);
        	}
        	else if(uChoice==2) {
        		//String old; String updated;
        		System.out.println("Enter the first name that you would like to change");
        		in.nextLine();
        		old = in.nextLine();
        		//in.nextLine();
        		System.out.println("Enter the new first name");
        		updated = in.nextLine();
        		in.hasNextLine();
        		
        		
        		
        		update("\"D:\\Javapro\\output.txt\"", old, updated);
        	}
        	
        	else if(uChoice==3) {
        		//String old; String updated;
        		System.out.println("Enter the last name that you would like to change");
        		in.nextLine();
        		old = in.nextLine();
        		//in.nextLine();
        		System.out.println("Enter the new last name");
        		updated = in.nextLine();
        		in.hasNextLine();
        		
        		
        		
        		update("\"D:\\Javapro\\output.txt\"", old, updated);
        	}
        	
        	else if(uChoice==4) {
        		//String old; String updated;
        		System.out.println("Enter the major that you would like to change");
        		in.nextLine();
        		old = in.nextLine();
        		//in.nextLine();
        		System.out.println("Enter the new major");
        		updated = in.nextLine();
        		in.hasNextLine();
        		
        		
        		
        		update("\"D:\\Javapro\\output.txt\"", old, updated);
        		
        	}
        	
        	else {
        		System.out.println("Invalid");
        	}
        	
        }

        else if (choice == 5)
        {
            search();
        }


        else if( choice == 6)
        {
        	System.out.println("End of the Program! Thank-You");
        System.exit(0);
        
        }

        else
            menu();

    }

    

	private static void search() throws IOException {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
        File myFile = new File("D:\\javapro\\output.txt");
		
		Scanner inputFile = new Scanner(myFile); 
		
		ArrayList<Student> stuList = new ArrayList<Student>();
		  
		 
		
		
		
		while (inputFile.hasNext())
		{
		   String str = inputFile.nextLine();
		   String[] data = str.split("_");
		   
		  
		  
		  stuList.add(new Student(data[0],data[1],data[2],data[3],Integer.parseInt(data[4]),Double.parseDouble(data[5]),data[6]));
		  
		}
		
		System.out.println("[1] SEARCH BY LAST NAME");
		System.out.println("[2] SEARCH BY FIRST NAME");
		System.out.println("[3] SEARCH BY STUDENT ID");
		int choice;
		
		
		choice=keyboard.nextInt();
		
		if(choice==1) {
			  searchByLastName(stuList);
			
			  
		   }
		  
		  else if(choice==2) {
			  searchByFirstName(stuList);
			  
		   }
		  
		  else if(choice==3) {
			  searchByStudentID(stuList);
			  
			 
		  }
		  else {
			  System.out.println("Invalid entry!");
		  
		  }
		  
		
		
		
		
		menu();
	}
	public static void printData(ArrayList<Student>stuList)
	{
		for(Student details: stuList){
			System.out.println(details.getData());
	   }
	}

	private static void searchByStudentID(ArrayList<Student> stuList) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the ID of the student: ");
		String keyboard = input.nextLine();
		boolean check = false;
		for(Student i: stuList)
		{
			if(i.getSid().contains(keyboard))
			{
				check = true;
				 
				 System.out.println(i.getData());
			}
					
		
		}
		if(check==false)
		{
			System.out.println("Student ID not found");
		}
	}

	private static void searchByFirstName(ArrayList<Student> stuList) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first name of the student: ");
		String keyboard = input.nextLine();
		boolean check = false;
		for(Student i: stuList)
		{
			if(i.getFirstName().contains(keyboard))
			{
				check = true;
				 
				 System.out.println(i.getData());
			}
					
		
		}
		if(check==false)
		{
			System.out.println("First Name not found");
		}
		
	}

	private static void searchByLastName(ArrayList<Student> stuList) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the last name of the student: ");
		String keyboard = input.nextLine();
		boolean check = false;
		for(Student i: stuList)
		{
			if(i.getLastName().contains(keyboard))
			{
				check = true;
				 
				 System.out.println(i.getData());
			}
					
		
		}
		if(check==false)
		{
			System.out.println("Last Name not found");
		}
			
	}
		
		
	private static void sort() throws IOException {
		
		
		Scanner in = new Scanner(System.in);
		File myFile = new File("D:\\Javapro\\output.txt");
		
		 Scanner inputFile = new Scanner(myFile); 
		 

	        int choice = 0;
		
		  ArrayList<Student> stuList = new ArrayList<Student>();
		  
		  while (inputFile.hasNext())
			{
			   String str = inputFile.nextLine();
			   String[] data = str.split("_");
			   
			  
			  
			  stuList.add(new Student(data[0],data[1],data[2],data[3],Integer.parseInt(data[4]),Double.parseDouble(data[5]),data[6]));
			  
			}
		  
		// TODO Auto-generated method stub
		  System.out.println("[1]SORT BY FIRST NAME ASCENDING");
		  System.out.println("[2]SORT BY FIRST NAME DESCENDING");
		  System.out.println("[3]SORT BY LAST NAME ASCENDING");
		  System.out.println("[4]SORT BY LAST NAME DESCENDING");
		  System.out.println("[5]SORT BY MAJOR NAME ASCENDING");
		  System.out.println("[6]SORT BY MAJOR NAME DESCENDING");
		  
		  choice = in.nextInt();
		  
		  
		  if(choice==1) {
			  System.out.println("SORT BY FIRST NAME ASCENDING");
		      sortByFirstNameAZ(stuList);
		      printStudents(stuList);
			  
		  }
		  
		  else if(choice==2) {
			  System.out.println("SORT BY FIRST NAME DESCENDING");    
		      sortByFirstNameZA(stuList);
		      printStudents(stuList);
			  
		  }
		  
		  else if(choice==3) {
			  System.out.println("SORT BY LAST NAME ASCENDING");
		      sortByLastNameAZ(stuList);
		      printStudents(stuList);
			  
		  }
		  
		  else if(choice==4) {
			  System.out.println("SORT BY LAST NAME DESCENDING");    
		      sortByLastNameZA(stuList);
		        printStudents(stuList);
		  }
		  
		  else if(choice==5) {
			  System.out.println("SORT BY MAJOR ASCENDING");
		        sortByMajorAZ(stuList);
		        printStudents(stuList);
		  }
		  
		  else if(choice==6) {
			  System.out.println("SORT BY MAJOR DESCENDING");    
		      sortByMajorZA(stuList);
		      printStudents(stuList);
		  }
		  else
			  System.out.println("Invalid entry!");
	
      
      menu();
		
	}

	private static void displayAll() throws IOException {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
        File myFile = new File("D:\\Javapro\\output.txt");
		
		 Scanner inputFile = new Scanner(myFile); 
		
		  ArrayList<Student> stuList = new ArrayList<Student>();
		  
		
		
		while (inputFile.hasNext())
		{
		   String str = inputFile.nextLine();
		   String[] data = str.split("_");
		  
		   stuList.add(new Student((data[0]),data[1],data[2],data[3],Integer.parseInt(data[4]),Double.parseDouble(data[5]),data[6]));
		   
		   
		}
		
		 printStudents(stuList);
		 menu();
		
		
	}

	private static void add() throws IOException {
		// TODO Auto-generated method stub
		int noOfvalues;
		int sid;
	    String firstName;
	    String lastName;
	    String major;
	    int phone;
	    double gpa;
	    String DOB;
	    
	    FileWriter fw =   new FileWriter("D:\\Javapro\\output.txt", true);

		 PrintWriter outputFile = new PrintWriter(fw);
		
		 Scanner keyboard = new Scanner(System.in);
		    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Enter the number of student details to be added");
		    noOfvalues =  keyboard.nextInt();
		    
		    for(int i=0 ; i<noOfvalues; i++) {
		    System.out.println("Enter the student id:");
		    sid = Integer.parseInt(input.readLine());
		    System.out.println("Enter the student firstName:");
		    firstName = input.readLine();
		    System.out.println("Enter the student last Name:");
		    lastName = input.readLine();
		    System.out.println("Enter the student major:");
		    major = input.readLine();
		    System.out.println("Enter the student phone:");
		    phone = Integer.parseInt(input.readLine());
		    System.out.println("Enter the student GPA:");
		    gpa = Double.parseDouble(input.readLine());
		    System.out.println("Enter the student date of birth:");
		    DOB = input.readLine();
		   
		    outputFile.println(sid+"_"+firstName+'_'+lastName+'_'+major+'_'+phone+'_'+gpa+'_'+DOB);

		    }
		    
		    outputFile.close(); 
		    
		    System.out.println("Data stored to file successfully");
		    menu();
		

		
	}

	private static void update(String filePath, String oldString, String newString) throws IOException {
		// TODO Auto-generated method stub
		File fileToBeModified = new File("D:\\Javapro\\output.txt");
        String oldContent = "";
		System.out.println(oldString);
		System.out.println(newString);
         
        BufferedReader reader = null;
         
        FileWriter writer = null;
         
        try
        {
            reader = new BufferedReader(new FileReader(fileToBeModified));
             
            //Reading all the lines of input text file into oldContent
             
            String line = reader.readLine();
             
            while (line != null) 
            {
                oldContent = oldContent + line + System.lineSeparator();
                 
                line = reader.readLine();
            }
             
            //Replacing oldString with newString in the oldContent
             
            String newContent = oldContent.replaceAll(oldString, newString);
             
            //Rewriting the input text file with newContent
             
            writer = new FileWriter(fileToBeModified);
             
            writer.write(newContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                //Closing the resources
                 
                reader.close();
                 
                writer.close();
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
        System.out.println("done");
        menu();
    }
     
		

	

	public static void printStudents(ArrayList<Student>stuList)
   {
		for(Student details: stuList){
			System.out.println(details.getData());
	   }
   }
	
	
	  
	  public static void sortByLastNameAZ(ArrayList<Student>stuList)
	    {
	        Student temp;
	        for(int i = 0; i < stuList.size() -1; i++)
	            for(int j= i+1; j < stuList.size(); j++)
	            {
	                if(stuList.get(i).getLastName().compareTo(stuList.get(j).getLastName()) > 0)
	                {
	                    temp =  stuList.get(i);
	                    stuList.set(i,stuList.get(j));
	                    stuList.set(j,temp);
	                }
	            }
	    }
	  
	  public static void sortByLastNameZA(ArrayList<Student>stuList)
	    {
	        Student temp;
	        for(int i = 0; i < stuList.size() -1; i++)
	            for(int j= i+1; j < stuList.size(); j++)
	            {
	                if(stuList.get(i).getLastName().compareTo(stuList.get(j).getLastName()) < 0)
	                {
	                	    temp =  stuList.get(i);
	                	    stuList.set(i,stuList.get(j));
	                	    stuList.set(j,temp);
	                }
	            }
	    }
	  
	  public static void sortByFirstNameAZ(ArrayList<Student>stuList)
	    {
		  Student temp;
	        for(int i = 0; i < stuList.size() -1; i++)
	            for(int j= i+1; j < stuList.size(); j++)
	            {
	                if(stuList.get(i).getFirstName().compareTo(stuList.get(j).getFirstName()) > 0)
	                {
	                    temp =  stuList.get(i);
	                    stuList.set(i,stuList.get(j));
	                    stuList.set(j,temp);
	                }
	            }
	    }
	  
	  public static void sortByFirstNameZA(ArrayList<Student>stuList)
	    {
		  Student temp;
	        for(int i = 0; i < stuList.size() -1; i++)
	            for(int j= i+1; j < stuList.size(); j++)
	            {
	                if(stuList.get(i).getFirstName().compareTo(stuList.get(j).getFirstName()) < 0)
	                {
	                	    temp =  stuList.get(i);
	                	    stuList.set(i,stuList.get(j));
	                	    stuList.set(j,temp);
	                }
	            }
	    }
	    
	  public static void sortByMajorAZ(ArrayList<Student>stuList)
	    {
		  Student temp;
	        for(int i = 0; i < stuList.size() -1; i++)
	            for(int j= i+1; j < stuList.size(); j++)
	            {
	                if(stuList.get(i).getMajor().compareTo(stuList.get(j).getMajor()) > 0)
	                {
	                    temp =  stuList.get(i);
	                    stuList.set(i,stuList.get(j));
	                    stuList.set(j,temp);
	                }
	            }
	    }
	  
	  public static void sortByMajorZA(ArrayList<Student>stuList)
	    {
		  Student temp;
	        for(int i = 0; i < stuList.size() -1; i++)
	            for(int j= i+1; j < stuList.size(); j++)
	            {
	                if(stuList.get(i).getMajor().compareTo(stuList.get(j).getMajor()) < 0)
	                {
	                	    temp =  stuList.get(i);
	                	    stuList.set(i,stuList.get(j));
	                	    stuList.set(j,temp);
	                }
	            }
	    }
	    
   




}

