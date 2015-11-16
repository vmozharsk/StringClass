package app;

public class E313StringBuilder {

	public static void main(String[] args) {
		testGenerate(10);
		testGenerate(100);
		testGenerate(1000);
		testGenerate(10000);
		//testGenerate(100000);
	}

	static void testGenerate(int n){
		long t1 = System.nanoTime();
		generateString(n);
		long t2 = System.nanoTime();
		long t3 = System.nanoTime();
		generateStringBuilder(n);
		long t4 = System.nanoTime();
		double k = (t2 - t1);
		k /= (t4 - t3);
		System.out.println(String.format("n = %6d   k = %7.2f", n, k));
	}
	
	static String generateString(int n){
	    String ret = "";
        for (int i = 0; i < n; i++){
        	ret += " " + i;
        }
        return ret;
    }
	
	static StringBuilder generateStringBuilder(int n){
	    StringBuilder ret = new StringBuilder();
        for (int i = 0; i < n; i++){
        	ret.append(" ");
        	ret.append(i);
        }
        return ret;
    }
}
