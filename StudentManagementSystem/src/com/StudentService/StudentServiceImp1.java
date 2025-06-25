package com.StudentService;
import com.student.dto.StudentDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class StudentServiceImp1 implements StudentService {
	private ArrayList<StudentDTO> students=  new ArrayList<>();
	private Scanner sc=new Scanner(System.in);
	@Override
	public void addStudent() {
		System.out.println("Enter ID: ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name: ");
		String name=sc.nextLine();
		System.out.println("Enter Marks: ");
		int marks=sc.nextInt();
		sc.nextLine();
		
		students.add(new StudentDTO(id, name, marks));
		System.out.println("Student Added Successfully");
		
	}
	@Override
	public void viewStudent() {
		if (students.isEmpty()) {
			System.out.println("No Student records found");
		}else {
			for(StudentDTO studentDTO: students) {
				System.out.println(studentDTO);
			}
		}
	}
		@Override
		public void updateStudent() {
			System.out.println("Enter Id to Update: ");
			int id=sc.nextInt();
			boolean found=false;
			for (StudentDTO s:students) {
				if (s.getId()==id) {
					sc.nextLine();
					System.out.println("Enter New Name: ");
					String name=sc.nextLine();
					System.out.println("Enter New Marks:");
					int marks=sc.nextInt();
					s.setName(name);
					s.setMarks(marks);
					System.out.println("Student Record Updated");
					found=true;
					break;
				}
			}
			if (!found) {
				System.out.println("Student Not Found.");
				}		
			}
		@Override
		public void deleteStudent() {
			System.out.println("Enter Id to delete");
			int id=sc.nextInt();
			boolean removed=students.removeIf(s -> s.getId()==id);
			if (removed) {
				System.out.println("Student Record Deleted");
				
			}else {
				System.out.println("Student Not Found");
			}
		}
		}
	


