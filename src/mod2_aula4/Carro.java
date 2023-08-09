package mod2_aula4;

public class Carro  extends Veiculo{
    private int qtdPortas;
    private String tipoCombustivel;

    public Carro(String placa, String cor, String modelo, int ano, int qtdPortas, String tipoCombustivel) {
        super(placa, cor, modelo, ano);
        this.qtdPortas = qtdPortas;
        this.tipoCombustivel = tipoCombustivel;
    }

    public Carro(int qtdPortas, String tipoCombustivel) {
        this.qtdPortas = qtdPortas;
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Quantidade de rodas: "+qtdPortas);
        System.out.println("Tipo de combustível: "+tipoCombustivel);
    }
}
