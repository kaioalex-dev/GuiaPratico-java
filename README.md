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

#### Caractere 
- char: Armazena um único caractere Unicode de 16 bits (ex: 'a', 'Z')

### Lógico
- boolean: Armazena um valor verdadeiro ou falso (true ou false / 1 ou 0)

## Como esses tipos estão dentro da memória ?
| Tipo | Espaço na Memória     | Tipo de Dado    | Valor Padrão (Default) | Intervalo de Valores Suportados                        |
|-------|----------------------|-----------------|------------------------|--------------------------------------------------------|
| byte  | 8 bits (1 byte)      | Inteiro         |            0           |                     -128 a 127                         |
|short  | 16 bits (2 bytes)    | Inteiro         |            0           |                  -32.768 a 32.767                      |
| int   | 32 bits (4 bytes)    | Inteiro         |            0           |          -2.147.483.648 a 2.147.483.647                |
| long  | 64 bits (8 bytes)    | Inteiro         |            0L          | -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807 |
|float  | 32 bits (4 bytes)    |Ponto Flutuante  |            0.0f        |               Precisão simples (IEEE 754)              |
|double | 64 bits (8 bytes)    |Ponto Flutuante  |            0.0d        |               Precisão dupla (IEEE 754)                |
|char   | 16 bits (2 bytes)    |Caractere Unicode|          '\u0000'      |            '\u0000' (0) a '\uffff' (65.535)            |
|boolean|Variável (veja abaixo)|  Lógico         |           false        |               Apenas true ou false
