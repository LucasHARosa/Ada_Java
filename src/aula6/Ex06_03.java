package aula6;

public class Ex06_03 {

    public static void main(String[] args) {
        verificaSemana("domingo");
        verificaSemana("segunda-feira");
        verificaSemana("segunda");
        verificaSemana("quinta-feira");

    }
    public static void verificaSemana(String dia){
        try {
            String diaDaSemana = Semana.mostrarNomeEnum(dia);
            System.out.println(diaDaSemana);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
