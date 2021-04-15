
public class Course {

	//variables
	String courseTitle;
	String courseNumber;
	
	public Course() {
		String courseTitle;
		String courseNumber;
	}
	//constructor
	public Course(String courseNumber, String courseTitle) {
		this.courseTitle = courseTitle;
		this.courseNumber = courseNumber;
	}
	
	
	//set & get courseTitle
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	
	//set & get for courseNumber
	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}
	public String getCourseNumber() {
		return courseNumber;
	}
	
}

/*
 * Eric Knapp
 * Programming Assignment 5
 * March 9 2021
 * Purpose of program: Course Information
 */