import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        var num1 = input.nextInt();
        System.out.println("Digite o segundo número: ");
        var num2 = input.nextInt();

        try {         
            contar(num1,num2);
        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
            input.close();
        }
    }

    static void contar(int num1, int num2) throws ParametrosInvalidosException{

        if(num1 > num2){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro! ");
        }else{
            int contagem = num2 - num1;

            for (int i = 0; i < contagem; i++) {
                System.out.println("Imprimindo número " + (i+1));                
            }
        }
    }
}
