package n1exercici2;

public class CalculoDni {
    static int DNI, residu;
    final static int divisor = 23;
    final char c;

    public CalculoDni(int DNI){
        residu = DNI%divisor;
        c = getLetra(residu);
        System.out.println(c);
    }

    public static int getDNI() {
        return DNI;
    }

    public static int getResidu() {
        return residu;
    }

    public char getC() {
        return c;
    }

    public char getLetra(int res){
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
                'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letras[residu];
    }

}
