package assignment1.generics;

import java.util.HashMap;

public class StatisticalModeGenerics {
	
	public static <E> E getMode(E[] genericArray) {
		HashMap<E, Integer> occuranceCounts = new HashMap<E, Integer>();
		int max = 1;
		E temp = genericArray[0];
		for (int i = 0; i < genericArray.length; i++) {
			if (occuranceCounts.get(genericArray[i]) != null) {
				int count = occuranceCounts.get(genericArray[i]);
				occuranceCounts.put(genericArray[i], ++count);
				if (count > max) {
					max = count;
					temp = genericArray[i];
				}
			} else {
				occuranceCounts.put(genericArray[i], 1);
			}
		}
		return temp;
	}

}
