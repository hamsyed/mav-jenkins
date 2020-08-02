package com.hameed.Java_calculator;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hameed.Java_calcualtor.JenkinsCalculator;

public class JenkinsCalTest {

	@Test
	public void Addtest() {
		
		JenkinsCalculator myadd = new JenkinsCalculator();
		assertEquals(10,myadd.addition(5, 5));
		
	}

	@Test
	public void subTest() {
		
		JenkinsCalculator mysub = new JenkinsCalculator();
		assertEquals(30,mysub.substraction(60, 30));
	
	}
	
	@Test
	public void mulTest() {
		
		JenkinsCalculator mymul = new JenkinsCalculator();
		assertEquals(64,mymul.multiply(8, 8));
	
	}
	
}
