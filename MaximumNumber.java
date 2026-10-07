// Question:
// Write a Java program to find the maximum number in an array.
//
// Example:
// Input:  {1, 4, 7, 8, 9}
// Output: 9
//
// Time Complexity: O(n)
// Space Complexity: O(1)


class main {

 static int maximumNumber(int[]  arr){

  int maxi = arr[0];

   for(int i=0 ; i<arr.length ; i++ ){
     if(arr[i]>maxi){
       maxi=arr[i];
     }
   }
   return maxi;
 }

  

  public static void main(String [] args){


    int[] arr={1 , 4 , 7 , 8, 9};

    System.out.print("maximum number is  "+ maximumNumber(arr));
    
     
    
  }
}
