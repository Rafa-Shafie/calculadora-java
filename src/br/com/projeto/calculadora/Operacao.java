package br.com.projeto.calculadora;

public enum Operacao {
    SOMA,
    SUBTRACAO,
    MULTIPLICACAO,
    DIVISAO,
    POTENCIA,
    INVALIDA;

    // Esse metodo vai pegar o que o usuario digitou e tentar encaixar nas opcoes acima
    public static Operacao deString(String texto) {
        // deString -> funcao que recebe o texto que o usuario digitou e devolve uma constante do tipo Operacao, como Operacao.SOMA, Operacao.DIVISAO, etc.
        try {
            // O .trim() tira espacos em branco e o .toUpperCase() transforma tudo em maiusculo
            return Operacao.valueOf(texto.trim().toUpperCase());
            // valueOf -> metodo que pega String tratada como "SOMA" e procura se existe alguma opcao com exatamente esse nome dentro do enum Operacao
        } catch (IllegalArgumentException e) {
            // Tratamento de excessoes para permitir apenas as palavras contidas no enum

            return INVALIDA;
        }
    }
}
