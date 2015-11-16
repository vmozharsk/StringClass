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
		StringBuilder temp = new StringBuilder(text);
        StringBuilder txt = temp.reverse();
        // equals gives wrong results
        if (temp.equals(txt)){
        	ret = true;
        }  else{
        	ret = false;
        }
		return ret;
	}
}
