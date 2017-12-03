package core;

import java.math.BigInteger;
// https://pmd.github.io/pmd-5.1.3/
public class PMD {
	

	// Useless parentheses
	public class UselessParentheses {
		void bar() {
			int value = 0;
			int i = 0;
			String s = null;
			value += (s.replaceAll("\\s", "").toLowerCase().charAt(i));

		}
	}
	
	// BigIntegerInstantiation
	public void BigInteger() {
		BigInteger bi1 = new BigInteger("1"); 	// reference BigInteger.ONE
												// instead
		BigInteger bi2 = new BigInteger("0"); 	// reference BigInteger.ZERO
												// instead
		BigInteger bi3 = new BigInteger("0.0"); // reference BigInteger.ZERO
												// instead
		BigInteger bi4;
		bi4 = new BigInteger("0"); 				// reference BigInteger.ZERO instead
		System.out.println(bi1 + ", " + bi2 + ", " + bi3 + ", " + bi4);
	}
	
	
	// JumbledIncrementer
	public class JumbledIncrementerRule1 {
		public void foo() {
			for (int i = 0; i < 10; i++) { // only references 'i'
				for (int k = 0; k < 20; i++) { // references both 'i' and 'k'
					System.out.println("Hello");
				}
			}
		}
	}

	// ForLoopShouldBeWhileLoop

	public class Foo {
		void bar() {
			for (; true;)
				; // No Initialization or Update part, may as well be: while
					// (true)
		}
	}

	// ReturnFromFinallyBlock
	public class Bar {
		public String foo() {
			try {
				throw new Exception("My Exception");
			} catch (Exception e) {
				throw e;
			} finally {
				return "ok"; // return not recommended here
			}
		}
	}

	// UnconditionalIfStatement
	public class Foo2 {
		public void close() {
			if (true) { // fixed conditional, not recommended

			}
		}
	}



	// ShortVariable
	public class ShortVariable {
		private int q = 15; // field - too short

		public void main(String as[]) { // formal argument - too short
			int r = 20 + q; // local variable - too short
			for (int i = 0; i < 10; i++) { // Not a violation (inside 'for'
											// loop)
				r += q;
			}

		}
	}

	// LongVariable
	public class LongVariable {
		int reallyLongIntName = -3; // VIOLATION - Field

		public void main(String argumentsList[]) { 	// VIOLATION - Formal
			int otherReallyLongName = -5; 			// VIOLATION - Local
			for (int interestingIntIndex = 0; 		// VIOLATION - For
					interestingIntIndex < 10; interestingIntIndex++) {
			}
		}

	}
}

