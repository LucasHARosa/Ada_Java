package mod2_aula2;

public class Cliente {
    String nome;
    String cpf;
    String email;

    public Cliente(String nome, String cpf, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;

    }

    @Override
    public boolean equals(Object c){
        if(c instanceof Cliente cliente){
            if(cliente.cpf.equals(cpf)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        return "Cliente: "+nome+"; CPF: "+cpf+"; Email: "+email;
    }
}
