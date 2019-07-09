package org.fasttrackit;

public class LogicalOp {

//first exercise
//public void printNumbersLine (int startingNumber){
//    for (int i = 1; i != 100; i++){
//        System.out.print((startingNumber + i) + " ");
//    }
//}

//second exercise

//    public void printNumbersLine (int startingNumber){
//        for (int i = 2; i >= -100; i--){
//            System.out.println(i);
//        }
//    }


// third exercise , trebuie introduse doua numeber in void main ca sa mearga
//
//    public void printNumbersLine( int startingNumber, int endingNumber){
//        for (int i = startingNumber; i <= endingNumber; i++)
//            System.out.println(i);
//    }

// fourth exercise
//    public void printNumbersLine(int x, int y) {
//        if(x<y) {
//            for (int i = x; i <= y; i++){
//                System.out.println(i);
//            }
//        }

//    fifth exercise

//    public void printNumbersLine(int startingNumber){
//        for(int i = 0; i<=100; i++){
//            if (i % 2 == 0){
//                System.out.println(i);
//
//            }
//        }

//    sixth exercise
//    public void printNumbersLine(int startingNumber){
//        for(int i = 1; i<=100; i++) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }

//        seventh exercise
//
//   public void sum (int nr){
//       int sum = 0;
//       for (int i = nr; i <= 100; i++) {
//           sum = sum + i;
//       }
//       System.out.println("The sum is = " + sum);
//       }


//     eight exercise below

//    public void sum (int nr){
//        int sum = 0;
//        int totalnr = 0;
//        for(int i = nr; i <= 100; i++) {
//            sum += i;
//            totalnr++;
//        }
//        double medie = (double)sum/totalnr;
//        System.out.println("Media este = " + medie);
//        }


//exercitiul 9

    public void printPattern (int n){
        for(int i = n; i>0; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}










