package app;

public class Initials {

	public static void main(String[] args) {
		String s ="Можарский Виктор Викторович";
		String[] t = s.split(" ");
		String out = t[1].substring(0,1) + "." + t[2].substring(0,1) + "." + t[0];
		System.out.println(out);
	}

}
