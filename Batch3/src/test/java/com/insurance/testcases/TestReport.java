package com.insurance.testcases;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.insurance.dto.Generation;
import com.insurance.service.PolicyQuestionsService;
import com.insurance.service.PolicyQuestionsServiceImpl;

public class TestReport {
	@Test
	public void testCreatePolicyPositive() {
		PolicyQuestionsService service=new PolicyQuestionsServiceImpl();
		List<Generation> rglist=new ArrayList<Generation>();
		rglist=service.generateReport(1003);
		boolean b=rglist.isEmpty();
		assertEquals(b,false);
	} 
	@Test
	public void testCreatePolicyNegative() {
		PolicyQuestionsService service=new PolicyQuestionsServiceImpl();
		List<Generation> rglist=new ArrayList<Generation>();
		rglist=service.generateReport(100);
		boolean b=rglist.isEmpty();
		assertNotEquals(b,false);
	} 
}
