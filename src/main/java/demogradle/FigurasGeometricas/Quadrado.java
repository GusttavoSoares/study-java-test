package demogradle.FigurasGeometricas;

public class Quadrado {
    private int lado;

    public Quadrado() {
    }

    public Quadrado(int lado) {
        setLado(5);
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        if (lado > 0)
            this.lado = lado;
        else
            throw new IllegalArgumentException("Erro: número menor ou igual a 0");
    }

    public int calcularArea() {
        return lado * lado;
    }

    public int calcularPerimetro() {
        return 4 * lado;
    }
}