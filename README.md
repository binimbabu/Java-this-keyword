Java this Keyword


package com.bini.babu;

public class thisKewordJava {

	int x;
	
	thisKewordJava(){
		System.out.println(this);
                System.out.println(this.x);
	}
	public static void main(String[] args) {
          new thisKewordJava();
          new thisKewordJava();
	}

}



Output

com.bini.babu.thisKewordJava@378fd1ac
0
com.bini.babu.thisKewordJava@49097b5d
0





the constructor in the above code ( thisKewordJava(){ System.out.println(this);}) is printing this which will refer to the object reference created in the main function (   new thisKewordJava(); ) . Thus the output is (com.bini.babu.thisKewordJava@378fd1ac, 
com.bini.babu.thisKewordJava@49097b5d), which is the address location where the object instance is allocated memory. 'this' keyword points to the object reference. 'this' keyword can be used only non-static context and 'this' cannot be used in static method.

