/**
 * 
 */
package fizzbuzzNew;

import org.junit.Test;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 * @author akrishn
 *
 */

public class FizzBuzzNewTest {

	@Test
	public void testConvert() { // not used after Step 1
	    FizzBuzzConvertorNew fizzBuzz = new FizzBuzzConvertorNew();
		Assert.assertEquals("1", fizzBuzz.convert("1")); // Step 1
		// String actual = "1'";
		// Assert.assertEquals("Neither-Fizz-Nor-Buzz", fBuz.convert(1));
		// Assert.failNotEquals("Neither-Fizz-Nor-Buzz", "1", fBuzz.convert(1) );
	} 

	/**
	 * @throws java.lang.Exception
	 */
	/**
	 * Test method for
	 * {@link fizzbuzz3ConverterPkg.FizzBuzz3Converter#convert(int)}.
	 */
	public String expected = "";

	// Step 3 -- Uncomment lines below (From Here)
	@Test
	public void fizzBuzzConverterLeaveNormalNumbersAlone() {
	    FizzBuzzConvertorNew fizzBuzz = new FizzBuzzConvertorNew();
		Assert.assertEquals("83", fizzBuzz.convert("83"));
	}

	@Test
	public void fizzBuzzConverterMultiplesOfThree() {
	    FizzBuzzConvertorNew fizzBuzz = new FizzBuzzConvertorNew();
		Assert.assertEquals("Buzz", fizzBuzz.convert("3"));
	}

	@Test
	public void fizzBuzzConverterMultiplesOfFive() {
	    FizzBuzzConvertorNew fizzBuzz = new FizzBuzzConvertorNew();
		Assert.assertEquals("Fizz", fizzBuzz.convert("5"));
	}

	@Test
	public void fizzBuzzConverterMultiplesOfThreeAndFive() {
	    FizzBuzzConvertorNew fizzBuzz = new FizzBuzzConvertorNew();
		Assert.assertEquals("FizzBuzz", fizzBuzz.convert("15"));
	}


	@Test
	public void fizzBuzzConverterNegatives() {
	    FizzBuzzConvertorNew fizzBuzz = new FizzBuzzConvertorNew();
		Assert.assertEquals("FizzBuzz", fizzBuzz.convert("-21"));
	}

	@Test
	public void fizzBuzzConverterFraction() {
	    FizzBuzzConvertorNew fizzBuzz = new FizzBuzzConvertorNew();
		Assert.assertEquals("FizzBuzz", fizzBuzz.convert("2/7"));
	}

	@Test
	public void fizzBuzzConverterString() {
	    FizzBuzzConvertorNew fizzBuzz = new FizzBuzzConvertorNew();
		Assert.assertEquals("FizzBuzz", fizzBuzz.convert("aBc"));
	}

	@Test
	public void testConvertTo100() {
	    FizzBuzzConvertorNew fizzBuzz = new FizzBuzzConvertorNew();
		for (int i = 1; i <= 100; i++) {
			System.out.println("Main: i=" + i + "==> Converted to: " + fizzBuzz.convert(String.valueOf(i)));
		}
		// fail("Not yet implemented");
	}
	// Step 3 -- Uncomment lines below (Till Here)

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

}
