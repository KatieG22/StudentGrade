package com.ait.StudentGrade.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.ait.StudentGrade.StudentGrade;

class StudentGradeTest2 {

StudentGrade studentGrade; 
	
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Inside setup");
		studentGrade = new StudentGrade();
	}

	//https://junit.org/junit5/docs/current/user-guide/#writing-tests-parameterized-tests
	
	@ParameterizedTest(name = "Mark{0} will be {1}")
	@CsvSource({"100,A","99,A","84,B", "85,A", "86,A", "69,C", "70,B","71,B", "83,B", "54,D", "55,C", "56,C", "68,C", "39,E", "40,D", "41,D", "53,D", "24,F", "25,E", "26,E", "38,E", "101,N", "-1,N"})
	
	
	void getGrade(int marks, char result) {
		assertEquals(result,studentGrade.getGrade(marks));
	}
}
