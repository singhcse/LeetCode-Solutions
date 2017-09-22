import java.util.*;
public class LongestCP{
	public static String longest(String[] str){
		StringBuilder result = new StringBuilder();
		if(str !=null && str.length > 0){
			Arrays.sort(str);
			char[] a = str[0].toCharArray();
			char[] b = str[str.length - 1].toCharArray();
			
			for(int i=0; i<a.length; i++){
				if(b.length > i && b[i] == a[i]){
					result.append(b[i]);
				}
				else{
					return result.toString();
				}
			}
		}
		return result.toString();
		 
	}
	public static void main(String []arg){
		String[] string = {"Shubham" , "Shurav" , "Shudhanshu" , "Shailaish"};
		System.out.println(longest(string));
		
	}

}