import java.util.Scanner;

/**
 * Curso JAVA
 * Módulo 1 - Aula 7
 * @author Rainold Tesch
 */
public class Endereco {
    public static void main(String[] args) {
        System.out.println(" --- CADASTRO DE ENDEREÇO ---");

        Scanner endereco = new Scanner(System.in);

        //solicitar nome do usuário
        System.out.print("Digite seu nome completo: ");
        String nome = endereco.nextLine();
        
        //solicitar rua
        System.out.print("Digite a rua da sua residência: ");
        String rua = endereco.nextLine();

        //solicitar número
        System.out.print("Digite o número da sua residência: ");
        String numero = endereco.nextLine();

        //solicitar complemento
        System.out.print("Digite o complemento - se não tiver, clique <enter>: ");
        String complemento = endereco.nextLine();

        //solicitar bairro
        System.out.print("Digite seu bairro: ");
        String bairro = endereco.nextLine();

        //solicitar cidade
        System.out.print("Digite sua cidade: ");
        String cidade = endereco.nextLine();

        //solicitar estado
        System.out.print("Digite seu estado: ");
        String estado = endereco.nextLine();

        //solicitar CEP
        System.out.print("Digite seu CEP: ");
        String cep = endereco.nextLine();

        //imprimir na tela endereço formatado
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Endereço: " + rua + ", " + numero + " " + complemento + " - " + bairro);
        System.out.println("          " + cidade + " - " + estado);
        System.out.println("     CEP: " + cep);

    }
}
