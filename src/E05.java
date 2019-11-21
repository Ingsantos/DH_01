public class E05 {

    public static void main(String[] args) {

        Integer numeroA = 5;
        Integer numeroB = 5;
        Integer numeroC = 5;
        Integer numeroD = 5;

        System.out.println(algumMaior(numeroA, numeroB, numeroC, numeroD));
    }

    public static Boolean algumMaior(Integer umNumeroA, Integer umNumeroB, Integer umNumeroC, Integer umNumeroD) {

        return (umNumeroA > umNumeroC && umNumeroA > umNumeroD) || (umNumeroB > umNumeroC && umNumeroB > umNumeroD);
    }
}
