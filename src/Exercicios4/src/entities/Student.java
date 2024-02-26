package entities;

public class Student {
    public double nota1,nota2,nota3;
    public String name;

    public double finalNota(){
        return nota1 + nota2 + nota3;
    }

    public double missingPoints(){
        if(finalNota() < 60.0){
            return 60.0 - finalNota();
        }else{
            return 0.0;
        }
    }



}
