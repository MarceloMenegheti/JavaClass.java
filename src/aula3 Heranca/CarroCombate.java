
//a classe carroCombate herda todas as caracteristicas da classe carro
public class CarroCombate extends Carro{
    private final int MAX_ARMAMENTO = 100;
    private final int MIN_ARMAMENTO = 0;
    private int qtdeArmamento;

    //construtor filho
    public CarroCombate(String nome, int blindagem){

        //passando para o construtor da classe pai/base
        super(nome);
        setArmamento(true);
        setBlindagem(blindagem);
        this.qtdeArmamento = 100;
    }

    //metodos claase filho
    public void setQtdeArmamento(int qtdeArmamento){
        this.qtdeArmamento += qtdeArmamento;

        if(this.qtdeArmamento > MAX_ARMAMENTO){
            this.qtdeArmamento = MAX_ARMAMENTO;
        }
        if(this.qtdeArmamento < MIN_ARMAMENTO){
            this.qtdeArmamento = MIN_ARMAMENTO;
        }
    }

    public int getQtdeArmamento(){
        return this.qtdeArmamento;
    }

    public void atirar(){
        if(this.qtdeArmamento > MIN_ARMAMENTO){
            setQtdeArmamento(-10);
        }else{
            System.out.print("Sem municao");
        }
    }

    //caracteristica da classe carroCombate
    public void info(){
        //chamando a classe pai
        super.info();
        System.out.printf("Qtde Armamento:%s%n",this.qtdeArmamento);
    }
}
