import com.google.gson.annotations.SerializedName;

public class Conversao {
    @SerializedName("base_code")
    private String moedaEscolhida;

    @SerializedName("Conversion_result")
    private Double resultadoDaConversao;

    @SerializedName("Target_code")
    private String moedaParaConverter;

    @SerializedName("Conversion_rate")
    private Double taxaParaConversao;

    public Conversao(String moedaEscolhida, Double resultadoDaConvercao,
                     String moedaParaConverter, Double taxaParaConversao) {
        if (taxaParaConversao == null || taxaParaConversao <= 0) {
            throw new IllegalArgumentException("A taxa para conversão deve ser maior que zero.");
        }
        this.moedaEscolhida = moedaEscolhida;
        this.resultadoDaConversao = resultadoDaConvercao;
        this.moedaParaConverter = moedaParaConverter;
        this.taxaParaConversao = taxaParaConversao;
    }

    public Double getResultadoDaConversao() {
        return resultadoDaConversao;
    }

    public Double getTaxaParaConversao() {
        return taxaParaConversao;
    }

    public Double valorDigitado() {
        return resultadoDaConversao / taxaParaConversao;
    }



    @Override
    public String toString() {
        return "O valor de " + String.format("%.2f", valorDigitado()) + " " + moedaEscolhida +
        "equivale a " + String.format("%.2f", resultadoDaConversao) + " " + moedaParaConverter + ".";
    }
}
