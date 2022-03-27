package com.company;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @BeforeAll
    static void beforeAll() {

    }



    @Test
    void getSName() {
        Student A=new Student("John", 0001);
   assertEquals("John", A.getName());
    }
    @Test
    void getId(){
        Student B =new Student("Sam",0002);
        assertEquals(0002, B.getId());
    }

    @Test
    public void getName(){
        Student C = new Student("Cat", 0003);
      assertEquals("Kat", C.getName());
    }


}

