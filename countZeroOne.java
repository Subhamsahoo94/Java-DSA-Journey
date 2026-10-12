// counting the all zeros and one in the array


public class main{

 
  static  int[] countingZeroOne(int arr[]){

      int zeroCount = 0 ;
      int oneCount = 0 ; 

      for(int i=0 ; i < arr.length ; i++){

        if(arr[i]==0){
         zeroCount++;
        } else{
         oneCount++;
        }


      }
      
      int ans[]= {zeroCount , oneCount}; 
      return ans ;
    }
          


     public static void main(String[] args){


      int[] arr = {1 ,0 , 1 , 1 , 0};  
     int ans[] = countingZeroOne(arr);
       System.out.println("total number of zero is  " + ans[0]);
       System.out.println("total number of one is  " + ans[1]);


     }


}
