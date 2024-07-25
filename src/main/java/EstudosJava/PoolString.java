package EstudosJava;

public class PoolString {

    public static void main(String[] args) {

        //String Literais
        String nome1 = "rafael";
        String nome2 = "rafael";
        String nome3 = "maria";

        String nome4 = new String("joao");
        String nome5 = new String("joao");
        String nome6 = new String("maria");

        System.out.println("Comparando nomes: ");
        System.out.println(nome1 == nome2);
        System.out.println(nome1.equals(nome2));

        System.out.println("Comparando objetos criados com new: ");
        System.out.println(nome4 == nome5);
        System.out.println(nome4.equals(nome5));

        System.out.println("Comparando literal e objeto criados com new");
        System.out.println(nome3 == nome6);
        System.out.println(nome3.equals(nome6));
    }
}
