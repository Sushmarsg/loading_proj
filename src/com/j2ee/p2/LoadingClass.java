package com.j2ee.p2;

public class LoadingClass {

	public static void main(String[] args)
	{
		try {
			Class.forName("com.sushma.p1.LoadMembers");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
