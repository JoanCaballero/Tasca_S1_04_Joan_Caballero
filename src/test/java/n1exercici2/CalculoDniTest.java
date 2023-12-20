package n1exercici2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculoDniTest {
    @ParameterizedTest
    @CsvSource ({
            "23156754,D",
            "26859758,J",
            "23156498,Y",
            "21764253,C",
            "64523148,Y",
            "78945645,P",
            "87954640,H",
            "21305476,R",
            "35968455,C",
            "66523455,A",
            "87963420,N"})
    void esCorrecto(int dni, char caracterCorrecte){
        CalculoDni calculoDni = new CalculoDni(dni);
        assertEquals(caracterCorrecte, calculoDni.getC());
    }
}