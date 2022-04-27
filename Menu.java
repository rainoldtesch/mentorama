import java.util.Scanner;

/**
 * Módulo 02 - Aula 04
 * Ensaio Menu simples - modo texto
 * Tarefa módulo-03 Enviar para Gitlab
 * @author Rainold Tesch
 */
public class Menu {

    public static void main(String[] args) {
        
        int opcao;
        do {
            System.out.println("|     *** M E N U ***            |");
            System.out.println("|    Opções:                     |");
            System.out.println("|          1. OPÇÃO 1            |");
            System.out.println("|          2. OPÇÃO 2            |");
            System.out.println("|          3. OPÇÃO 3 - SAIR     |");
                        
            System.out.println();    
            System.out.print(" Digite a sua opção: ");

            Scanner menu = new Scanner(System.in);
            opcao = menu.nextInt(); 

            processar(opcao);
        } while (opcao != 3);
             System.out.println("Você saiu do sistema!");
    }
    
    public static void processar(int opcao) {
        if (opcao > 3) {
            System.out.println();
            System.out.println("    *** OPÇÃO INVÁLIDA!!! < Escolha entre 0 e 3 > ***");  
        } else { 
            
           switch (opcao) {
            case 1:
                System.out.println("Opção 1 selecionada!");
                break;
            case 2:
                System.out.println("Opção 2 selecionada!");
                break;
           }    
        } 
    }
}
