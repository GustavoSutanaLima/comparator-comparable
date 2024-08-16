import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Criando uma lista de Strings
        //List é uma lista de objetos, para especificar os elementos da lista, usa-se o 
        //operador diamante <>. Neste caso, tem-se uma lista de Strings;
        List<String> minhaFamilia  = new ArrayList<String>();

        minhaFamilia.add("Eu");
        minhaFamilia.add("Minha_mãe");
        minhaFamilia.add("Meu_pai");
        minhaFamilia.add("Minha_avozinha");

        System.out.println(minhaFamilia);

        /*  Se eu quiser ordenar os elementos em ordem alfabetica, posso usar o método static da classe
            Collections e passar minha lista como parâmetro.
        */
        //Collections.sort(minhaFamilia);


        /*
         * Repare que antes do print, a posição dos objetos do tipo string é uma, e após o metodo sort, agora é outra (agora, em ordem alfabética).
         */
        //System.out.println(minhaFamilia);

        /*
         * Suponha, no entanto, que você queira organizar os estes objetos do tipo String de uma maneira
         * customizada. Daí, precisaremos instanciar um novo Comparator (novo comparador).
         */

        /*
         * Comparator é uma Interface, logo não é possível instanciar um novo Comparator sem
         * implementar seu "metodo-lei" ou método abstrado, que especificará como serão feitas as comprações, neste
         * caso.
         */
        Comparator<String> comparadorStringsFaminha = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() < o2.length()) {
                    return -1;
                }
                else {
                    return 1;
                }
            }
        };

        Collections.sort(minhaFamilia, comparadorStringsFaminha);

        System.out.println(minhaFamilia);
    }
}
