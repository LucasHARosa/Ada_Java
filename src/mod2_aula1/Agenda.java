package mod2_aula1;

public class Agenda {
    public Contato[] contatos;

    public Agenda() {
    }

    public Agenda(Contato[] contatos) {
        this.contatos = contatos;
    }


    public void deletar(Contato contato) {

        Contato[] novaLista = new Contato[contatos.length - 1];
        int posicaoNovaLista = 0;
        String nomeContatoADeletar = contato.nome;
        String numeroADeletar = contato.numero;

        for (int i = 0; i < contatos.length; i++) {

            String nomeContatoAtualDoFor = contatos[i].nome;
            String numeroAtualDoFor = contatos[i].numero;

            if (!nomeContatoADeletar.equals(nomeContatoAtualDoFor)
                    && !numeroADeletar.equals(numeroAtualDoFor)) {

                novaLista[posicaoNovaLista] = contatos[i];
                posicaoNovaLista++;

            }

        }

        contatos = novaLista;
    }

    public Contato buscarPorNome(String nome) {
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i].nome.equals(nome)) {
                return contatos[i];
            }
        }
        return null;
    }

    public void imprimirAgenda() {
        System.out.println();
        for (Contato c : contatos) {
            c.detalhar();
        }
        System.out.println();
    }

    public void addContato(Contato novoContato) {
        Contato[] novaLista = new Contato[contatos.length + 1];
        for (int i = 0; i < contatos.length; i++) {
            novaLista[i] = contatos[i];
        }
        novaLista[novaLista.length-1] = novoContato;
        contatos = novaLista;
    }
}
