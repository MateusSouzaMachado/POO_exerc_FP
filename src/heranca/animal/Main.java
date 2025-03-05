package heranca.animal;

public class Main {
    public static void main(String[] args) {
        Cachorro doquinho = new Cachorro();
        Gato miau = new Gato();

        doquinho.emitirSom();
        doquinho.abanarRabo();

        miau.arranharMoveis();
        miau.emitirSom();
    }
}
