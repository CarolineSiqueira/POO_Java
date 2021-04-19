import um.Primeiro;

public class ClassMain {

    public static void main (String...args){
     Carro carro= new Carro(4);
     carro.setCor(Carro.PRETO);
     carro.setPortas(Carro.DUAS);


     carro.imprimeValores();

    }
}
