## JAVA

### Boas Práticas de Programação

- Use nomes de variáveis e métodos descritivos e em camelCase.
- Indente corretamente o código para facilitar a leitura.
- Comente trechos de código complexos.
- Evite variáveis globais desnecessárias.
- Prefira constantes para valores fixos.
- Feche recursos como `Scanner` após o uso com `sc.close();`.
- Separe responsabilidades em métodos e classes.
- Evite duplicação de código.

### Como compilar e executar um programa
Para compilar um programa Java, utilize o comando `javac` seguido do nome do arquivo `.java`. Para executar, use o comando `java` seguido do nome da classe (sem a extensão):

```bash
javac MeuPrograma.java      # Compila o arquivo
java MeuPrograma.java       # Executa a classe compilada
```

Certifique-se de que o nome da classe pública no arquivo seja igual ao nome do arquivo. O compilador irá gerar um arquivo `.class` com o bytecode, que pode ser executado pela JVM.

### Comandos de Entrada

Em Java, a entrada de dados pode ser feita usando a classe `Scanner`:

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);

int numero = sc.nextInt(); // Lê um inteiro do teclado

String texto = sc.nextLine(); // Lê uma linha de texto

sc.close(); // Boa prática: fechar o Scanner após o uso
```

### Comandos de Saída

A saída de dados é feita principalmente com `System.out.println`:

```java
System.out.println("Olá, mundo!"); // Imprime uma linha

System.out.print("Digite um número: "); // Imprime sem pular linha
```

### Comandos de Condição

Estruturas condicionais permitem executar blocos de código conforme uma condição:

```java
if (numero > 0)
{

    System.out.println("Número positivo");

}
else if (numero < 0)
{

    System.out.println("Número negativo");

}
else
{

    System.out.println("Zero");

}
```

### Comandos de Repetição

Estruturas de repetição permitem executar um bloco de código várias vezes:

```java
// while
int i = 0;
while (i < 5)
{

    System.out.println(i);
    i++;

}

// for
for (int j = 0; j < 5; j++)
{

    System.out.println(j);

}

// do-while
int k = 0;
do
{

    System.out.println(k);
    k++;

}
while (k < 5);
```
