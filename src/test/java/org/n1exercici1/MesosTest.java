package org.n1exercici1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MesosTest {
    @Test
    public void MesosT(){
        ArrayList<String> arrayMesos = new ArrayList<>();
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
        assertEquals(12, arrayMesos.size());
        assertNotNull(arrayMesos);
        assertEquals("Agost", arrayMesos.get(7));
    }
}