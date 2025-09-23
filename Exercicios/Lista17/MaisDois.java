public class MaisDois implements Series {
    int valor;
    int inicio;

    public MaisDois() {
        valor = 0;
        inicio = 0;
    }

    public int getNext() {
        valor += 2;
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