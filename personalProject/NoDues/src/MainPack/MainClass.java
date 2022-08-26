package MainPack;

import java.util.Scanner;

import StudentPack.Student;
import authenticationPack.Authentication;

public class MainClass {

	public static int displayOptions() {
		System.out.println("1. Login\n3. Go back to previous menu\n");		
		System.out.println("Enter ur choice: ");
		Scanner sc = new Scanner(System.in);
		int opt = sc.nextInt();
		sc.close();
		return opt;
	}
	
	public static void main(String[] args) {
		// TODO Main class root from where everything branches out
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		System.out.println("Welcome to No_Due APP!!!!");
		while (choice != 9) {
			System.out.println("1. Admin\n2. Students\3. Teachers\n9. Exit\n\n");
			System.out.println("Input your choice: ");
			switch(choice) {
				case 1 :
					System.out.println("1. Login\n\n3. Go back to previous menu\n");		
					System.out.println("Enter ur choice: ");
					int opt = sc.nextInt();
					if(opt ==  1) {
						System.out.println("Admin \nEnter Password: ");		
						String adminPassword = sc.nextLine();
						if (adminPassword == Authentication.adminPassword) {
							System.out.println("1. Create an Account \n2. Delete an Account \n3. Go back to previous menu\n");		
							System.out.println("Enter ur choice: ");
							opt = sc.nextInt();
							
						}
					}
					else {
						continue;
					}

					
					break;
				case 2: 
					opt = displayOptions();

//					Student.studentsLogin();

					break;
				case 3: 
//					Teacher.teachersLogIn();
					break;
				case 9:
					System.out.println("Thank you!!!! \nExiting ...............");
					break;
				default: 
					System.out.println("Invalid input!!!!! Try again");
				
			}
			sc.close();
		}

	}

}
