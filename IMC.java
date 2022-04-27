/**Módulo 02 - Tarefa
 * Cálculo do IMC - Índice de Massa Corporal
 * @author Rainold Tesch
 */
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {

        int resposta;

        do {
            System.out.println("   *** Cálculo do IMC ***   ");
            System.out.print("Digite seu peso em quilos: ");
        
            Scanner indice = new Scanner(System.in);
            double peso = indice.nextDouble();

            System.out.print("Digite sua altura em metros: ");
            double altura = indice.nextDouble();
        
            double imc = peso / (altura * altura);

            System.out.println("Seu IMC é : " + imc);

            if (imc <= 20) {
                System.out.println(" Você está abaixo do peso! ");
            } else  if (imc > 20 && imc <= 30) {
                System.out.println("Seu peso é ideal! Parabéns!!! ");
            } else {
                System.out.println("Você tá baludo!!! Bora academia e dieta. ");
            }

            System.out.print("Para finalizar digite 0 ou para continuar digite 1: ");
            Scanner opcao = new Scanner(System.in);
            resposta = opcao.nextInt();
            
        } while (resposta != 0);
        System.out.println("Você encerrou. - Cálculo do IMC finalizado!!!");
    }

}
