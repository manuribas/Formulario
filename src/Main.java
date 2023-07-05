import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe seu nome:");
        String nome = entrada.nextLine();
        System.out.print("Informe a sua idade:");
        int idade= entrada.nextInt(); entrada.nextLine();
        System.out.print("Digite seu CPF:");
        String CPF= entrada.nextLine();
        System.out.print("Informe o seu genero:");
        String genero = entrada.nextLine();
        System.out.print("Informe o seu email:");
        String email= entrada.nextLine();
        System.out.print("Digite seu telefone:");
        int telefone= entrada.nextInt();
        System.out.print("Informe a rua:");
        String rua= entrada.nextLine();
        System.out.print("Informe o numero:");
        int numerorua= entrada.nextInt(); entrada.nextLine();
        System.out.print("Informe o Bairro:");
        String bairro= entrada.nextLine();
        System.out.print("Informe a sua cidade");
        String cidade= entrada.nextLine();

        entrada.close();

        System.out.println("################## Formulário Moderna #################");
        System.out.println ("Nome:" +nome);
        System.out.println("Idade:" +idade);
        System.out.println("CPF:" +CPF);
        System.out.println("Genero:" +genero);
        System.out.println("Email:" +email);
        System.out.println("Telefone:" +telefone);
        System.out.println("Rua:" +rua);
        System.out.println("Numero:" +numerorua);
        System.out.println("Bairro:" +bairro);
        System.out.println("Cidade:" +cidade);
        System.out.println("#####################################################");

    }
}

