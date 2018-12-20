/**
 * created the Training application for Public Training and Corporate Training which public training fees depends on the no of persons in the group and corporate training fees depends on no of days 
 */
package com.Training;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TrainingTest {
	
	private Training trainingPublic, trainingCorporate; 
		
	@Before
	public void setUp() {
		trainingPublic = new PublicTraining("Java", 5000, 50);
		trainingCorporate = new CorporateTraining("cloud", 35000, 4);
	}
	/**
	 * Test case for Checking Public Training order value.
	 */
	@Test
	public void orderValueOfPublicTraining() {
		double expectedValue = 250000;
		assertEquals(expectedValue, trainingPublic.getOrderValue(), 0);
	}
	/**
	 * Test check for Checking corporate training order value
	 */
	@Test
	public void orderValueOfCorporateTraining() {
		double expectedValue = 140000;
		assertEquals(expectedValue, trainingCorporate.getOrderValue(), 0);
	}
}
