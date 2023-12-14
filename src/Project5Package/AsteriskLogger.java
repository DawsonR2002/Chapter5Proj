package Project5Package;

//3. Create two classes that implement the Logger interface
//a.  AsteriskLogger
//b.  SpacedLogger



//4.  Implement the AsteriskLogger methods:  

//Note:  The AsteriskLogger will use the asterisk or "*".

/*a.  The log method on the AsteriskLogger should print out 
 * the String it receives between 3 asterisks on either side 
 * of the String (e.g. if the String passed in is “Hello”, 
 * then it should print ***Hello*** to the console).
 */

/*b. The error method on the AsteriskLogger should print the String 
 * it receives inside a box of asterisks, with the String preceded 
 * by the word “ERROR:”. For example, if “Hello” is the argument, 
 * the following should be printed:
 */

/* ****************

   ***Error: Hello***

   **************** */
//3a
public class AsteriskLogger implements Logger{

	@Override
	public void log(String logInput) {
		
		// 4a
		System.out.println("***" + logInput + "***");
		System.out.println("");
	}

	@Override
	public void error(String errorInput) {
		int lengthOfString = errorInput.length();
		StringBuilder sbToConvert_TB = new StringBuilder();
		StringBuilder sbWordToConvert_CNTR = new StringBuilder();
		
		for(int looping = 0; looping < lengthOfString + 13; looping++) {
			sbToConvert_TB.append("*");
		}
		
		sbWordToConvert_CNTR.append("***" + "Error: " + errorInput + "***");
		
		//4b
		System.out.println(sbToConvert_TB.toString() + "\n" + sbWordToConvert_CNTR.toString() + "\n" +  sbToConvert_TB.toString());
		System.out.println("");
	}

}
