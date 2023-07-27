package aula7;

public class Ex07_01 {
    public static void main(String[] args) {
        verificaSemana("domingo");
        verificaSemana("segunda-feira");
        verificaSemana("segunda");
        verificaSemana("quinta-feira");

    }
    public static void verificaSemana(String dia){
        try {
            String diaDaSemana = Week.mostrarNomeEnum(dia);
            System.out.println(diaDaSemana);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
