//
//
//
//
//void printDigit(int num){
//
//    while(num != 0){
//
//
//        int digit = num % 10;
//        System.out.println(digit);
//
//        num = num/10;
//
//
//    }
//
//}
//
//
//void main() {
//
//    int num = 5321 ;
//    printDigit(num);
//
//}


    //+++++++++++++++ count digit of a number


//int countNumber(int num){
//    int count = 0;
//
//    while(num != 0){
//
//        int digit  = num % 10;
//        count++ ;
//
//         num = num / 10;
//
//    }
//
//    return count ;
//
//}
//
//
//   void main() {
//
//    int num = 32544997;
//    int ans = countNumber(num);
//
//
//       System.out.println(ans);
//
//
//
//}


//


////+++++++++++++++ reverse of a number
//
//
//void main(){
//
//    int num = 12431;
//    int ans = reverse_num(num);
//    System.out.println(ans);
//
//
//}
//
//
//int reverse_num(int num){
//    int rev_num = 0 ;
//    while(num != 0){
//
//        int digit = num % 10;
//        rev_num = rev_num*10+digit;
//        num = num /10;
//
//    }
//
//    return rev_num ;
//}



//+++++++++++++++ number is   palindrome number or not
//
//
//void main(){
//
//    int num = 111;
//    boolean ans = palindrome(num);
//    System.out.println(ans);
//
//
//}
//
//
//int reverse_num(int num){
//    int rev_num = 0 ;
//    while(num != 0){
//
//        int digit = num % 10;
//        rev_num = rev_num*10+digit;
//        num = num /10;
//
//    }
//
//    return rev_num ;
//}
//
//
//  boolean palindrome( int num ){
//
//    int org_num = num ;
//    int revr_num = reverse_num(num);
//
//    if(org_num == revr_num){
//        System.out.println(" number is palendrmic");
//        return true;
//    }
//    else{
//        System.out.println("number is not palendromic m,");
//        return false;
//
//    }
//
//
//
//  }


////+++++++++++++++ number is   prime  number or not
//
//void main(){
//
//int num = 133 ;
//boolean ans = primeNum(num);
//    System.out.println(ans);
//
//
//}
// // here is the best case  root2 method and optimise
// boolean primeNum(int num ){
//
//     for(int i = 2 ; i*i <= num  ; i++){
//
//         if(num%i == 0){
//             System.out.println("number is not prime");
//             return false ;
//         }
//
//    // this is the worst case here the loop is running n-1
////    for(int i = 2 ; i<= num -1 ; i++){
////
////        if(num%i == 0){
////            System.out.println("number is not prime");
////            return false ;
////        }
//
//
//    }
//         System.out.println("number is prime");
//         return true ;
//
// }



//+++++++++++++++ GCD of a number (higst common factor )










