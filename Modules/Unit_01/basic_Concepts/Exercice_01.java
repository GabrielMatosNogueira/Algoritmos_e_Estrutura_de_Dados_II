package Algoritmos_e_Estrutura_de_Dados_II.Modules.Unit_01.basic_Concepts;

import java.util.Scanner;

/**
 * Algoritmo de pesquisa sequencial em memoria principal.
 * 
 * Procedimentos:
 * 0.1 - Declaracao de variaveis
 * 0.2 - Declaracao de um vetor com numeros inteiros
 * 1.0 - Requisicao dos dados do usuario via interface
 * 1.1 - Armazenamento dos dados
 * 
 * @version v0.1
 */
public class Exercice_01
{

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Digite o valor que deseja procurar dentro do intervalo de numeros: ");
        int numberToSearch = scanner.nextInt();

        System.out.println();
        System.out.println("\nAgora escreva quantos numeros deseja armazenar na estrutura para procurar o numero digitado anteriormente: ");
        int numberQuantity = scanner.nextInt();

        int[] numbersStorage = new int[numberQuantity];

        for (int i = 0; i < numberQuantity; i++)
        {
            System.out.println("Digite um numero para a posicao: " + i);
            numbersStorage[i] = scanner.nextInt();
        }

        System.out.print("\nNumeros armazenados ");
        for (int num : numbersStorage)
        {
            System.out.print("[" + num + "] ");
        }
        System.out.println();

        boolean numberFound = false;
        for (int num : numbersStorage)
        {
            if (num == numberToSearch)
            {
                numberFound = true;
                break;
            }
        }

        if (numberFound)
        {
            System.out.println();
            System.out.println("O numero " + numberToSearch + " foi encontrado na estrutura");
        }
        else
        {
            System.out.println();
            System.out.println("O numero " + numberToSearch + " nao foi encontrado na estrutura");
        }

        scanner.close();

    }

}
