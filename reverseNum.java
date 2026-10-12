 
 // reverse all number in an array
 
 
 public class main{


  static void reverseNumber( int arr[] ){

  int n = arr.length ; 

   int i = 0 ; 
   int j = n-1; 
   
   while(i <= j ){
      // 1.swap

      int temp ; 
      temp = arr[i] ;
      arr[i] = arr[j] ;
      arr[j]  = temp ;

      // move ponter

      i++;
      j--;

      

      
   }
      // print reverse nummber
    
         for(int a : arr){
                  System.out.println("reverse array is  "+ a ) ;
               }
            
    


  }


 public static void main(String[] args){
int arr[] = { 2 , 3 , 5 , 10 , 4  , 8};      




   reverseNumber(arr);

  }




 }