package mod2_aula4;

public class Veiculo {
    private String placa;
    private String cor;
    private String modelo;
    private int ano;

    public Veiculo(String placa, String cor, String modelo, int ano) {
        this.placa = placa;
        this.cor = cor;
        this.modelo = modelo;
        this.ano = ano;
    }
    public Veiculo (){

    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void exibirDados(){
        System.out.println("Placa: "+placa);
        System.out.println("Cor: "+cor);
        System.out.println("Modelo: "+modelo);
        System.out.println("Ano: "+ano);

    }
}
