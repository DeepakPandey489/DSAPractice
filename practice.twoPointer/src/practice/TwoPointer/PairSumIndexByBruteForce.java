package practice.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairSumIndexByBruteForce {

	public static void main(String[] args) {
		int[] arr = { 7, 2, 11, 9 };
		int target=9;
		
		List<List<Integer>> list=new ArrayList<>(); 
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println(Arrays.asList(Arrays.asList(i,j)));
				}
			}
		}
	}
}
