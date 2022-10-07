package comunicacion;

public class Alfabeto extends Pictograma{
    private static String[] letras;
    private String interpretacion;

    public Alfabeto(String origen, String interpretacion) {
        super(origen);
        this.interpretacion = interpretacion;
    }

    public int cantidadLetras(){
        return letras.length;
    }

    @Override
    String interpretacion() {
        return interpretacion;
    }

    @Override
    public String toString() {
        return "a, b, c, d, e, f, g, h, i, j, k, m, n, o, p, q, r, s, t, u, v, w, x, y, z";
    }

    public static String[] getLetras() {
        return letras;
    }

    public static void setLetras(String[] letras) {
        Alfabeto.letras = letras;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
}
