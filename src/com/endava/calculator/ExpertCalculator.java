package com.endava.calculator;

public class ExpertCalculator extends BasicCalculator {

    public Double pow(Integer a, Integer n){

        Double rezultat = 1.0;

        for (int i=1; i<=Math.abs(n); i++){
            rezultat *= a;
        }
        if (n < 0)
            return formatDouble(1/rezultat);
        else return formatDouble(rezultat);
    }

    public Double root(Double a){
        if (a<0){
            throw new IllegalArgumentException("Broj ne sme biti manji od nule");
        }
        return formatDouble(Math.sqrt(a));
    }

    public Long factorial(Integer n){

        if (n<0){
            throw new IllegalArgumentException("roj ne sme biti manji od nule");
        }

        if (n == 0){
            return 1L;
        }

        Long rezultat = 1L;
        for (int i=1; i<=n; i++){
            rezultat *= i;
        }
        return rezultat;
    }

    public Long factorialR(Integer n){
        if (n<0){
            throw new IllegalArgumentException("Broj ne sme biti manji od 0");
        }
        if (n==0){
            return 1L;
        }
        return n*factorialR(n-1);
    }

}
