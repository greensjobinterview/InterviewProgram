package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conseq {
	public static void main(String[] args) {

		int[] arr = { 100, 4, 200, 1, 3, 2, 8, 9, 10, 11, 12 };
		Arrays.sort(arr);

		List<Integer> result = new ArrayList<Integer>();
		List<Integer> temp = new ArrayList<Integer>();

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] - arr[i] == 1) {
				temp.add(arr[i]);
			} else {

				if (temp.size() != 0) {
					temp.add(arr[i]);
				}
				if (temp.size() > result.size()) {

					result.clear();
					result.addAll(temp);
					temp.clear();

				}
			}
		}

		System.out.println(result);
	}

}
