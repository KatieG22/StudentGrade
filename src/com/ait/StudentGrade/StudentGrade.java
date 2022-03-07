package com.ait.StudentGrade;

public class StudentGrade {
// 	Testing Hello
	public char getGrade(int studentMarks) {
		char result = ' ';
		if(studentMarks <= 0 || studentMarks >100) {
			result = 'N';
			}
		else if (studentMarks >= 85) {
			result = 'A';
		} 
		else if(studentMarks >= 70) {
			result = 'B';
		} 
		else if(studentMarks >= 55) {
			result = 'C';
		}
		else if(studentMarks >= 40) {
			result = 'D';
		}
		else if(studentMarks >= 25) {
			result = 'E';
		}
		else  {
			result = 'F';
		}
		return result;
	}

}
