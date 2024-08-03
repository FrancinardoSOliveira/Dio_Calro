import java.util.Date;

public class tiposVariaveis {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        final int CLASSE = 1;
        int numero = 6;
        Date dataNascimento = new Date();
        //dataNascimento = 11/04/1978;

        //System.out.println( -- numero );
       // System.out.println( -- numero );

        boolean opcao = false;
        opcao = true;
       // System.out.println(!opcao);
        int a = 4;
        int b = 5;
       String resultado = a<b? "Verdadeiro":"Falso";
       System.out.println(resultado);

        String nome1 = "Março";
        String nome2 = "Fevereiro";

        System.out.println(nome2.equals(nome1));


    }
}
