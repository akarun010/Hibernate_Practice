package main;

import java.util.Scanner;

import dao.StudentDAO;
import entity.Student;

public class Main {

	public static void main(String[] args) {
		int choice = 0;
		Scanner scanner = new Scanner(System.in);
		StudentDAO dao = new StudentDAO();
		while(choice != 6) {
			System.out.println("===== STUDENT MANAGEMENT =====");
			System.out.println("1. Add Student");
			System.out.println("2. View All Students");
			System.out.println("3. Find Student");
			System.out.println("4. Update Student");
			System.out.println("5. Delete Student");
			System.out.println("6. Exit");
			System.out.println();
			System.out.println();
			System.out.println("Enter choice:");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			if(choice == 1) {
				System.out.println();
				System.out.println("1. Add Student");
				System.out.println();
				System.out.println("Enter The Name: ");
				String name = scanner.nextLine();
				System.out.println("Enter The Email: ");
				String email = scanner.nextLine();
				System.out.println("Enter The Department: ");
				String department = scanner.nextLine();
				System.out.println("Enter The Age: ");
				int age = scanner.nextInt();
				Student student = new Student(name, email, department, age);
				dao.addStudent(student);
			}
			else if(choice == 2) {
				dao.viewStudent();
			}
			else if(choice == 3) {
				System.out.println();
				System.out.println("2. View Student");
				System.out.println();
				System.out.println("Enter The ID: ");
				int id = scanner.nextInt();
				dao.searchStudent(id);
			}
			else if(choice == 4) {
				System.out.println();
				System.out.println("4. Update Student");
				System.out.println();
				System.out.println("Enter The Name: ");
				String name = scanner.nextLine();
				System.out.println("Enter The Email: ");
				String email = scanner.nextLine();
				System.out.println("Enter The Department: ");
				String department = scanner.nextLine();
				System.out.println("Enter The Age: ");
				int age = scanner.nextInt();
				System.out.println("Enter The ID: ");
				int id = scanner.nextInt();
				Student student = new Student(name, email, department, age,id);
				dao.updateStudent(student);
			}
			else if(choice == 5) {
				System.out.println();
				System.out.println("5. Delete Student");
				System.out.println();
				System.out.println("Enter The ID: ");
				int id = scanner.nextInt();
				dao.deleteStudent(id);
			}
			else if(choice == 6) {
				System.out.println("Exit From Student Application....");
			}
			else {
				System.out.println("Invalid Choice");
			}
		}
		scanner.close();
	}

}
