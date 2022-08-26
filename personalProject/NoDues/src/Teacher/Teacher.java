package Teacher;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

//import StudentPack.Student;

public class Teacher {
	int TID;
	String Tname;
	String TBranch;
	
	Teacher(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Teacher's Details: ");
		System.out.println("Teacher ID: ");
		TID = sc.nextInt();
		System.out.println("Teacher's Name: ");
		sc.nextLine();
		Tname = sc.nextLine();
		System.out.println("Branch: ");
		TBranch = sc.nextLine();
		String str = TID + "\t" + Tname + "\t" + TBranch + "\n" ;
		sc.close();
		writeToFile(str);
		
 	}
	public void writeToFile(String str) {
		try {
			Path path = Paths.get("C:\\Users\\rithi\\Desktop\\teach.txt");
			Files.write(path, str.getBytes(), StandardOpenOption.APPEND);
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
//	public static void main(String[] args) {
//		Teacher s= new Teacher();
//		
//
//	}
	}
