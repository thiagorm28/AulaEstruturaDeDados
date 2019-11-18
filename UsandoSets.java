package Aula1;

import org.omg.CORBA.INTERNAL;

import java.util.*;


public class UsandoSets {


    public static void main(String[] args) {
        adicionar5Nomes();
        removerNomes();
        acharSuzana();
        encontrarMenorMaiorSomaMedia();
    }

    //Crie um set com uma lista de nomes com 5 nomes, sendo adicionados mais de uma vez

    public static Set<String> adicionar5Nomes(){
        List<String> names = new ArrayList<>(Arrays.asList("Thiago", "Ronaldo", "Fael", "Lucas",
                "Suzete", "Thiago", "Lucas", "Fael"));
        Set<String> nomes = new HashSet<>(names);
        System.out.println(nomes);
        return nomes;
    }

    //Remova os nomes "Suzete", começados com F, ou terminados em "naldo";

    public static void removerNomes(){
        Set<String> set = adicionar5Nomes();
        set.remove("Suzete");
        set.removeIf(n -> n.startsWith("F"));
        set.removeIf(n -> n.endsWith("naldo"));
        System.out.println(set);
    }

    //Encontre no set "Suzana" (ou não), Se existir exiba com todas letras maiúsculas

    public static void acharSuzana(){
        Set<String> set = adicionar5Nomes();
        int x = 0;
        for(String nome : set){
            x++;
            if(nome.equals("Suzana")){
                System.out.println("SUZANA");
            }
            if(x == set.size()){
                System.out.println("Não existe");
            }
        }
    }

    //Em um set com números inteiros encontre o menor, o maior,a soma, e a média

    public static void encontrarMenorMaiorSomaMedia(){
        Integer  maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        Double media = 0.0, soma = 0.0;
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        List<Integer> lista = new ArrayList<>(set);
        for(Integer n : lista){
            soma += n;
            maior = n > maior ? n : maior;
            menor = n < menor ? n : menor;
        }
        media = soma / set.size();
        System.out.println("O maior valor é " + maior + ", o menor é " + menor + ", a soma é igual a "
        + soma + " e a média é " + media);
    }

}