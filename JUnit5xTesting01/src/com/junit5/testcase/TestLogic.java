package com.junit5.testcase;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.junit5.logic.Calculation;

public class TestLogic {  
	  
    @Test  
    public void testFindMax(){  
        assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));  
        assertEquals(-1,Calculation.findMax(new int[]{-12,-1,-3,-4,-2}));  
    }  
}  
