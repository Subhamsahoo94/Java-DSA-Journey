// Problem:
// Given an integer array, create a new array where each element
// is multiplied by 10.
//
// Example:
// Input:  arr = {1, 2, 3, 4}
// Output: {10, 20, 30, 40}
//
// Time Complexity: O(n)
// Space Complexity: O(n)

class Main {

    static int[] multyplyBy10(int[] arr){

        int size = arr.length;
        int[] newArray = new int[size];

        for(int i=0 ; i< size ; i++){

     int element = arr[i]*10;

    newArray[i] = element;
     

            
            
        }

      return newArray ;
    }

    public static void main(String[] args) {


      int[]  arr = {1 , 2 , 3 , 4};
        int[] newArray = multyplyBy10(arr);

          for(int i :newArray){
              System.out.print(i+"   ");
          }
 
        



        
    }
}
