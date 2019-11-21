import java.util.ArrayList;
import java.util.List;

public class E07 {

    public static void main (String [] args){

        Integer numeroMinimo = 2;
        Integer numeroMaximo = 10;

        System.out.print(listaDeNumerosEntre(numeroMinimo, numeroMaximo));

    }

    public static ArrayList<Integer> listaDeNumerosEntre(Integer minimo, Integer maximo){

        List<Integer> valoresNumericos = new ArrayList<>();

        for (int i = minimo+1; i < maximo; i++){

            valoresNumericos.add(i);
        }

        return (ArrayList<Integer>) valoresNumericos;
    }
}
