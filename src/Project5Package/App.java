package Project5Package;

/*
 * 6.     Create a class named App that has a main method.

a.  In this class instantiate an instance of each of your logger classes that implement the Logger interface.

b. Test both methods on both instances, passing in Strings of your choice.
 */
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 AsteriskLogger asterisk = new AsteriskLogger();
		 SpacedLogger spaced = new SpacedLogger();
		 
		 asterisk.log("test1");
		 asterisk.error("test2");
		 spaced.log("test3");
		 spaced.error("test4");
	}
	
	

}
