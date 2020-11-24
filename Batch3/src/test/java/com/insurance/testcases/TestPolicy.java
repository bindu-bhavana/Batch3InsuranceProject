package com.insurance.testcases;

import static org.junit.Assert.*;

import org.junit.Test;

import com.insurance.service.PolicyQuestionsService;
import com.insurance.service.PolicyQuestionsServiceImpl;

public class TestPolicy {
	@Test
	public void testCreatePolicyPositive() {
		PolicyQuestionsService service=new PolicyQuestionsServiceImpl();
		int rows=service.addPolicy(3000, 1025);
		assertEquals(rows,1);
	}
	@Test
	public void testCreatePolicyNegative() {
		PolicyQuestionsService service=new PolicyQuestionsServiceImpl();
		int rows=service.addPolicy(2400, 1003);
		assertNotEquals(rows,1);
	}

	
}
