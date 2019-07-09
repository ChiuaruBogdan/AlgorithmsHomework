package org.fasttrackit;

public class Exercise {
//    metoda pentru adunare
    double A;
    double B;
    double result;

    public double sum(double A, double B){
        double result = A + B;
        System.out.println(" Suma este " + result);
        return result;

    }

    public int sum(int A, int B) {
        int result = A + B;
        System.out.println(" Suma este " + result);
        return result;
    }
//    metoda pentru impartire

    public double divide(double A, double B){
        double result = A / B;
        System.out.println(" Rezultatul impartirii este " + result);
        return result;

    }

    public int divide(int A, int B) {
        int result = A / B;
        System.out.println(" Rezultatul impartirii este " + result);
        return result;
    }
//    metoda pentru inmultire

    public double multiply(double A, double B) {
        double result = A * B;
        System.out.println(" Rezultatul inmultirii este " + result);
        return result;
    }

public int multiply(int A, int B) {
        int result = A * B;
    System.out.println(" Rezultatul inmultirii este " + result);
    return result;
}



}

