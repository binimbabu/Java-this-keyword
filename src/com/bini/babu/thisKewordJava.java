package com.bini.babu;

public class thisKewordJava {

	int x;
	
	thisKewordJava(){
		System.out.println(this);//refers to the object reference memory location
		 System.out.println(this.x); // refers to the variable value declared globally

	}
	public static void main(String[] args) {
     new thisKewordJava();
     new thisKewordJava();
	}

}
