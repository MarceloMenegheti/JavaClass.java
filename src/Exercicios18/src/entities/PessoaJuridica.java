package entities;

public class PessoaJuridica extends Person{

    private int numerosFuncionarios;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String name, Double rendaAnual, int numerosFuncionarios) {
        super(name, rendaAnual);
        this.numerosFuncionarios = numerosFuncionarios;
    }

    public int getNumerosFuncionarios() {
        return numerosFuncionarios;
    }

    public void setNumerosFuncionarios(int numerosFuncionarios) {
        this.numerosFuncionarios = numerosFuncionarios;
    }

    @Override
    public double totalImpostos() {
        if(numerosFuncionarios >= 10){
            return getRendaAnual() * 0.14;
        }else{
            return getRendaAnual() * 0.16;
        }
    }
}
