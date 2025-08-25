import java.util.Scanner;

public class Contador {
    public static void main(String[] arg) {
    Scanner sc = new Scanner(System.in);

    try{
        //pede os dois parâmetros para o usúario
        System.out.println("Digite o primeiro número: ");
        int parametroUm = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int parametroDois = sc.nextInt();

        // chama o metodo que faz a contagem
        contar(parametroUm,parametroDois);

    } catch (ParametrosInvalidosException e){
        //captura a exceção customizada
        System.out.println(e.getMessage());
    } catch (Exception e){
        System.out.println("Entrada Inválida. Digite apenas números imteiros.");
    } finally {
        sc.close();
        }
    }

    // metodo responsavel pela lógica do programa
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        // validação da regra de negócio
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException("O segundo parêmetro deve ser maior que o primeiro");
        }

        int quantidadeInterações = parametroDois - parametroUm;

        //Estrutura de repetição para imprimir os números
        for (int i = 1; i <= quantidadeInterações; i++){
            System.out.println("imprimindo o número "+ i);
        }
    }
}
