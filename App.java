import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    //Calcule o Índice de Massa Corporal (IMC) de uma pessoa, onde o usuário fornece o peso em 
    //quilogramas e a altura em metros.

    Scanner sc = new Scanner(System.in);
    System.out.println("Digite seu peso em quilograma:");
    double peso = sc.nextDouble();

    System.out.println("Digite sua altura em metros: ");
    double altura = sc.nextDouble();

    double imc = peso / (altura * altura);

    System.out.println("O indice do IMC é: " +imc);
    }
}
