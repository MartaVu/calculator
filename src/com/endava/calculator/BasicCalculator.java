package com.endava.calculator;

import java.text.DecimalFormat;

public class BasicCalculator {

    private Integer floatingPoint;

    public BasicCalculator(){
        floatingPoint = 5;
    }

    public BasicCalculator(Integer floatingPoint){
        this.floatingPoint = floatingPoint;
    }

    public Integer add(Integer... numbers){
        Integer sum = 0;
        for (Integer n : numbers) {
            sum += n;
        }
        return sum;
    }

    public Integer substract(Integer... numbers){
        Integer res = numbers[0];
        for (int i = 1; i < numbers.length; i++ ) {
            res -= numbers[i];
        }
        return res;
    }

    public Long multiply (Integer... numbers) {
        Long result = 1L;
        for(Integer n : numbers){
            result *= n;
        }
        return result;
    }

    public Double divide (Integer... numbers) {
        Double result = numbers[0].doubleValue();
        for (int i=1; i< numbers.length; i++){
            if (numbers[i] == 0){
                throw new IllegalArgumentException("Deljenje nulom nije dozvoljeno");
            }
            result /= numbers[i];
        }
        return formatDouble(result);
    }

    public Long multiply(Long... numbers) {
        Long result = 1L;
        for (Long n : numbers) {
            result *= n;
        }
        return result;
    }

    public Double divide(Long... numbers) {
        Double result = numbers[0].doubleValue();
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                throw new IllegalArgumentException("Deljenje nulom nije dozvoljeno");
            }
            result /= numbers[i];
        }
        return result;
    }

    public Double multiply(Double... numbers) {
        Double result = 1d;
        for (Double n : numbers) {
            result *= n;
        }
        return result;
    }

    public Double divide(Double... numbers) {
        Double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                throw new IllegalArgumentException("Deljenje nulom nije dozvoljeno");
            }
            result /= numbers[i];
        }
        return result;
    }

    protected Double formatDouble(Double number){
        String pattern = "#.";
        for (int i=1; i<=floatingPoint; i++){
            pattern += "0";
        }

        DecimalFormat numberFormat = new DecimalFormat(pattern);
        String formatResult = numberFormat.format(number);
        return Double.parseDouble(formatResult);
    }
}
