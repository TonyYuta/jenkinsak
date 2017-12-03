package core;

public class App {


	/** The check str value. */
	private String checkStrValue = null;

	/**
		 * The Constructor.
		 */
		public App() {
			this.checkStrValue = "SomeValue";
		}

	/**
	 * Execute some conditions.
	 */
	private void executeSomeConditions() {
		if ("SomeValue".equals(this.checkStrValue)) {
			// Condition 1
		} else if ("SomeValue".equals(this.checkStrValue)) {
			// Condition 2
		}
	}

	/**
	 * Incorrect assignment in if condition.
	 */
	private static void incorrectAssignmentInIfCondition() {
		boolean value = false;
		if (value = true) {
			// do Something
		} else {
			// else Do Something
		}
	}

}
