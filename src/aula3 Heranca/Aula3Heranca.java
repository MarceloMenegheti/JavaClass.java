public class Aula3Heranca {

    public static void main(String[] args){

        
        //instanciando os obj
        Carro c1 = new Carro("Golf");
        Carro c2 = new Carro("Fusca");
        CarroCombate c3 = new CarroCombate("leao",100);
        CarroCombate c4 = new CarroCombate("Carcara",60);

        //carro com blindagem
        c3.atirar();
        c4.sofrerDano(15);
        c4.atirar();
        c3.sofrerDano(30);

        //testando dano e municao
        for(int i = 0;i<11;i++){
            c3.atirar();
            c4.sofrerDano(4);
        }

        //carro sem blindagem
        c2.sofrerDano(5);//vai ser destruido

        c1.setLigado(true);//ligando o carro
        c1.info();
        c2.info();
        c3.info();
        c4.info();
    }
}