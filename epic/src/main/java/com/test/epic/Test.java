package com.test.epic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Test {

	public static void main(String[] args) throws ParseException {
		
		Customer Bob = new Customer("Bob");
		Bob.setMember(true);
		Bob.setMemberType("gold");
		
		Visit v1 = new Visit(new Customer("John"), new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse("2011-01-18 00:00:00.0"));
		v1.setServiceExpense(100);
		v1.setProductExpense(200);
		
		Visit vBob = new Visit(Bob, new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse("2011-01-18 00:00:00.0"));
		vBob.setServiceExpense(100);
		vBob.setProductExpense(200);
		
		System.out.println(v1.getTotalExpense());
		System.out.println(vBob.toString());

	}

}
