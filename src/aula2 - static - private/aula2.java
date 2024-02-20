
public class aula2 {
    public static void main(String[] args){
        
        int num = 0;
        

        System.out.printf("%nalerta %s",Jogador.alerta ? "sim" : "nao");


        //instanciando objetos
        Jogador j1 = new Jogador(++num);
        Jogador j2 = new Jogador(++num);
        Jogador j3 = new Jogador(++num);

        Jogador.alerta = true;

        Jogador.pontos();


        j1.info();
        j2.info();
        j3.info();

    }
    
}
