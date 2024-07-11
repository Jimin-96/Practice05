package com.javaex.ex06;


public class CConverterApp {

    public static void main(String[] args) {

        double dollar = 100;
        double won = 1000000;
        
        CConverter.setRate(1118.70);
        
        
        CConverter converter = new CConverter();
        
        //100만원을 달러로 출력하기
        double won_Dollar = converter.toDoller(won);
        System.out.println("백만원은 " + won_Dollar + "달러 입니다.");

        //100달러를 원으로 출력하기
        double dollar_Won = converter.toKWR(dollar);
        System.out.println("백달러는 " + dollar_Won + "입니다.");
        
    }

}
