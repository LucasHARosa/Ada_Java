package aula7;

enum Week{
    DOMINGO(new String[]{"domingo", "Sunday", "el domingo"}, 1),
    SEGUNDA_FEIRA(new String[]{"segunda-feira", "Monday", "lunes"}, 2),
    TERCA_FEIRA(new String[]{"terça-feira", "Tuesday", "martes"}, 3),
    QUARTA_FEIRA(new String[]{"quarta-feira", "Wednesday", "miércoles"}, 4),
    QUINTA_FEIRA(new String[]{"quinta-feira", "Thursday", "jueves"}, 5),
    SEXTA_FEIRA(new String[]{"sexta-feira", "Friday", "viernes"}, 6),
    SABADO(new String[]{"sábado", "Saturday", "el sábado"}, 7);

    final String[] nome;
    final int numero;

    Week(String[] nome, int numero){
        this.nome = nome;
        this.numero = numero;
    }

    public String[] getNome(){
        return nome;
    }

    public int gatNumero(){
        return numero;
    }

    public static String mostrarNomeEnum(String nome) {
        for (Week dia : Week.values()) {
            for(String n : dia.getNome()){
                if(n.equalsIgnoreCase(nome)){
                    return dia.toString();
                }
            }
        }
        throw new IllegalArgumentException("\nNome inválido: " + nome);
    }

    public String toString() {
        String s = "Week." + this.name() + " Dia:" + this.numero;
        return s;
    }

}
