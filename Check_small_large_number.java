// # 9) If the ages of Ram, Shyam and Ajay are input through the keyboard, write
// a program to determine the youngest of the
// # three.
package ushapackage;

public class Check_small_large_number {

	public static void main(String[] args) {
		int temp, size;
	      int array[] = {90, 20, 25, 63, 96, 57};
	      size = array.length;

	      for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){
	            if(array[i]>array[j]){
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }
	         }
	      }
	      System.out.println("Smallest element of the array is:: "+array[0]);
	      System.out.println("Smallest element of the array is:: "+array[--size]);
	   }
	}