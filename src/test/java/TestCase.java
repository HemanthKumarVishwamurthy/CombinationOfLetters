import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.java.test.CombinationOfLetters.NumberOfCombinations;
import com.java.test.CombinationOfLetters.Utils.Constants;

public class TestCase {

	@Test
	public void combinationTest() {
		NumberOfCombinations tester = new NumberOfCombinations(); // MyClass is tested

		// assert statements
		assertEquals("", tester.printCombinations("234"),
				"adg adh adi aeg aeh aei afg afh afi bdg bdh bdi beg beh bei bfg bfh bfi cdg cdh cdi ceg ceh cei cfg cfh cfi");
		assertEquals("", tester.printCombinations("01"), "");
	}

	@Test
	public void combinationFailureTest() {
		NumberOfCombinations tester = new NumberOfCombinations(); // MyClass is tested

		// assert statements
		assertEquals("", tester.printCombinations("abc"),Constants.ERROR_MSG);
		assertEquals("", tester.printCombinations(""),Constants.NON_EMPTY_ERROR_MSG);

	}
}