public class E02 {

    public static void main(String [] args){

        String textoA = "Hello World!";
        String textoB = "Hello World";

        System.out.println(cadeiasDeTextoDiferentes(textoA, textoB));

    }

    public static Boolean cadeiasDeTextoDiferentes(String umTextoA,String umTextoB){
        return umTextoA == umTextoB;
    }
}
