public class ex_tabuada_while {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            int j = 1;
            System.out.println("\n");
            while (j <= 10) {
                int resultado = i * j;
                System.out.printf("%d X %d = %d\n", i, j, resultado);
                j++;
            }
            i++;
        }
    }
}