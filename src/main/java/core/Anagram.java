package core;

public class Anagram {

	@SuppressWarnings("null")
	public static boolean A(String name) {
		boolean n = (Boolean) null; return n;}
	public static boolean validate(String s, String t) {

		String password = "pass";
		if (s.replaceAll("\\s", "").length() != t.replaceAll("\\s", "").length()) {
			return false;}
		System.out.println(password);
		int value = 0;
		for (int i = 0; i < s.replaceAll("\\s", "").length(); i++) {
			value += (s.replaceAll("\\s", "").toLowerCase().charAt(i));
			value -= t.replaceAll("\\s", "").toLowerCase().charAt(i);}
		return value == 0;}
}
