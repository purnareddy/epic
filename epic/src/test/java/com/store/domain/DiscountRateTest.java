package com.store.domain;

import static org.junit.Assert.*;

import org.junit.Test;

import com.store.domain.DiscountRate;

public class DiscountRateTest {

	@Test
	public void testServiceDiscountRateReturnedByMemberType() {
		assertEquals(0.2, DiscountRate.getServiceDiscountRate("premium"), 0);
		assertEquals(0.15, DiscountRate.getServiceDiscountRate("gold"), 0);
		assertEquals(0.1, DiscountRate.getServiceDiscountRate("silver"), 0);
	}

	@Test
	public void testProductDiscountRateReturnedByMemberType() {
		assertEquals(0.1, DiscountRate.getProductDiscountRate("premium"), 0);
		assertEquals(0.1, DiscountRate.getProductDiscountRate("gold"), 0);
		assertEquals(0.1, DiscountRate.getProductDiscountRate("silver"), 0);
	}

}
