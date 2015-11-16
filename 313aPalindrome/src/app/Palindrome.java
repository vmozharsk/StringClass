package app;

public class Palindrome{

	public static void main(String[] args) {
		boolean isP = isPalindrome("redivider");
		System.out.println(isP);
		isP = isPalindrome("test");
		System.out.println(isP);
	}

	public static boolean isPalindrome(String text){
		boolean ret = true;
		char[] test = text.toCharArray();
		int len = test.length;
		for (int i = 0; i < len; i++){
			if (test[i] != test[len - i - 1]){
				ret = false;
			}
		}
		return ret;
	}
}
