// find first unsorted number in array . 

//Assending order -> 1  , 3 , 5 , 10 .
// Descnding order -> 10 , 8 , 4 , 1 .

// above thse two type  is called sorted array .

// arr =  2 , 3 , 9 , 5 , 13  here 5 is the unsorted element



public class main{


static int  unsortedElement(int arr[]){

  int unsortednumber = -1 ;

   for(int i = 0 ;  i < arr.length-1 ;  i++){

      if(arr[i] > arr[i+1]){
          
         unsortednumber = arr[i];
         break ;
      }
   }
   
   return unsortednumber ;
}

  public static void main( String[]  args){

   int arr[]= {1 , 2  , 3 , 5 , 8 , 6 , 10};

  int unsortednumber = unsortedElement(arr);

   System.out.print(unsortednumber);

  }

}