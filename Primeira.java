/**
 * Curso Java Zero ao PRO
 * Módulo 1 Aula 6
 * @author Rainold Tesch
 */
import java.util.Scanner;

class Primeira {
    public static void main(String[] args) {
        System.out.println("Curso Mentorama - Java zero ao PRO ");

        Scanner entrada = new Scanner(System.in);
        System.out.print("Oi, qual seu nome? ");
        String s = entrada.next();

        System.out.println("Olá " + s + "! Seja bem-vindo!");
    }
}