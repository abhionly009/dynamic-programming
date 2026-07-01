package main.java.number;

public class DivideTwoInteger {

    public int divide(int dividend, int divisor){
        if (divisor ==0){
            throw new ArithmeticException("/ by zero");
        }

        if (dividend == Integer.MIN_VALUE  && divisor == -1){
           return Integer.MAX_VALUE;
        }

            return  dividend/divisor;

    }

    public static void main(String[] args) {
        DivideTwoInteger divideTwoInteger = new DivideTwoInteger();
        System.out.println(divideTwoInteger.divide(10
                , -3));
    }
}
