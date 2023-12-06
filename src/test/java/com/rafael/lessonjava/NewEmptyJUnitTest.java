package com.rafael.lessonjava;

//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
import org.junit.Test;
import com.rafael.lessonjava.component.MathClass;
import static org.junit.jupiter.api.Assertions.*;

public class NewEmptyJUnitTest {
    public MathClass obj;

    @Test
    public void givenTwoNumbers_checkingSum_thenTrue() {
        this.obj = new MathClass();
        System.out.println("Tests Rafael Maven!");
        assertEquals(10, MathClass.sum(4, 6), "First test on MathClass");
    }
}
