package com.java.study.yalco;

public class Ex {
    public static void main(String[] args) {
        /*** 변수 선언 ***/

        String 대학 = "성결대학교";
        int age =20;
        boolean isMarried = true;
        double height = 123.3213;

        System.out.println("대학 = " + 대학);


        /*** 변수 선언2 ***/

        String 이름 = "이범기", 이름2 = "이범기 2", 이름3 = "이범기3";

        /** final 변수 **/

        final String FINAL_VAR ="이범기";  //final 변수는 값을 바꿀 수 없게된다.
//        FINAL_VAR = "이범기2"; // 이렇게 바꿀 수 없다.


        byte byteNum;
        int smallIntNum = 123;

        ///강제 형변환
        byteNum = (byte)smallIntNum;

        System.out.println("byteNum = " + byteNum);
    }
}
