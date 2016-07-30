// course program from Aaron Fonseca


public class Course implements Cloneable {
	private String courseName;
	private String[] students = new String[0];
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}

	public void addStudent(String student) {
		
		String[] tempStudents = new String[students.length + 1]; // length of Students + 1
		
		tempStudents[0] = student; // Add new students to array
		
		for(int i = 1; i<=students.length; i++){
			tempStudents[i] = students[i-1]; // Copy all of students to temp
		}
		students = tempStudents;
		numberOfStudents++;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}

	public void dropStudent(String student) {
		
		String[] tempStudents = new String[students.length - 1];
		int counter = 0;
		
		for (int i = 0; i < students.length; i++) {
			if (students[i] != student) {
				tempStudents[counter] = students[i];
				counter++;
			}
		}
		
		students = tempStudents;
		numberOfStudents--;
	}
	
	public void clear(){
		students = new String[0];
		numberOfStudents = 0;
	}
	
	//added Eric's Override clone code
	@Override
	public Object clone() throws CloneNotSupportedException {
		Course studentClone = (Course)super.clone();
		studentClone.students = students.clone();
		return studentClone;
	}

}
