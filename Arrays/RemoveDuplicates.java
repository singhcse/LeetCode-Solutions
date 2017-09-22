import java.util.*;

public class RemoveDuplicates{
	
	public static int removeDuplicates(int[] arr){
		if(arr.length == 0){
			return 0;
		}
		
		int prev=0;
		for(int next=1;next<arr.length;next++){
			if(arr[next] != arr[prev]){
				arr[++prev] = arr[next];
			}
			return ++prev;
		}
		
	}
	
	public static void main(String []arg){
		int[] arr1 = {12,23,23,32,45,45,53,59,62,62};
		System.out.println(removeDuplicates(arr1));
	}


}