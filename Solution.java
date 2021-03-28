

import java.util.*;
import java.io.*;

public class Solution{
	static int[] arr;
	
	
	public static void main(String[] args){
		Scanner fr = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		
		int TC = fr.nextInt();
		int n = 0;
		int c = 0;
		
		int best
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i <= TC; i++){
			n = fr.nextInt();
			c = fr.nextInt();
			for(){
				
			}
			reverseSort(n);
			//sb.append("Case #" + i + ": " + reverseSort(arr.length) + "\n");
		}
		System.out.print(sb);
	}
	
	public static int reverseSort(int L){
		int min;
		int minIndex;
		int subArrayLength = 0;
		for(int i = 0; i < L - 1; i++){
			min = arr[i];
			minIndex = i;
			for(int j = i; j < L; j++){	//find minimum
				if(min > arr[j]){
					min = arr[j];
					minIndex = j;
				}
			}
			subArrayLength += reverse(i, minIndex);		//reverse array
		}
		return subArrayLength;
	}
	
	public static int reverse(int start, int minIndex){
		// |0 - 6| = 6 + 1 = 7 
		
		for(int left = start, right = minIndex; left <= right; left++, right--){
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
		}
		return Math.abs(start - minIndex) + 1;
	}
}