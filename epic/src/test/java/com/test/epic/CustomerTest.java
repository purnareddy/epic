package com.test.epic;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTest {

	Customer customer1 = new Customer("customer1");

	@Test
	public void testConstructorOfCustomer() {
		assertEquals("customer1", customer1.getName());
		assertNotNull(customer1.getName());
	}

	@Test
	public void testIfMemberIsSetAndReturnedCorrectly() {
		customer1.setMember(true);
		assertEquals(true, customer1.isMember());
		customer1.setMember(false);
		assertEquals(false, customer1.isMember());
	}

	@Test
	public void testIfMemberTypeIsSetAndReturnedCorrectly() {
		customer1.setMemberType("premium");
		assertEquals("premium", customer1.getMemberType());
		customer1.setMemberType("gold");
		assertEquals("gold", customer1.getMemberType());
		customer1.setMemberType("silver");
		assertEquals("silver", customer1.getMemberType());
	}

	@Test
	public void testIfCorrectNameIsReturned() {
		assertEquals("customer1", customer1.getName());
		assertNotNull(customer1.getName());
	}

	@Test
	public void testToStringMethodOfCustomer() {
		fail("Not yet implemented");
	}

}
