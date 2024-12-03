import com.google.gson.annotations.SerializedName;

public class Convesao {
    @SerializedName("base_code")
    private String moedaEscolhida;
    @SerializedName("Conversion_result")
    private Double resultadoDaConvercao;
    @SerializedName("Target_code")
    private String moedaParaConverter;
    @SerializedName("Conversion_rate")
    private Double taxaParaConversao;

    public Double getResultadoDaConvercao() {
        return resultadoDaConvercao;
    }

    public Double getTaxaParaConversao() {
        return taxaParaConversao;
    }

    public Double valorDigitado() {
        return resultadoDaConvercao / taxaParaConversao;
    }

    public Convesao(String moedaEscolhida, Double resultadoDaConvercao) {
        this.moedaEscolhida = moedaEscolhida;
        this.resultadoDaConvercao = resultadoDaConvercao;
    }

    @Override
    public String toString() {
        return "O valor de " + String.format("%.2f", valorDigitado()) + " " + moedaEscolhida +
        "equivale a " + String.format("%.2f", resultadoDaConvercao) + " " + moedaParaConverter + ".";
    }
}
