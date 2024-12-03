public class Referencias {
    private String convercaoDe;
    private String convercaoPara;
    private double valor;

    public String getConvercaoDe() {
        return convercaoDe;
    }

    public void setConvercaoDe(String convercaoDe) {
        this.convercaoDe = convercaoDe;
    }

    public String getConvercaoPara() {
        return convercaoPara;
    }

    public void setConvercaoPara(String convercaoPara) {
        this.convercaoPara = convercaoPara;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = Double.parseDouble(valor);
    }
}