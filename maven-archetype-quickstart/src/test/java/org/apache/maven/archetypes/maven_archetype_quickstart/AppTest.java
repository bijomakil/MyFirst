package org.apache.maven.archetypes.maven_archetype_quickstart;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
 
public class AppTest {
 
    @BeforeClass
     public void setUp() {
       // code that will be invoked when this test is instantiated
     }
 
     @Test(groups = { "group 1" })
     public void groupOneTest() {
       System.out.println("group 1 test");
     }
 
     @Test(groups = { "group 2" })
     public void groupTwoTest() {
        System.out.println("group 2 test");
     }
 
}

