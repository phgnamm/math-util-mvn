/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.phuongnam.mathutil.core.test;

import com.phuongnam.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author PC
 */
//Test case #1 - VerifyFactorial(with n=0)
public class MathUtinityTest {
    
    @Test
    public void verifyFactorialGivenRightArgument0ReturnOk(){
        assertEquals(1, MathUtility.getFactorial(0));
    }
    
    @Test
    public void verifyFactorialGivenRightArgument51eturnOk(){
        assertEquals(1, MathUtility.getFactorial(1));
    }
     @Test
    public void verifyFactorialGivenRightArgument5ReturnOk(){
        assertEquals(120, MathUtility.getFactorial(5));
    }
    
    //doan 3 testcase tren khong dep, boc mui ,vi chi khac nhua phan data
    //trong nghe kiem thu co 1 ki thuat do la tach han data kiem thu ra 1 cho cho de nhin de quan ly duoc data thieu du hay khong
    //sau do ta dua bo data vao trong cau lenh so sanh,qua cac tham so parameter
    //tuc la assserequals(expected, actual) la 2 tham so (120 , 5!)
    //mang [5][2] {0,1} {1,1} {5,120}
    //ung voi bo data duoc tach ra
    //code nhin gon, phat hien duoc thieu du thieu du test data, testcase 
    //ki thuat taach data kiem thu ra khoi cau lenh so sanh --> duoc goi la ddt - datadriven testing- kiem thu theo
    //huong tach data rieng le
}
