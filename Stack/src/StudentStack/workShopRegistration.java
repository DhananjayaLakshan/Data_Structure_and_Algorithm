package StudentStack;
import java.util.*;

public class workShopRegistration {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the total number of students: ");
		int totalStudents = sc.nextInt();
		
		StackX studentIDStack = new StackX(totalStudents);
		
		for (int i = 1; i <= totalStudents; i++) {
			System.out.print("Enter studnt ID for student " + i + " :");
			int studentID = sc.nextInt();
			studentIDStack.push(studentID);
		}
		
		System.out.println("Enter number of available seats: ");
		int availableSeats = sc.nextInt();
		
		StackX eligibleStudentsStack = new StackX(totalStudents);
		
		//remove students who cannot attend the workshop
		if(availableSeats < totalStudents) {
			int studentsToRemove =  totalStudents - availableSeats;
			
			System.out.println("Ineligible students IDs: ");
			for (int i = 0; i < studentsToRemove; i++) {
				System.out.println(studentIDStack.pop());
			}
		}else {
			System.out.println("All students are eligible to attend the workshop.");
		}
		
		System.out.println("Eligible student IDs: ");
		while(!studentIDStack.isEmpty()) {
			int eligibleStudentID = studentIDStack.pop();
			eligibleStudentsStack.push(eligibleStudentID);
			System.out.println(eligibleStudentID);
		}
		
	}

}
