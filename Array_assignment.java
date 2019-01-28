package ushapackage;

//Write a Java program to sum values of an array.
//public class Array_assignment {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int int_array[] = {1,2,3,4,5,6,7};
//		int sum = 0;
//		for(int i=0; i<int_array.length; i++)
//		{
//			sum += i;
//		}
//		System.out.println("The sum is " + sum);
//	}
//
//}


//Write a Java program to find max value of an integer array.
//Write a Java program to find min value of an integer array.

//public class Array_assignment {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int int_array[] = {1,2,3,4,5,6,7};
//		int maxValue = int_array[0];
//		int minValue = int_array[0];
//		
//		// max value calculation
//		for(int i=0; i<int_array.length; i++)
//		{
//			if(int_array[i] > maxValue)
//			{
//				maxValue = int_array[i];
//			}
//		}
//		System.out.println("The max value in arrary"+int_array.toString()+" is " + maxValue);
//		
//		// min value calculation
//				for(int i=0; i<int_array.length; i++)
//				{
//					if(int_array[i] < minValue)
//					{
//						minValue = int_array[i];
//					}
//				}
//				System.out.println("The max value in arrary"+int_array.toString()+" is " + minValue);
//		
//		
//	}
//
//}
//
//Write a Java program to calculate the average value of array elements.
//
//public class Array_assignment {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int int_array[] = {1,2,3,4,5,6,7};
//		int sum = 0;
//	
//		for(int i=0; i<int_array.length; i++)
//		{
//			sum += int_array[i];
//		}
//		
//		double average = sum / int_array.length;
//		System.out.println("The average is " + average);
//	}
//
//}
//
//Write a Java program to reverse an array of integer values
//
//public class Array_assignment {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int int_array[] = {1,2,3,4,5,6,7};
//		int j = int_array.length -1;
//		int int_rev_array[] = new int[int_array.length];
//	
//		for(int i=0; i<int_array.length; i++)
//		{
//			int_rev_array[i] = int_array[j--];
//		}
//		
//				System.out.println("The orignal array  is " + Arrays.toString(int_array));
//				System.out.println("The reverse array  is " + Arrays.toString(int_rev_array));
//	}
//
//}
//Write a Java program to find the duplicate values of an array of integer
//values.
//public class Array_assignment {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int int_array[] = {2,3,3,4,5,5,2};
//		
//		for(int i=0; i<int_array.length -1; i++){
//			for (int j= i+1; j<int_array.length; j++){
//					if(int_array[i] == int_array[j] && (i!=j)){
//						System.out.println("Duplicate value in arrary is  : "+ int_array[j]);
//					}
//				}
//		}
//		
//	}
//
//}
//Write a Java program to test if an array contains a specific value.
//
//public class Array_assignment {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int int_array[] = {2,3,3,2,5,5,2};
//		int num_to_find = 2;
//		int count = 0;
//		boolean num_found = false;
//		for(int i=0; i<int_array.length -1; i++){
//			if(int_array[i] == num_to_find){
//				num_found = true;
//				count+=1;
//			}
//		}
//		
//		System.out.println(" Number " + num_to_find+" is found "+count+"times");
//	}
//
//}
//Write a Java program to find the index of an array element.
//public class Array_assignment {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int int_array[] = {2,3,3,2,5,5,2};
//		for(int i=0; i<int_array.length -1; i++){
//			System.out.println(" index "+ i +" "+ int_array[i]);
//		    }
//	}
//}
//
//Write a Java program to remove a specific element from an array.
//import java.util.Arrays;
//
//public class Array_assignment {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int int_array[] = {2,3,3,2,5,5,2};
//		int removeIndex = 3;
//		System.out.println("Orignal Array "+Arrays.toString(int_array));
//		for(int i=removeIndex; i<int_array.length -1; i++){
//			int_array[i] = int_array[i+1];
//		    }
//		
//		System.out.println("New  Array "+Arrays.toString(int_array));
//	}
//}