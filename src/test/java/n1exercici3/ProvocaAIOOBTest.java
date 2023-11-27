package n1exercici3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ProvocaAIOOBTest {
    ArrayList<Integer> arrayList = new ArrayList<>();
    @Test
    public void testProvocaAIOOB(){
        assertThrows(IndexOutOfBoundsException.class, () ->{
            arrayList.get(arrayList.size());
        });
    }
}