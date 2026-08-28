package michael_program;

public class program {
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

        mediaOuvintesFloat = spotifyBillieJean / (2026 - 2013) * 365; // Media de ouvintes no spotify desde o lançamento
                                                                      // dentro do spotify
        mediaOuvintesDouble = spotifyBillieJean / (2026 - 2013) * 365; // Media de ouvintes no spotify desde o
                                                                       // lançamento dentro do spotify
        System.out.println("***************************************");
        System.out.printf("Informações do Michael Jackson:");
        System.out.printf("%n%nData de nascimento: %d/%d/%d%n", diaNascimento, mesNascimento, anoNascimento);
        System.out.printf("Idade que Michael começou a cantar: %d%n", idadeMichaelIniciou);
        System.out.printf("Sexo: %c%n", sexo);
        System.out.printf("Album mais vendido da história: Thriller%n");
        System.out.printf("Musica mais escutada do album Thriller: Billie Jean%n");
        System.out.printf("Ano de lançamento de Billie Jean: %d%n", anoLancamentoBillieJean);
        System.out.printf("Quantidade de vendas: %d milhões%n", vendasBillieJean);
        System.out.printf("Totais de stream no Spotify: %d bilhões%n", spotifyBillieJean);
        System.out.printf("(Float) Média de ouvintes desde o lançamento no spotify: %f%n", mediaOuvintesFloat);
        System.out.printf("(Double) Média de ouvintes desde o lançamento no spotify: %f%n%n", mediaOuvintesDouble);
        System.out.println("***************************************");
    }
}