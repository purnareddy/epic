package com.test.epic;

public class Customer {

	private String name;
	private boolean member;
	private String memberType;

	public Customer(String name) {
		this.name = name;
	}

	public boolean isMember() {
		return member;
	}

	public String getMemberType() {
		return memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	public String getName() {
		return name;
	}

	public void setMember(boolean member) {
		this.member = member;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", member=" + member + ", memberType=" + memberType + "]";
	}

}
