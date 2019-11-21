import java.awt.desktop.SystemSleepEvent;
import java.util.ArrayList;
import java.util.List;

public class E06 {
    public static void main (String [] args){

        for (int k = 0; k < 100; k++){
            System.out.print(listaDePrimeirosCemPositivos().get(k) + ", ");
        }

        System.out.println("\n" + "O tamanho do vetor eh " + listaDePrimeirosCemPositivos().size());

    }

    public static ArrayList<Integer> listaDePrimeirosCemPositivos(){

        int auxiliar = 0;
        Integer i = 0;

        List<Integer> valoresNumericos = new ArrayList<>();

        while (auxiliar != 100){

            if (i%2 == 0){

                valoresNumericos.add(i);
                auxiliar++;
            }

            i++;
        }

        return (ArrayList<Integer>) valoresNumericos;
    }
}
