import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Atividade 3\n");
        System.out.print("Informe um número: ");
        int n1=sc.nextInt();
        System.out.print("\nInforme outro número: ");
        int n2=sc.nextInt();
        System.out.print("\nInforme outro número: ");
        int n3=sc.nextInt();
        sc.close();
        int resultadoSoma=calculo(n1, n2, n3);
        System.out.println("\nA soma dos números informados é: "+resultadoSoma);
    }   

    static int calculo(int n1, int n2, int n3){
        int soma=n1+n2+n3;
        return soma;
    }
}
