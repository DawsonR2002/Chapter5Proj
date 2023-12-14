package Project5Package;

//3. Create two classes that implement the Logger interface
//a.  AsteriskLogger
//b.  SpacedLogger

//3b

/*5. Implement the SpacedLogger methods:

Note:  The SpacedLogger should add a space or " " between each character of the String argument passed into its methods.


a. If the log method received “Hello” as an argument, it should print H e l l o

b. The error method should do the same, but with “ERROR:” preceding the spaced out input (i.e. ERROR: H e l l o)
*/
public class SpacedLogger implements Logger {

	@Override
	public void log(String logInput) {
		// TODO Auto-generated method stub
		char[] charArray = logInput.toCharArray();
		StringBuilder printableLog = new StringBuilder();
		
		for(int i = 0; i < charArray.length; i++) {
			
			printableLog.append(charArray[i]);
			
			if(i < charArray.length - 1) {
				printableLog.append(" ");
			}
		}
		
		//5a
		System.out.println(printableLog.toString());
		System.out.println("");
	}

	@Override
	public void error(String errorInput) {
		// TODO Auto-generated method stub
		char[] charArray = errorInput.toCharArray();
		StringBuilder printableError = new StringBuilder();
		
		printableError.append("ERROR: ");
		
		for(int i = 0; i < charArray.length; i++) {
			
			printableError.append(charArray[i]);
			
			if(i < charArray.length - 1) {
				printableError.append(" ");
			}
		}
		
		//5b
		System.out.println(printableError.toString());
		System.out.println("");
	}

}
