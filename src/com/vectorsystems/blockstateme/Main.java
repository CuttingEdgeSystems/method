package com.vectorsystems.blockstateme;

public class Main {

    public static void main(String[] args) {
        anotherMethod();
        System.out.println("Test0 -outside of all method");
        doSomething();
        System.out.println("Test2-Outside of all methods");
        showSum(7.5,1.4,3);
       double result= calculateInterest(100d,0.05d, 10);
       System.out.println(result);
       double[] test= produceInterestHistory(100d, 0.05d, 10);
       System.out.println(test);


    }
       static void anotherMethod(){
        System.out.println("Starting inside a Function");
        }

        static void doSomething() {
            System.out.println("Test1--in side method2");
    }

        static void showSum(double x, double y, int count) {

            if (count < 1)
                return;

            double sum = x + y;
            for (int i = 0; i < count; i++)
                System.out.println(sum);
        }
        static double calculateInterest(double amt, double rate, int years) {
            double interest = amt * rate * years;
            return (interest);
        }
        static double[] produceInterestHistory(double amt, double rate, int years) {
            double[] accumulatedInterest = new double[years];
            for (int yearIndex = 0; yearIndex < years; yearIndex++) {
                int year = yearIndex + 1;

            }
            return accumulatedInterest;
        }


}



