package app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RaizTest {
    
    Raiz raiz;

    @BeforeEach
    public void beforeEach() {
        raiz = new Raiz();
    }

    @AfterEach
    public void afterEach() {
        System.out.println("AfterEach");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("BeforeAll");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("AfterAll");
    }

    @Test
    public void testCasoBase() {
        double resultado = raiz.calculaRaiz(36);
        assertEquals(6, resultado);
    }

    @Test
    public void testRaizDeZero() {
        double resultado = raiz.calculaRaiz(0);
        assertEquals(0, resultado);
    }

    @Test
    public void testRaizNumeroGrande() {
        double resultado = raiz.calculaRaiz(250000);
        assertEquals(500, resultado);
    }

    @Test
    public void testRaizDeDois() {
        double resultado = raiz.calculaRaiz(2);
        assertEquals(1.414213, resultado, 0.000001);
    }

    @Test
    public void raizDeNumeroNegativo() {
        double resultado = raiz.calculaRaiz(-2);
        assertEquals(Double.NaN, resultado);
    }
}
