package com.codingdojo.ali.phone;

public class PhoneTester {

	public static void main(String[] args) {
		//Create new phones with it's values:
		OnePlus onePlusSeven = new OnePlus("7 Pro", 100, "Mint", "Tooot-tooot!!");
		IPhone iphoneEleven = new IPhone("11 Pro", 96, "AT&T", "Xy-lo-phonnneee");
		
		//Details of OnePlus 7 Pro:
		onePlusSeven.displayInfo();
		System.out.println(onePlusSeven.ring());
		System.out.println(onePlusSeven.unlock());
		System.out.println();
		
		//Details of iPhone 11:
		iphoneEleven.displayInfo();
		System.out.println(iphoneEleven.ring());
		System.out.println(iphoneEleven.unlock());
	}
}