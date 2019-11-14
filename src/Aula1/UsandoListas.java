package Aula1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsandoListas {

    public static void main(String[] args){
        List<String> frutas = new ArrayList<>();
        frutas.add("Banana");
        frutas.add("Maçã");
        frutas.add("Abacaxi");
        frutas.add("Tomate");
        frutas.add("Figo");
        frutas.add("Morango");

        frutas.addAll(Arrays.asList("Jaca", "Caju"));
        Imprimir(frutas, "Frutas inciais: ");
        frutas.add("Banana");
        Imprimir(frutas, "Mais frutas: ");

        System.out.println("Primeira Banana: " + frutas.indexOf("Banana"));
        System.out.println("Última banana: " + frutas.lastIndexOf("Banana"));

        frutas.remove("Banana");
        Imprimir(frutas, "Sem uma banana: ");

        frutas.remove(1);
        Imprimir(frutas, "Removendo o segundo");
        frutas.remove(1);
        Imprimir(frutas, "Removendo o segundo novamente");
        frutas.add(1, "Jambo");
        Imprimir(frutas, "Adicionando no segundo");

        frutas.removeAll(Arrays.asList("Figo", "Caju"));
        Imprimir(frutas, "Removendo vários: ");

        frutas.removeIf(f -> f.startsWith("J"));
        Imprimir(frutas, "Removendo os que começam com J: ");

        System.out.println("Com for indexado: ");
        for(int i = 0; i < frutas.size(); i++){
            System.out.println(frutas.get(i));
        }
    }


    public static void Imprimir(List<String> titulo, String s) {
        System.out.println(s);
        System.out.println(titulo);
    }
}
