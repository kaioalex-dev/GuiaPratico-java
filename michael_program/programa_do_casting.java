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
        boolean ehReiDoPop = true; // Representação true ou false (1 ou 0)

        // ============================
        // TIPOS INTEIROS
        // ============================

        byte diaNascimento = 29;
        short diaNascimentoShort = diaNascimento; 
        // CASTING IMPLÍCITO: byte → short

        int anoNascimento = 1958;
        long anoNascimentoLong = anoNascimento;
        // CASTING IMPLÍCITO: int → long

        long visualizacoes = 2000000000L;
        int visualizacoesInt = (int) visualizacoes;
        // CASTING EXPLÍCITO: long → int


        // ============================
        // FLOAT E DOUBLE
        // ============================

        int idadeMichael = 10;

        double idadeMichaelDouble = idadeMichael;
        // CASTING IMPLÍCITO: int → double

        double duracaoMusica = 4.38;

        float duracaoMusicaFloat = (float) duracaoMusica;
        // CASTING EXPLÍCITO: double → float


        // ============================
        // CHAR
        // ============================

        char sexo = 'M';

        int codigoSexo = sexo;
        // CASTING IMPLÍCITO: char → int

        char letra = (char) 77;
        // CASTING EXPLÍCITO: int → char
        // 77 na tabela Unicode representa 'M'


        // ============================
        // BYTE
        // ============================

        int numeroAlbuns = 6;

        byte numeroAlbunsByte = (byte) numeroAlbuns;
        // CASTING EXPLÍCITO: int → byte


        // ============================
        // SHORT
        // ============================

        short anoLancamento = 1983;

        int anoLancamentoInt = anoLancamento;
        // CASTING IMPLÍCITO: short → int


        // ============================
        // LONG
        // ============================

        long ouvintesSpotify = 2000000000L;

        double ouvintesDouble = ouvintesSpotify;
        // CASTING IMPLÍCITO: long → double


        // ============================
        // BOOLEAN
        // ============================

        boolean ehReiDoPop = true;

        // NÃO existe casting numérico:
        // int valor = (int) ehReiDoPop; ❌


        // ============================
        // FLOAT
        // ============================

        float media = 10.5f;

        double mediaDouble = media;
        // CASTING IMPLÍCITO: float → double


        // ============================
        // DOUBLE
        // ============================

        double precoDisco = 150.99;

        int precoInteiro = (int) precoDisco;
        // CASTING EXPLÍCITO: double → int
        // Resultado: 150
  }
}
