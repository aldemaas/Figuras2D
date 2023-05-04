public interface FiguraGeometrica2D extends Comparable<FiguraGeometrica2D> {

    double getArea();
    double getPerimetro();
    String getNomedaFigura();

    @Override
    int compareTo(FiguraGeometrica2D o);
}
