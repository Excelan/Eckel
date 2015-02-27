package ex10;

import java.util.Arrays;


public class VampireNumbers {
	
	public static void main(String[] args) {
		vampireNumbers();
	}
	
	/**
	 * Finds vampire numbers 
	 */
	public static void vampireNumbers(){
		for (Integer i = 10; i < 100; i++) {
			for (Integer j = 10; j < 100; j++) {
				
				Integer x = i * j;
				
				if (0==i%10 && 0==j%10){
					// prn(String.format("trailing zeroes pair: %d %d Result: %d", i, j, x));
					continue;
				};
				
				
				
				char[] caIj = (i.toString() + j.toString()).toCharArray();
				char[] caResult = x.toString().toCharArray();
				
				Arrays.sort( caIj );
				Arrays.sort( caResult );
			
				String ij = new String(caIj);
				String result = new String(caResult);
				
				if (ij.equals(result) ){
					// prn(String.format("%d %d pair: %s Result: %s", i, j, ij, result));
					prn(String.format("%d = %d * %d", x, i, j));
				}
			}
		}
		
	}
	
	
	public static void prn(Object o) {
		System.out.println(o.toString());
	}



}
