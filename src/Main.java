import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List<String> lista = new ArrayList<>();

        lista.add("Leandro");
        lista.add("João");
        lista.add("Carlos");
        lista.add("wilson");
        lista.add(2, "Jiraya");

        System.out.println("\n" + lista.size());

        System.out.println(lista.isEmpty() + "\n");

        for (String item : lista){
         System.out.println(item);
        }
        System.out.println();

        lista.remove("João");

        for (String item : lista){
            System.out.println(item);
        }

        System.out.println();

        lista.add(1,"Maria");
        lista.add(2,"Marcos");
        lista.add("Mariana");
        lista.add("Marcio");

        System.out.println();
        for (String item : lista){
            System.out.println(item);
        }

        lista.removeIf(s -> s.charAt(0) == 'M');

        System.out.println();
        for (String item : lista){
            System.out.println(item);
        }
        System.out.println("Index of: " + lista.indexOf("Jiraya"));
        System.out.println("Index of: " + lista.indexOf("Marcio"));
        System.out.println("\n|||||||||||||||||||||||||||||||||||||\n");

        lista.add( 3,"Aline");
        lista.add("Aurea");

        System.out.println();
        for (String item : lista){
            System.out.println(item);
        }

        List<String> filtro = lista.stream().filter(x->x.charAt(0) == 'A').collect(Collectors.toList());
        System.out.println();
        for (String item : filtro){
            System.out.println(item);
        }

        System.out.println();
        String nome = lista.stream().filter(x->x.charAt(0) == 'z').findFirst().orElse(null);
        System.out.println(nome);
    }
}