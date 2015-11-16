package app;

public class Main {

	public static void main(String[] args) {
		int sum = 0;
		for (String s: args){
			try{
				sum += Integer.valueOf(s);
			}
			catch(NumberFormatException e){
				System.out.println("Argument " + s +" does not contain integer number");
			}
		}
		System.out.println("Sum = " + sum);
	}

}
