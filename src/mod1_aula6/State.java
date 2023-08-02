package mod1_aula6;

enum State {
    MG("Minas Gerais",0.07),
    RJ("Rio de janeiro",0.15),
    SP("São paulo", 0.12);

    public double tax;
    public double estado;

    State (String estado, double taxValue){
        estado = estado;
        tax = taxValue;
    }

    State(double taxValue){
        tax = taxValue;
    }

    public double getTax(){
        return tax;
    }
}


