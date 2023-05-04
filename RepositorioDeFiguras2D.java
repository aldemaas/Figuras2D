import java.util.ArrayList;
import java.util.List;

public class RepositorioDeFiguras2D {

    List <FiguraGeometrica2D> figuras2D = new ArrayList<>();

    public void adicionaFigura(FiguraGeometrica2D figura){
        figuras2D.add(figura);
    }

    public void removeFigura(FiguraGeometrica2D figura){
        figuras2D.remove(figura);
    }

    public void removeFigura(int posicao){
        figuras2D.remove(posicao);
    }

}
