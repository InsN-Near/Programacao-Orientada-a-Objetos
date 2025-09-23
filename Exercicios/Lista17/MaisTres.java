public class MaisTres implements Series {
    int valor;
    int inicio;

    public MaisTres() {
        valor = 0;
        inicio = 0;
    }

    public int getNext() {
        valor += 3;
        return valor;
    }

    public void reset() {
        valor = inicio;
    }

    public void setStart(int x) {
        inicio = x;
        valor = x;
    }
}