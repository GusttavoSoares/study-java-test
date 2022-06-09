package demogradle.FigurasGeometricas;

public class Retangulo {
    private int altura;
    private int base;


    public void setBase(int base) {
        if (base > 0)
            this.base = base;
        else
            throw new IllegalArgumentException("Erro: número menor ou igual a 0");
    }

    public int getBase() {
        return base;
    }

    public void setAltura(int altura) {
        if (altura > 0)
            this.altura = altura;
        else
            throw new IllegalArgumentException("Erro: número menor ou igual a 0");
    }

    public int getAltura() {
        return altura;
    }

    public Retangulo() {
    }

//    public Retangulo(int base) {
//        this.base = base;
//        this.altura = base;
//    }

    public Retangulo(int base, int altura) {
        setBase(base);
        setAltura(altura);
    }

    public int calcularArea() {
        return altura * base;
    }

    public int calcularPerimetro() {
        return 2 * (altura + base);
    }
}