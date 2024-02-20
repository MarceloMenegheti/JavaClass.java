public class Jogador {

    //atributo/variavel
    //public int num = 0;
    private final int MAX_VIDAS = 5;//acesso somente interno na classe.
    private int num = 2;
    private int vidas = 0;

    //metodos e atributos static eu consigo ter acesso sem ter que instanciar uma classe.
    static boolean alerta = false;
    static int qtdJogadores = 0;
    static int pontos = 0;

    //metodo construtor,automaticamente executado quando um obj é instanciado,nao tem retorno, e tem o mesmo nome da classe.
    public Jogador(int num){

        //this. referencia o num da Classe, que atribui o num Parametro.
        this.num = num;
        //this.vidas = 1; //inicializando a vida do jogador.
        this.setVidas(1);
        System.out.printf("%njogador %d criado%n",num);
        qtdJogadores++;
    }

    //os metodos do tipo GET são para obter valores de uma variavel de uma classe.
    public int getVidas(){
        return this.vidas;
    }

    //os metodos do tipo SET são para atribuir valores a variaveis de uma classe.
    private void setVidas(int vidas){
        if(vidas > MAX_VIDAS){
            this.vidas = MAX_VIDAS;
        }else if(vidas < 0){
            this.vidas = 0;
        }else{
            this.vidas = vidas;
        }
    }

    //os metodos do tipo SET são para atribuir valores a variaveis de uma classe.
    public void addVidas(int vidas){

        if(this.vidas < MAX_VIDAS){
            System.out.println("Vida + 1");
            this.vidas++;
        }else if(this.vidas == MAX_VIDAS){
            System.out.println("\nFull life!!");
        }
    }

    static void pontos(){

        //toda vez que o jogador for chamado add 10 pontos
        pontos += 10;
    }

    //metodo info
    public void info(){
        System.out.printf("------------------------");
        System.out.printf("%nJogador: %d",this.num);
        System.out.printf("%nVidas: %d",this.vidas);
        System.out.printf("%nPontos do jogador: %d",pontos);
        System.out.printf("%nAlerta: %s", alerta ? "Sim" : "Nao");
        System.out.printf("%nJogadores: %d", qtdJogadores);
        System.out.printf("%n------------------------%n");
    }
}
