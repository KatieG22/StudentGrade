package com.ait.StudentGrade.Test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.ait.StudentGrade.*;


class StudentGradeTest {
	
	StudentGrade studentGrade;

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Inside setup");
		studentGrade = new StudentGrade(); //object ref
	}

	
	@Test
	void testGradeA() {
		assertEquals('A',studentGrade.getGrade(90));
	}
	
	@Test
	void testGradeA2() {
		assertNotEquals('A',studentGrade.getGrade(84));
	}
	@Test
	void testGradeB() {
		assertEquals('B',studentGrade.getGrade(75));
	}
	
	@Test
	void testGradeC() {
		assertEquals('C',studentGrade.getGrade(60));
	}
	@Test
	void testGradeD() {
		assertEquals('D',studentGrade.getGrade(45));
	}
	@Test
	void testGradeE() {
		assertEquals('E',studentGrade.getGrade(30));
	}
	@Test
	void testGradeF() {
		assertEquals('F',studentGrade.getGrade(20));
	}
	

}
