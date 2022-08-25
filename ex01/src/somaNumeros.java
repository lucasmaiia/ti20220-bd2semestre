import java.util.*;

public class somaNumeros {

    public static Scanner auxsc= new Scanner (System.in);
    static public void  main (String[] args){  


        int numero1, number2, soma;

        System.out.println(">> Seja bem vindo ao programa 'Soma Inteiros' \n >> Digite o primeiro numero da soma: ");
        numero1=auxsc.nextInt();
        System.out.println(">> Agora digite o segundo numero: ");
        number2=auxsc.nextInt();

        soma = numero1 + number2;

        System.out.println(">> Resultado: "+soma);

    }
}
