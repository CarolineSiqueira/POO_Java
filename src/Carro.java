public class Carro {

    public static final String VERMELHO = "vermelho";
    public static final String PRETO = "preto";

    public static final String DUAS= "duas";
    public static final String QUATRO= "quatro";

    private Integer quantidadePneus;
    private Integer quantidadeCalotas;
    private Integer quantidadeParafusosPneu;
    private String Cor;
    private String Portas;
    private Integer Lugares;



    public Carro (Integer quantidadePneus){
        setQuantidadePneus(quantidadePneus);

    }

    public Integer getQuantidadePneus(){
        return quantidadePneus + 2;
    }


    public void setQuantidadePneus(Integer quantidadePneus){
        quantidadeCalotas = quantidadePneus;
        quantidadeParafusosPneu= quantidadePneus *4;
        this.quantidadePneus = quantidadePneus;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String cor) {
        Cor = cor;
    }

    public String getPortas() {
        return Portas;
    }

    public void setPortas(String portas) {
        Portas = portas;
    }

    public Integer getLugares() {
        return Lugares = 5;
    }

    public void setLugares(Integer lugares) {
        Lugares = lugares;
    }

    public Integer getQuantidadeCalotas() {
        return quantidadeCalotas;
    }

    public void setQuantidadeCalotas(Integer quantidadeCalotas) {
        this.quantidadeCalotas = quantidadeCalotas;
    }

    public Integer getQuantidadeParafusosPneu() {
        return quantidadeParafusosPneu;
    }

    public void setQuantidadeParafusosPneu(Integer quantidadeParafusosPneu) {
        this.quantidadeParafusosPneu = quantidadeParafusosPneu;
    }

    public void imprimeValores(){
        System.out.println("Quantidade de pneus=" + getQuantidadePneus());
        System.out.println("Quatidade de calotas="+ getQuantidadeCalotas());
        System.out.println("Quantidade de parafusos=" + getQuantidadeParafusosPneu());
        System.out.println("Cor do carro=" + getCor());
        System.out.println("Quantidade de portas=" + getPortas());
        System.out.println("Quantidade de lugares="+ getLugares());
    }

}
