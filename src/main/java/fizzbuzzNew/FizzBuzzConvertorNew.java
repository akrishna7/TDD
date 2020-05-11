/**
 * 
 */
package fizzbuzzNew;

/**
 * @author akrishn
 *
 */
public class FizzBuzzConvertorNew {

	String retStr = null;

	
	public static void main (String[] args) {
		System.out.println("In New Main method....");
	    FizzBuzzConvertorNew fizzBuzz = new FizzBuzzConvertorNew();
		for (int i = 1; i <= 100; i++) {
			System.out.println("Main: i=" + i + "==> Converted to: " + fizzBuzz.convert(String.valueOf(i)));
		}

	}

	public String convert(String toConvertToFizzBuzz) {
		// TODO Auto-generated method stub
		// Test Step 1:
		// return "1"; //Step 2 -- pass first test
		// return null; //Step 1 -- fail test (default)

		// Step 3 -- uncomment below for all scenarios (From Here)
		//
		// Test Step 2
		// return String.valueOf(toConvertToFizzBuzz);

		// Check if number is a fraction or mixed-integer or non-numeric
		int intStr = 0;
		try
		{
			//System.out.println(intStr + " is an integer.");
			intStr = Integer.parseInt(toConvertToFizzBuzz); // use your variable or object in place of obj
		}
		catch (NumberFormatException e) {
			//System.out.println(intStr + " is NOT an integer.");
			//retStr = null;
			retStr = "FizzBuzz";
		} catch (Exception ex) {
			//System.out.println(intStr + " is NOT an integer.");
			//retStr = null;
			retStr = "FizzBuzz";
			//ex.printStackTrace();
		}

		// Check if number is negative integer
		if (intStr < 0) {
			//return retStr;
			retStr = "FizzBuzz";
		} else if (intStr % 15 == 0) {
			// fizzTest.fizzBuzzConverterMultiplesOfThreeAndFive();
			retStr = "FizzBuzz";
		} else if (intStr % 5 == 0) {
			// fizzTest.fizzBuzzConverterMultiplesOfFive();
			retStr = "Fizz";
		} else if (intStr % 3 == 0) {
			// fizzTest.fizzBuzzConverterMultiplesOfThree();
			retStr = "Buzz";
		} else {
			retStr = String.valueOf(intStr);
			// retStr = "Neither-Fizz-Nor-Buzz";
		}

		return retStr;
		// Step 3 -- uncomment below for all scenarios (Until Here)
	}
}
