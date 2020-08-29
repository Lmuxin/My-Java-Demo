import java.util.Arrays;

public class Resort {
	public static void main(String [] args)
	{
		System.out.println("输入1233"); 
		System.out.println("输出"); 
		System.out.println(test(1233)); 	
		
		System.out.println("输入1323"); 
		System.out.println("输出"); 
		System.out.println(test(1323)); 	
		
		
		System.out.println("输入9876"); 
		System.out.println("输出"); 
		System.out.println(test(9876)); 	
		
	}
				
	static String test(int num) {		
		String string = Integer.toString(num);		
		char[] charArray = string.toCharArray();	
		int[] newArray = new int[charArray.length];		
		for (int i = 0; i < charArray.length; i++) {		
			newArray[i] = Integer.parseInt(String.valueOf(charArray[i]));	
			} 		
	int index = find(charArray); 	
	if (index == -1) { 		
		return "不存在";	
		} 		
	
	int[] reorder = reorder(newArray, index); 	
	return Arrays.toString(reorder); 
	} 	
	static int find(char[] arr) {	
		for (int i = arr.length - 1; i > 0; i--) { 	
			if (arr[i] > arr[i - 1]) {		
				return i; 		
				} 		
			} 	
		return -1; 
		}
	
  static int[] reorder(int[] arr, int index) {	
	int left = arr[index - 1];		
	for (int i = arr.length - 1; i >= index; i--) {		
		int right = arr[i];		
		if (left < right) { 	
			int temp = arr[i];		
			arr[i] = left;			
			arr[index - 1] = right;	
			break; 		
			} 	
		}	
	for (int i = index, j = arr.length - 1; i < j; i++, j--) {	
		int temp = arr[j];	
		arr[j] = arr[i];	
		arr[i] = temp; 	
		} 		
	return arr; 	
	} 
    
	}
	








