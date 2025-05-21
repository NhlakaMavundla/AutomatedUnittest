/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.unittest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lab_services_student
 */
public class GreetingTest {
    
    public GreetingTest() {
    }

    /**
     * Test of sayHello method, of class Greeting.
     */
   
    
    @Test
    public void testSayHello(){
        
        Greeting greetings = new Greeting();
        String result = greetings.sayHello("Nhlakanipho");
        
        assertEquals("Hello, Nhlakanipho!",result);
    
    }
    
}
