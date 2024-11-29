
package inputExample;

import java.util.Scanner;
/**
 *
 * @Autora Maria Eduarda
 */
public class InputExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = in.next(); //lê o texto até um espaço
        System.out.println("Enter a mumber:");
        int answer = in.nextInt();//lê um valor inteiro
        System.out.println(name + ", the number you entered is: "
                          + answer);
        }//fim do método main
}//fim da classe InputExample
   
