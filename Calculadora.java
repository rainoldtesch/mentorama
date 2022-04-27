import java.util.Scanner;

/**Tarefa Módulo 02 - Aula 5,6,e,7
 * Operadorers matemáticos
 * @author Rainold Tesch
*/
public class Calculadora {
    public static void main(String[] args) {
        
        int opcao;
        do {
            System.out.println();
            System.out.println("|   *** CALCULADORA BÁSICA ***   |");
            System.out.println("|  1. Somar                      |");
            System.out.println("|  2. Subtrair                   |");
            System.out.println("|  3. Multiplicar                |");
            System.out.println("|  4. Dividir                    |");
            System.out.println();
            System.out.print("Qual operação deseja fazer?  <digite 0 para SAIR> : ");
        
            Scanner calcular = new Scanner(System.in);
            opcao = calcular.nextInt();

            processar(opcao);
        }while (opcao != 0);
            System.out.println("Calculadora finalizada!");  
    }

    public static void processar(int opcao) {
        if (opcao > 4) {
            System.out.println();
            System.out.println("    *** OPÇÃO INVÁLIDA!!! < Escolha entre 0 e 4 > ***");  
        } else { 
            Scanner fatores = new Scanner(System.in);       
            switch(opcao){
                case 1: {                  
                    System.out.println("SOMANDO DOIS NÚMEROS");
                    System.out.print("Digite o primeiro número : ");
                    int numero1 = fatores.nextInt();

                    System.out.print("Digite o segundo número : ");
                    int numero2 = fatores.nextInt();

                    int soma = numero1 + numero2;
                    System.out.println("A soma dos dois números é : " + soma);
                    break;
                }
                case 2: {
                    System.out.println("SUBTRAINDO DOIS NÚMEROS");
                    System.out.print("Digite o primeiro número : ");
                    int numero1 = fatores.nextInt();

                    System.out.print("Digite o segundo número : ");
                    int numero2 = fatores.nextInt();

                    int resultado = numero1 - numero2;
                    System.out.println("A subtração dos dois números é : " + resultado);
                    break;
                }
                case 3: {
                    System.out.println("MULTIPLICANDO DOIS NÚMEROS");
                    System.out.print("Digite o primeiro número : ");
                    int numero1 = fatores.nextInt();

                    System.out.print("Digite o segundo número : ");
                    int numero2 = fatores.nextInt();

                    int resultado = numero1 * numero2;
                    System.out.println("A multiplicação dos dois números é : " + resultado);
                    break;
                }
                case 4: {
                    System.out.println("DIVIDINDO DOIS NÚMEROS");
                    System.out.print("Digite o primeiro número : ");
                    double numero1 = fatores.nextInt();

                    System.out.print("Digite o segundo número : ");
                    double numero2 = fatores.nextInt();

                    if (numero2 == 0) {
                        System.out.println("Impossível dividir por zero!!!");    
                    } else {
                        double resultado = numero1 / numero2;
                        System.out.println("A divisão dos dois números é : " + resultado);
                    
                    }
                    break;
                    
                }

            }
        }
    }
}