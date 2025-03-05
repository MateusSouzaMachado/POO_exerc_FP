package hora_da_pratica.Exerc_04_Aluno;

public class App {
    public static void main(String[] args) {
        

                Aluno a1 = new Aluno("joão", new Double[] {10.0, 5.5 ,9.5} );
                System.out.println(a1.calcularMedia());

                a1.setNotas(new Double[] {8.5});
                System.out.println(a1.calcularMedia());
    }

}
