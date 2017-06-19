package control3;
/**
 *
 * @author Victor Arriaza
 */
public abstract class FigGeometricas implements IntFigGeometricas {
    int ejeX;
    int ejeY;
    
    @Override
    public abstract void CalculaPerimetro();

    @Override
    public abstract void CalculaArea();
}