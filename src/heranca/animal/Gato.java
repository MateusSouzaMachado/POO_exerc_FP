package heranca.animal;

public class Gato extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("miau MIAU!");
    }

    public void arranharMoveis(){
        System.out.println("Ele arranho sua cadeira");
    }
}
