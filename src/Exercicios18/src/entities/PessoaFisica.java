package entities;

public class PessoaFisica extends Person{

    private Double gastoComSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String name, Double rendaAnual, Double gastoComSaude) {
        super(name, rendaAnual);
        this.gastoComSaude = gastoComSaude;
    }

    public Double getGastoComSaude() {
        return gastoComSaude;
    }

    public void setGastoComSaude(Double gastoComSaude) {
        this.gastoComSaude = gastoComSaude;
    }

    @Override
    public double totalImpostos() {
        if(getRendaAnual() <= 20000.00 && gastoComSaude == 1){
            return getRendaAnual() * 0.15 - (gastoComSaude * 0.5);
        }else{
            return getRendaAnual() * 0.25 - (gastoComSaude * 0.5);
        }
    }
}
