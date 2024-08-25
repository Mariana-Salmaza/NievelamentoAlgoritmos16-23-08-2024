public class ExemploDeArray {
    public static void main(String[] args) {
        Integer numero[] = new Integer[5];

        for (int i = 0; i < 5; i++){
            numero[i] = i *12;
        }

        for (int i = 0; i < 5; i++){
            System.out.println(numero[i]);
        }
    }
}
