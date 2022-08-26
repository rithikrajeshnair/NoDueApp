package StudentPack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import authenticationPack.Authentication;

 public class Student {
	static String CollegeName = "College Name";
	final int ID;
	String Name;
	String Branch;
	int Batch;
	float due;
	transient String password = ".";
//	Map<String , String> studentRecord = new HashMap<String , String>(); 

	
	public Student(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Student Details: ");
		System.out.println("Unique Student ID: ");
		ID = sc.nextInt();
		System.out.println("Name: ");
		sc.nextLine();
		Name = sc.nextLine();
		System.out.println("Branch: ");
		Branch = sc.next();
		System.out.println("Batch: ");
		Batch = sc.nextInt();	
		sc.nextLine();

		System.out.println("Password: ");
		String pas = "*";
	
		while( pas.compareTo(password)!= 0) {
			pas = sc.nextLine();
			System.out.println(pas);
			System.out.println("Confirm Passwod: ");
			password = sc.nextLine();
			if (pas.compareTo(password)!= 0) {
				System.out.println("Password Doesn't match!!! Try again>>>>>");
			}
			else {
				System.out.println("Password set!!!");
			}
		}
		
		sc.close();
		String str = ID + "\t" + Name + "\t" + Branch + "\t" + Batch + Authentication.Hashing(password) + "\n";
		writeToFile(str);
//		studentRecord.put(Name, Authentication.Hashing(password));
		
	}
	void writeToFile(String str) {
		try {
				Path path = Paths.get("C:\\Users\\rithi\\Desktop\\stud.txt");
				Files.write(path, str.getBytes(), StandardOpenOption.APPEND);
		}
		catch( IOException e ){
			System.out.println(e.getMessage());
		}		
	}
		

	
//	student_auth
	
}

// class trial{
//	 public static void main(String[] args) {
//			Student s= new Student();
//			
// }}