package mod1_aula3;


public class Ex03_01 {
    public static void main(String[] args) {

    }
    public static double custoCompra(double input) {
        double valorPromocao = 1.25;
        double valorNormal = 1.45;
        double valorTotal=0;
        if(input>10){
            valorTotal = input*valorPromocao;
        }
        else{
            valorTotal = input*valorNormal;
        }
        return valorTotal;
    }

}

