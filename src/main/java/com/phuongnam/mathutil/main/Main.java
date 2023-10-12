/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.phuongnam.mathutil.main;

import com.phuongnam.mathutil.core.MathUtility;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
      // TODO code application logic here
        //muon test code (dev) hay test app(qc/tester) thi can phai chuan bi
        //testcase -tinh huong kiem thu truong hop kiem thu- cach ta kiem thu
        //trong mot ngu canh nao do- ban ve data
        //1 testcase co cau truc nhu sau:
        //Id /description| Steps/Procedures |Expected result | Status Pass/Failed
        //Dev em mun kiem thu con ham chinh em viet getFactorial() dung hay sai thi em 
        //phai thiet ke cac testcase
        
        //Testcase 1 : Verify getFActorial(with n=0)
        //Step-Procedures : Cac buoc run app de test
        //1. Given n=0
        //2. Excute/Call/Invoke function get Factorial(0)
        
        //Expected Result: the function must return 1 ( standing for 0!=1)
        //Status: Passed or failed,?????
    
    //Testcase2: Verify getFactoria;(with n=1)
    //Steps/Procedures:
    // 1. Given n=1
    // 2. call/invoke getFactorial(n=1)
    // expected result:
    //the method must return 1 in case of 1!
    //Status: Passed | Failed
    
    //Testcase3:
    // 1.Given n=5
    // 2.call/invoke getFactorial(n=5)
    // 3.expected result:120
    
    
    public static void main(String[] args) {
        int n=0;
        long expected =1;
        long actual = MathUtility.getFactorial(n) ;
        System.out.println(n+ "! -> expected:"+ expected +" | actual = "+actual);
        
        
        //Testcase2:
        n=1;
        expected =1;
        actual =MathUtility.getFactorial(n);
        System.out.println(n+ "! -> expected:"+ expected +" | actual = "+actual);
        
        //Testcase3:
        System.out.println("5! -> expected: 120"+" | actual = "+MathUtility.getFactorial(5));
        
           
    }
    
}
