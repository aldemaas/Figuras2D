public class Quadrado implements FiguraGeometrica2D {

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public double getArea(){
        return getLado() * getLado();
    }

    @Override
    public double getPerimetro(){
        return getLado() * 4;
    }

    @Override
    public String getNomedaFigura(){
        return "Quadrado";
    }


    @Override
    public int compareTo(FiguraGeometrica2D o) {
        return Double.compare(getArea(), o.getArea());
    }
}
