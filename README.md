# GuiaPratico-java
Guia prático dos usos de tipos primitivos de java e utilização de casting

## Quantos tipos primitivos há em java?
Em java há 8 tipos primitivos, podendo ser separado em grupos. Inteiro, Ponto flutuante(decimais), Caractere e Lógico.

### Inteiros
- byte: Armazena números de 8 bits (de -128 a 127)
- short: Armazena números de 16 bits (de -32.768 a 32.767)
- int: Armazena números de 32 bits (o mais usado para números inteiros)
- long: Armazena números de 64 bits (para valores inteiros muito grandes)

### Ponto Flutuante (decimais)
- float: Armazena números decimais de 32 bits (precisão simples).
- double: Armazena números decimais de 64 bits (precisão dupla, o padrão para decimais)

### Caractere 
- char: Armazena um único caractere Unicode de 16 bits (ex: 'a', 'Z')

### Lógico
- boolean: Armazena um valor verdadeiro ou falso (true ou false / 1 ou 0)

## Como esses tipos são representados e funcionam na memória ?
| Tipo | Espaço na Memória     | Tipo de Dado    | Valor Padrão (Default) | Intervalo de Valores Suportados                        |
|-------|----------------------|-----------------|------------------------|--------------------------------------------------------|
| byte  | 8 bits (1 byte)      | Inteiro         |            0           |                     -128 a 127                         |
|short  | 16 bits (2 bytes)    | Inteiro         |            0           |                  -32.768 a 32.767                      |
| int   | 32 bits (4 bytes)    | Inteiro         |            0           |          -2.147.483.648 a 2.147.483.647                |
| long  | 64 bits (8 bytes)    | Inteiro         |            0L          | -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807 |
|float  | 32 bits (4 bytes)    |Ponto Flutuante  |            0.0f        |               Precisão simples (IEEE 754)              |
|double | 64 bits (8 bytes)    |Ponto Flutuante  |            0.0d        |               Precisão dupla (IEEE 754)                |
|char   | 16 bits (2 bytes)    |Caractere Unicode|          '\u0000'      |            '\u0000' (0) a '\uffff' (65.535)            |
|boolean|Variável (veja abaixo)|  Lógico         |           false        |               Apenas true ou false                     |

## O que é casting em Java?
Casting em Java é o ato de transformar um dado de um tipo em outro. Isso acontece de duas formas: com tipos primitivos (como transformar double em int) ou com objetos de classes diferentes que possuem relação de herança (Casting em objetos não foram abordados aqui)

Nós podemos realizar casting em tipos primitivos sem risco de perda de dados respeitando uma ordem entre eles: 

**byte → short → int → long → float → double**

### Casting entre tipos primitivos
- Widening (implícito, automático) é quando você converte de um tipo "menor" para um "maior", o Java faz sozinho, sem perigo de perda de dados
```
int numero = 10;
double numeroDouble = numero; // int -> double, automático
```
- Narrowing (explícito, precisa do cast) é quando você converte de um tipo "maior" para um "menor", há risco de perder informação. Por isso o Java exige que você seja explícito, usando o tipo entre parênteses.
```
double valor = 9.78;
int valorInt = (int) valor; // vira 9, a parte decimal é descartada
```
```
int numeroGrande = 300;
byte numeroByte = (byte) numeroGrande; // pode dar resultado inesperado (overflow)
```
## Um grande exemplo de como usar cada tipo
Copie e teste esse codigo. Estude e entenda os motivos de cada uso.

```
public class Program {
    public static void main(String[] args) {
        // Informações sobre michael jackson

        byte diaNascimento = 29; // Representação -128 a 127
        byte mesNascimento = 8; // Representação -128 a 127
        short anoNascimento = 1958; // Representação -32.768 a 32.767
        byte idadeMichaelIniciou = 10; // Representação -128 a 127
        char sexo = 'M'; // Representação 0 até 65.535
        int vendasBillieJean = 10000000; // Representação -2,1 bilhões a 2,1 bilhões
        long spotifyBillieJean = 2000000000L; // Representação -9,2 quiintilhões a 9,2 quintilhões
        short anoLancamentoBillieJean = 1983; // Representação -32.768 a 32.767
        float mediaOuvintesFloat; // (Precisão simples com até aproximadamente 7 casas decimais)
        double mediaOuvintesDouble; // (Precisão dupla com até aproxidamente 16 casas decimais)
        boolean ehReiDoPop = true; // Representação true ou false (1 ou 0)

        mediaOuvintesFloat = spotifyBillieJean / (2026 - 2013) * 365; // Media de ouvintes no spotify desde o lançamento
                                                                      // dentro do spotify
        mediaOuvintesDouble = spotifyBillieJean / (2026 - 2013) * 365; // Media de ouvintes no spotify desde o
                                                                       // lançamento dentro do spotify
        System.out.println("***************************************");
        System.out.printf("Informações do Michael Jackson");
        System.out.printf("%n%nData de nascimento: %d/%d/%d%n", diaNascimento, mesNascimento, anoNascimento);
        System.out.printf("Idade que Michael começou a cantar: %d%n", idadeMichaelIniciou);
        System.out.printf("Sexo: %c%n", sexo);
        System.out.printf("Album mais vendido da história: Thriller%n");
        System.out.printf("Musica mais escutada do album Thriller: Billie Jean%n");
        System.out.printf("Ano de lançamento de Billie Jean: %d%n", anoLancamentoBillieJean);
        System.out.printf("Quantidade de vendas: %d milhões%n", vendasBillieJean);
        System.out.printf("Totais de stream no Spotify: %d bilhões%n", spotifyBillieJean);
        System.out.printf("(Float) Média de ouvintes desde o lançamento no spotify: %f%n", mediaOuvintesFloat);
        System.out.printf("(Double) Média de ouvintes desde o lançamento no spotify: %f%n", mediaOuvintesDouble);
        System.out.printf("É o rei do pop: %b%n%n", ehReiDoPop);
        System.out.println("***************************************");
    }
}

```
