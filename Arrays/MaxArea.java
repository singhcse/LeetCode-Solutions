public class MaxArea {
	public int maxArea(int[] height){
		int left = 0;
		int right = height.length - 1;
		int maxarea=0;
		while(left<right){
			maxarea = Math.max(maxarea,Math.min(height[left],height[right]) * (right - left));
			if(height[left] < height[right]) left++;
			else right--;
		}
		return maxarea ; 
	}
}