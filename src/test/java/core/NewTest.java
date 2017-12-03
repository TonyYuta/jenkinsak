package core;

import org.testng.annotations.Test;

public class NewTest {
	@Test
	public void test1() {
		org.testng.Assert.assertTrue(Anagram.validate("Debit Card", "Bad Credit"), "Error message");
		System.out.println("Debit Card and Bad Credit is anagram? - " + Anagram.validate("Debit Card", "Bad Credit"));
	} // method (test)

	@Test
	public void tes2t() {
		org.testng.Assert.assertTrue(Anagram.validate("The Hurricanes", "These churn air"), "Error message");
		System.out.println("The Hurricanes and These churn air is anagram? - "
				+ Anagram.validate("The Hurricanes", "These churn air"));
	} // method (test)

	@Test(enabled = false)
	public void test3() {
		org.testng.Assert.assertTrue(Anagram.validate("Охренеть", "Не хрена себе"), "Error message");
		System.out.println("Охренеть and Не хрена себе is anagram? - " + Anagram.validate("Охренеть", "Не хрена себе"));
	} // method (test)
} // class
