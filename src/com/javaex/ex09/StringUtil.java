package com.javaex.ex09;

public class StringUtil {
    
    public static String concatString(String[] arr){
       
        //메소드 내용작성
    	 String ans = ""; //String의 성질 ""사이가 비어 있으면 "" 사이로 들어감
         for (int i=0; i < arr.length ; i++) {
         	ans = ans + arr[i];
         }
         return  ans;
     }
    }


