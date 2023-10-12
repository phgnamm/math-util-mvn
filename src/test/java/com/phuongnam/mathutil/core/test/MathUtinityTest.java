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
    public void verifyFactorialGivenRightArgument5ReturnOk(){
        assertEquals(120, MathUtility.getFactorial(5));
    }
    
    
}
