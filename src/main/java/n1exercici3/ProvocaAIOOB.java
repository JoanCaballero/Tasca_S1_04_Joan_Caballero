package n1exercici3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.testng.Assert.assertEquals;

public class ProvocaAIOOB {
    ArrayList<Integer> arrayList = new ArrayList<>();
    @Test
    public void testProvocaAIOOB(){
        assertThrows(IndexOutOfBoundsException.class, () ->{
            arrayList.get(arrayList.size());
        });
    }
}
