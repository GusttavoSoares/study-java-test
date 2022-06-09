package demogradle.FigurasGeometricas;

public class Quadrado {
    private int lado;

    public static final String ERROR_MESSAGE = "Erro: número menor ou igual a 0";

    public Quadrado() {
    }

    public Quadrado(int lado) throws IllegalArgumentException {
        setLado(lado);
//        if (lado > 0)
//            this.lado = lado;
//        else
//            throw new IllegalArgumentException("Erro: número menor ou igual a 0");
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        if (lado > 0)
            this.lado = lado;
        else
            throw new IllegalArgumentException(ERROR_MESSAGE);
    }

    public int calcularArea() {
        return lado * lado;
    }

    public int calcularPerimetro() {
        return 4 * lado;
    }
}