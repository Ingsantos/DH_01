import javax.swing.event.InternalFrameEvent;

public class E01 {

    public static void main(String[] args) {

        Integer numeroA = 1;
        Integer numeroB = 3;
        Integer numeroC = 3;

        System.out.println(maiorDeTresNumeros(numeroA, numeroB, numeroC));
    }

    public static Integer maiorDeTresNumeros(Integer umNumeroA, Integer umNumeroB, Integer umNumeroC) {

        Integer auxiliar;

        if (umNumeroA > umNumeroB) {
            auxiliar = umNumeroA;
        } else{
            auxiliar = umNumeroB;
        }

        if (auxiliar > umNumeroC){
            return auxiliar;
        } else {
            return umNumeroC;
        }
    }

}
