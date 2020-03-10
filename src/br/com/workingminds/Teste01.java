package br.com.workingminds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Teste01 {

	public static void main(String[] args) {
		
		Integer[] arr = { 32, 47, 41, 7, 47, 9, 36, 32, 20, 15 , 11, 9, 6, 37, 9, 39, 45, 29, 29, 19, 28, 21, 50, 19, 43 };
		int min = 1, max = 50;
		
		Arrays.sort(arr);
		
		List<Integer> listaInt = new ArrayList<>();
		
		for (int i = min; i <= max; i++) {
			
			if(!Arrays.asList(arr).contains(i)) {
				listaInt.add(i);
			}
			
		}
		
		System.out.println(listaInt.toString()); 

	}

}
