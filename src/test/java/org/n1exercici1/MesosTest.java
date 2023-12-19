package org.n1exercici1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class MesosTest {
    private static ArrayList<String> arrayMesos;
    @BeforeAll
    public static void MesosArray(){
        arrayMesos = new ArrayList<>();
        arrayMesos.add("Gener");
        arrayMesos.add("Febrer");
        arrayMesos.add("Març");
        arrayMesos.add("Abril");
        arrayMesos.add("Maig");
        arrayMesos.add("Juny");
        arrayMesos.add("Juliol");
        arrayMesos.add("Agost");
        arrayMesos.add("Septembre");
        arrayMesos.add("Octubre");
        arrayMesos.add("Novembre");
        arrayMesos.add("Desembre");
    }
    @Test
    public void MesosSize(){
        assertEquals(12, arrayMesos.size());
    }

    @Test
    public void MesosNotNull(){
        assertNotNull(arrayMesos);
    }

    @Test
    public void MesosAtSeven(){
        assertEquals("Agost", arrayMesos.get(7));
    }
}