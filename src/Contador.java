import java.util.Scanner;
public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Entre com o primeiro parametro");
            int primeiroParametro = scanner.nextInt();
            System.out.println("Entre com o segundo parametro");
            int segundoParametro = scanner.nextInt();
        scanner.close();
        try { 
            contar(primeiroParametro, segundoParametro);
                
        } catch (ParametroInvalidoException e) {

            System.out.println("O segundo parâmetro deve ser maior que o primeiro");

        }
    }

    public static void contar(int primeiroParametro, int segundoParametro) throws Exception{
        if(primeiroParametro > segundoParametro)
            throw new ParametroInvalidoException();
            int interce = segundoParametro - primeiroParametro;
            for(int i = 1; i <= interce; i++ ){
                System.out.println("Imprimindo o numero" + i);
            

            }
        

    }
}
