package a;
import java.util.Scanner;

public class Studentsystem {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);
    String continueInput;
    
    do {
    	System.out.println("Enter student name:");
        String studentName = scanner.nextLine();
        
        System.out.println("Enter score for English 1:");
        int subject1 = scanner.nextInt();
        
        System.out.println("Enter score for Math 2:");
        int subject2 = scanner.nextInt();
        
        System.out.println("Enter score for Science 3:");
        int subject3 = scanner.nextInt();
        
        int total = subject1 + subject2 + subject3;
        double average = total / 3.0;
        
        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        
        System.out.println("\n--- Student Report ---");
        System.out.println("Name: " + studentName);
        System.out.println("English 1: " + subject1);
        System.out.println("Math 2: " + subject2);
        System.out.println("Science 3: " + subject3);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
        
        System.out.println("\nDo you want to enter details for another student? (yes/no)");
        scanner.nextLine(); // Consume the newline character
        continueInput = scanner.nextLine();
        
    } while (continueInput.equalsIgnoreCase("yes"));
    
    scanner.close();
}

            
        
    }

	

