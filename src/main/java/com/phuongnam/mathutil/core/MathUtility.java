/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.phuongnam.mathutil.core;

/**
 *
 * @author PC
 */
//class nay la noi chua cac ham static dung lam thu vien cho cac class
public class MathUtility {
    public static final double PI =3.14;
    //public const double PI=3.14; c#
//    public static long getFactorial(int n){
//        if(n<0 || n>20)
//            throw  new IllegalArgumentException("Invalid n. n must be 0..20");
//        if(n==0 || n==1)
//            return 1;
//        long result =1;
//        for (int i = 2; i <= n; i++) {
//            result *=i;
//        }
//    
//        return result;
//    }
    
    
    //de qu luon phai dung 
    //5! =4!*5
    //=> n! =n *(n-1)!
    //de quy la goi lai chinh minh voi quy mo nho hon
      public static long getFactorial(int n){ //n!
        if(n<0 || n>20)
            throw  new IllegalArgumentException("Invalid n. n must be 0..20");
        if(n==0 || n==1)
            return 1;      
        return n*getFactorial(n-1);
    }
    //Dung de quy
      //Dung ki thuat moi goi la regression testing :kiem thu hoi quy- test lai nhung thu tung test
      //trong thuc te lam du an code cua ta lien tuc chinh sua 
      //sua vi:
      //fix bug thi phai sua code,sua ham
      //them ham,them tinh nang,
      //toi uu ham cu, lam ham gon hon
      //khi ta sua ham ham dang ngon, neu ta sua code vi li do gi do lieu rang ham con xanh khong
      //test lai , neu test bang tay , bang log cuc ki mat thoi gian va ton duc
      //neu code cua ta co san test script -code kiem thu
      //ta chi viec run lai test case nay neu ham ngon thi ra mau xanh neu ham khong ngon ra mau do
      //nho test script ta verify lai mot ham rat nhanh kiem thu lai thi da kiem thu de dam bao can ngon so voi trc khi kiem thu
      //duoc goi la kiem thu hoi quy -regression testing 
      //nho ci hoi quy lien tuc
      //Bai nay minh thu hoi quy bang cach sua lai ham theo phunog phap de quy -recursion
}
