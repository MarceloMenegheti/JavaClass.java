public class Aula{
    public static void main(String[] args){

        int num = 0;

        //instanciando objetos
        Jogador j1 = new Jogador(++num);
        Jogador j2 = new Jogador(++num);
        Jogador j3 = new Jogador(++num);

        /*
        //acessando "num" por causa do modificador de acesso Public.
        j1.num = 10;
        j2.num = 20;
      //j2.num2 = 5; erro devido ao modficador de acesso private.

        System.out.println(j1.num);
        System.out.println(j2.num);
      //System.out.println(j2.num2); Erro.
        */

        //j1.setVidas(50); caso o setvidas fosse public daria pra alterar a vida do jogador.

        //Get
        System.out.printf("%n%nVidas do Jogador 1: %d", j1.getVidas());
        System.out.printf("%nVidas do Jogador 2: %d", j2.getVidas());
        System.out.printf("%nVidas do Jogador 3: %d\n\n", j3.getVidas());

        //jogador achou uma vida
        j1.addVidas(1);
        j1.addVidas(1);
        j1.addVidas(1);
        j1.addVidas(1);
        j1.addVidas(1);
        j1.addVidas(1);

        //Get again
        System.out.printf("%n%nVidas do Jogador 1: %d", j1.getVidas());
        System.out.printf("%nVidas do Jogador 2: %d", j2.getVidas());
        System.out.printf("%nVidas do Jogador 3: %d%n", j3.getVidas());

    }
}