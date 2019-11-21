import java.util.ArrayList;
import java.util.List;

public class E04 {

    public static void main (String [] args){

        List<Integer> contagem = new ArrayList<>();

        for (int i = 0; i <=100; i++){
            if (i%2 != 0){
                contagem.add(i);
            }
        }


        for (int k = 0; k < contagem.size(); k++){
            System.out.print(contagem.get(k) + ", ");
        }
    }

}
