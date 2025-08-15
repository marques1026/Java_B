public class ex_tabuada {
        public static void main(String[] args) {
            for (int i = 1; i <= 10; i++) {   // tabuada do 1 ate o 10
                for (int j = 1; j <= 10; j++) {  // multiplicando do 1 ate o 10
                    System.out.println(i + "X" + j + " = " + (i * j));
                }
                System.out.println(); // só para dar um espaço entre as tabuadas
            }
        }
    }

// o primeiro for i controla qual num da tabuada ta sendo feito ate 10
// o segundo for j é o numero que o i vai ser multiplicado de 1 ate 10 tambem
// o segundo laço, ele faz a conta i * j e mostra na tela no formato "i X j = resultado"
// depois de terminar a tabuada de um nuemro, tem um System.out.println(); só pra pular uma linha e deixar mais organizado

// entendi amem



/*
public class ex_break {

    public static void main(String[] args){

        for (int i = 0; i < 3; i++){

            System.out.println("Banana"); //vai printar 1 banana, vai printar 2 vezes maça e assim até acabar

            for (int j = 0; j < 2; j++){
                System.out.println("Maçã");
                break; //quebrará o laço interno
            }
            //vai printar 1 banana, vai printar 2 vezes maça e assim até acabar
        }
    }
}
*/