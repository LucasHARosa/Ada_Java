package mod2.mod2_aula1;

public class Uso {
    public static void main(String args[]) {

        Agenda agenda = new Agenda();

        Contato contato1 = new Contato();
        contato1.nome = "Lucas";
        contato1.numero = "00";
        contato1.descricao = "eu mesmo";

        Contato contato2 = new Contato();
        contato2.nome = "Ana";
        contato2.numero = "11";
        contato2.descricao = "namorada";

        Contato contato3 = new Contato();
        contato3.nome = "ada";
        contato3.numero = "22";
        contato3.descricao = "professor";


        agenda.contatos = new Contato[] {contato1, contato2, contato3};

        System.out.println("Imprimindo agenda");
        agenda.imprimirAgenda();

        System.out.println("Buscando Lucas");
        Contato lucas = agenda.buscarPorNome("Lucas");

        System.out.println("Detalhar");
        lucas.detalhar();

        System.out.println("ligar");
        lucas.ligar();

        System.out.println("Apagando contato: ana");
        agenda.deletar(contato2);


        System.out.println("Imprimindo agenda");
        agenda.imprimirAgenda();

    }

}
