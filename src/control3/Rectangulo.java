package control3;
/**
 *
 * @author Victor Arriaza
 */
public class Rectangulo extends Poligonos {
    int ladoA;
    int ladoB;

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }
    
    @Override
    public void CalculaArea() {
        area = ladoA * ladoB;
    }

    @Override
    public void CalculaPerimetro() {
        perimetro = (ladoA * 2) + (ladoB *2);
    }
}