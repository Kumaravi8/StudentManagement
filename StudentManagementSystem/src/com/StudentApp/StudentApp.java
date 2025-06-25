package com.StudentApp;
import com.StudentService.StudentService;
import com.StudentService.StudentServiceImp1;
import java.util.Scanner;
public class StudentApp {

	public static void main(String[] args) {
		StudentService service=new StudentServiceImp1();
		Scanner sc=new Scanner(System.in);
		System.out.println("********** WELCOME TO STUDENT MANAGEMENT SYSTEM ***********");
		int choice;
		String str;
		while(true) {
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("1.Add Student");
			System.out.println("2.View Student");
			System.out.println("3.Update Student");
			System.out.println("4.Delete Student");
			System.out.println("5.Exit");
			System.out.println("----------------------------------------------------------------------------");
			
			System.out.println("Enter Your Choice");
			choice=sc.nextInt();
			switch (choice) {
			case 1: {
				service.addStudent();
				break;
			}
			case 2: {
				service.viewStudent();
				break;
			}
			case 3: {
				service.updateStudent();
				break;
			}
			case 4: {
				service.deleteStudent();
				break;
			}
			case 5: {
				System.out.println("Exiting... Thank You!");
				break;
			}
			default:
			System.out.println("Invalid choice! Try again. ");	
			break;
			}
			System.out.println("Do You Want To Continue?(Yes/No)");
			str =sc.next();
			if (str.equalsIgnoreCase("No")) {
				System.out.println("THANK YOU . WELCOME AGAIN!!!");
				break;
			}
		} 
		sc.close();
	}
}
