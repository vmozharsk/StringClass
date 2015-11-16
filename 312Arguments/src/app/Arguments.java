package app;

public class Arguments {

	public static void main(String[] args) {
		int count = args.length; 
		for (int i = 0; i < count; i += 2) { 		
			System.out.println(args[i]); 
		} 

	}

}
