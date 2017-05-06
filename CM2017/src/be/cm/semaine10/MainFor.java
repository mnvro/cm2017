package be.cm.semaine10;

import java.util.ArrayList;

public class MainFor {
	public static void main(String[] args) {
		ArrayList<Integer> cotes = new ArrayList<Integer>();
		cotes.add(5);
		cotes.add(10);
		
		for (Integer integer : cotes) {
			System.out.println(integer);
		}
		
	}

}
