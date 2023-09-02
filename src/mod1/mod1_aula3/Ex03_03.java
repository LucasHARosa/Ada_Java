package mod1.mod1_aula3;

public class Ex03_03 {

    public static double calculoSalario( double[] input) {
        double tempoServico = input[0];
        double ipca = input[1];
        double salario = input[2];
        double valorTotal =0;

        if(tempoServico >= 1 && tempoServico <5){
            valorTotal = (salario * ((ipca+1)/100)) + salario;
        }
        else if(tempoServico >= 5 && tempoServico <10){
            valorTotal = (salario * ((ipca+1.5)/100)) + salario;
        }
        else if(tempoServico>=10){
            valorTotal = (salario * ((ipca+2)/100)) + salario;
        }

        return valorTotal;
    }

}
