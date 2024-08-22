import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
       try(Scanner scanner = new Scanner(System.in).useLocale(Locale.US)){

        //solicitado os dados do usuario
       System.out.print("Informe o primeiro numero: ");
       int numeroUm = scanner.nextInt();

       System.out.print("Informe o segundo numero: ");
       int numeroDois = scanner.nextInt();

        //chamando o metodo contendo a logica de contagem
        contar(numeroUm, numeroDois);

       } catch (ParametrosInvalidosException e) {
        System.out.println("o segundo parametro deve ser maior que o primeiro");
       }
    }
    static void contar(int numeroUm, int numeroDois) throws ParametrosInvalidosException{
        //validar se o numeroUm é MAIOR que o numeroDois e lançando excecao
        if (numeroUm >= numeroDois) {
            
            throw new ParametrosInvalidosException();
        }
        int contagem = numeroDois - numeroUm;
        for(int i = 0; i < contagem; i ++){
            System.out.println("Os numeros informados são: " + (i+1));
        } 
    }
}
