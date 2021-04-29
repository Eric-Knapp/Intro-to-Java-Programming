import java.util.*;
public class CourseInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scnr = new Scanner(System.in);
		
		String courseNumber;
		String courseTitle;
		String courseNumber2;
		String courseTitle2;
		String instructorName;
		String term;
		String classTime;
		
		courseNumber = scnr.nextLine();
        	courseTitle = scnr.nextLine();
		courseNumber2 = scnr.nextLine();
       	 	courseTitle2 = scnr.nextLine();
        	instructorName = scnr.nextLine();
        	term = scnr.nextLine();
        	classTime = scnr.nextLine();
        

        
		Course course1 = new Course();
		OfferedCourse offeredCourse1 = new OfferedCourse();
		
		course1.setCourseNumber(courseNumber);
		course1.setCourseTitle(courseTitle);
		
		offeredCourse1.setCourseNumber(courseNumber2);
		offeredCourse1.setCourseTitle(courseTitle2);
		offeredCourse1.setInstructorName(instructorName);
		offeredCourse1.setTerm(term);
		offeredCourse1.setClassTime(classTime);
		
		System.out.println("Course Information: ");
		System.out.println("   Course Number: " + course1.getCourseNumber() + "\n   Course Title: " + course1.getCourseTitle());
		
		System.out.println("Course Information: ");
		System.out.println("   Course Number: " + offeredCourse1.getCourseNumber() + "\n   Course Title: " + offeredCourse1.getCourseTitle() + "\n   Instructor Name: " + offeredCourse1.getInstructorName() + "\n   Term: " + offeredCourse1.getTerm() + "\n   Class Time: " + offeredCourse1.getClassTime());
	}

}

/*
 * Eric Knapp
 * Programming Assignment 5
 * March 9 2021
 * Purpose of program: Course Information
 */
