package heranca.animal;

public class Cachorro extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("au au AU AU!");
    }
    public void abanarRabo(){
        System.out.println("Ele abana o rabo");
    }
}
