
public class OfferedCourse extends Course{
	
	String instructorName;
	String term;
	String classTime;
	
	public OfferedCourse() {
		String instructorName = "none";
		String term = "none";
		String classTime = "none";
		
	}

	public OfferedCourse(String instructorName, String term, String classTime) {
		this.instructorName = instructorName;
		this.term = term;
		this.classTime = classTime;
	}

	//set & get instructor Name
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	public String getInstructorName() {
		return instructorName;
	}
	
	//set & get term
	public void setTerm(String term) {
		this.term = term;
	}
	public String getTerm() {
		return term;
	}
	
	//set & get classTime
	public void setClassTime(String classTime) {
		this.classTime = classTime;
	}
	public String getClassTime() {
		return classTime;
	}
	
}

/*
 * Eric Knapp
 * Programming Assignment 5
 * March 9 2021
 * Purpose of program: Course Information
 */
