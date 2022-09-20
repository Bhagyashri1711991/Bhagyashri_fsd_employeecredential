package Driverclaass;

import employeeDetails.Employee;
import java.util.*;


public class Driver {
  public static void main(String[] args)
{ 
	  Employee e1= new Employee("Virat","Kohli");
    Scanner sc= new Scanner(System.in);
  
  CredServices cs= new CredServices();
  String generateEmail;
  char[] generatePassword;
  
  System.out.println("Please Choose your department");
  System.out.println("1.Tech");
  System.out.println("2.Legal");
  System.out.println("3.HR");
  System.out.println("4.Accounts");
  int choice =sc.nextInt();
  
  
  switch(choice)
  {
  case 1: generateEmail=cs.generateEmailID(e1.getFirstName().toLowerCase(),e1.getLastName().toLowerCase(),"tech");
        generatePassword=cs.generatePassword();
           break;
  case 2: generateEmail=cs.generateEmailID(e1.getFirstName().toLowerCase(),e1.getLastName().toLowerCase(),"legal");
         generatePassword=cs.generatePassword();        
         break;
  case 3: generateEmail=cs.generateEmailID(e1.getFirstName().toLowerCase(),e1.getLastName().toLowerCase(),"legal");
          generatePassword=cs.generatePassword();        
           break;
  case 4: generateEmail=cs.generateEmailID(e1.getFirstName().toLowerCase(),e1.getLastName().toLowerCase(),"legal");
          generatePassword=cs.generatePassword();
          break;
  default:
	    System.out.println("Please Enter valid Choice");
	    
  }
  System.out.println("Email ID"+generateEmail); 
  System.out.println("Password"+generatePassword);

	}
}
