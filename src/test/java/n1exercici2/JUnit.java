package n1exercici2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class JUnit {
    @ParameterizedTest
    @ValueSource(ints = {23156754, 26859758, 23156498, 21764253, 64523148, 78945645, 87954640, 21305476, 35968455, 66523455, 87963420}) // 10 DNI
    void esCorrecte(int DNI){
        CalculoDni calculo = new CalculoDni(DNI);
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
                'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        boolean trobat = false;
        for(char c : letras){
            if (calculo.getC() == c) {
                trobat = true;
                break;
            }
        }
        assertTrue(trobat);
    }
}