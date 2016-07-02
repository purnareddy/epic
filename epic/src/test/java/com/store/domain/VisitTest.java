package com.store.domain;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.store.domain.Customer;
import com.store.domain.Visit;

public class VisitTest {
	static Visit v1;
	@BeforeClass
	public static void dataSetUp() {
		try { v1 = new Visit(new Customer("John"), new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse("2011-01-18 00:00:00.0"));
		} catch(Exception e){
//			message
		}
	}
	
	@Test
	public void testCOnstructorOfVisit() {
		assertNotNull("v1 shouldnt not be null", v1);
	}

	@Test
	public void testGetName() {
		assertNotNull("v1 shouldnt not be null", v1);
	}

	@Test
	public void testGetServiceExpense() {
		v1 = null;
	}

	@Test
	public void testSetServiceExpense() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetProductExpense() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetProductExpense() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTotalExpense() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

}
