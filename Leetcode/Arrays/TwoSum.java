import java.util.*;

public class TwoSum{
	
	public static int[] twoSum(int[] nums,int target){
		int[] temp = new int[2];
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=1;i<nums.length;i++){
			Integer val = map.get(target - nums[i]);
			if(val == null){
				map.put(nums[i] , i);
			}
			else{
				temp[0]= val;
				temp[1]=i;
				break;
			}
		}
		return temp;
		
	}
	
	public static void main(String []arg){
		int[] arr1 = {12,23,1,5,3,9,2};
		int target = 28;
		int[] arr2 = new int[2];
		arr2 = twoSum(arr1,target);
		for(int i=0;i<2;i++) System.out.println(arr2[i]);
	}


}