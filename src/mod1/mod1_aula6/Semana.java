package mod1.mod1_aula6;

enum Semana{
    DOMINGO("domingo",0),
    SEGUNDA("segunda-feira",1),
    TERCA("terça-feira",2),
    QUARTA("quarta-feira",3),
    QUINTA("quinta-feira",4),
    SEXTA("sexta-feira",5),
    SABADO("sábado",6);

    private final String nome;
    private final int numero;

    Semana(String nome, int numero){
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome(){
        return nome;
    }

    public int gatNumero(){
        return numero;
    }

    public static String mostrarNomeEnum(String nome) {
        for (Semana semana : Semana.values()) {
            if (semana.nome.equalsIgnoreCase(nome)) {
                return semana.toString();
            }
        }
        throw new IllegalArgumentException("\nNome inválido: " + nome);
    }

    public String toString() {
        String s = "Semana." + this.name() + " Dia:" + this.numero;
        return s;
    }

}
