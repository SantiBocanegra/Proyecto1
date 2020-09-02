import java.util.Scanner;

public class Primo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int a=0;

        System.out.println("Ingrese un numero de 1 al 100 para ver si es primo");
        numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) { //Se hace un for que recorre desde el numero 1 hasta el numero ingrasado
           
            if(numero%i==0)// Con esta operacion se calcula si el residuo del numero e i es Cero=0
                a++;// Cauntas veces la condicion if de Cero, se va acumulando en a
        }
    
            if(a==2) { //En esta condicion miramos si a = a 2, esto se hace porque el numero primo se divisible por
                       //1 y el mismo numero, por lo tanto el residuo debe de ser 2, si da mas de 2 o menos de 2
                       //no es primo 
                System.out.println("El numero es primo");
            } else { //Si no se cumple la condicion de arriba entonces no es primo
                System.out.println("El numero no es primo");
            }
           
        }


}
