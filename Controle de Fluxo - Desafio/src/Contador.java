import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = stdin.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = stdin.nextInt();
        int contagem = parametroDois - parametroUm;

        try {
			contar(parametroUm, parametroDois);

		}catch (ParametrosInvalidosException e) {
            System.err.println("O segundo parâmetro deve ser maior que o primeiro." + e) ;
            /*System.out.println("FAREI UM AJUSTE E IREI IMPRIMIR DA MESMA FORMA."); 

            contagem = parametroUm - parametroDois;
            for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);*/            
            //}
		}
		
        stdin.close();
	}
    
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        int contagem = parametroDois - parametroUm;
         
		
        if (parametroDois > parametroUm) {
            
            contagem = (parametroDois - parametroUm);
                for (int i = 1; i <= contagem; i++) {
                System.out.println("Imprimindo o número " + i);            
            }
        }

        else if (parametroDois == parametroUm) {

            System.out.println("POR FAVOR DIGITE NÚMEROS DIFERENTES ENTRE SI, MDS.");
        }
        else 
        {
            throw new ParametrosInvalidosException(parametroUm, parametroDois);


            
        }

	}
}
