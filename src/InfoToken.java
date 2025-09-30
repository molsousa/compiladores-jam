// Classe para criar especificação de token (léxico)
class InfoToken {
    String tipo;
    String lexema;
    int linha;
    int coluna;

    public InfoToken(String tipo, String lexema, int linha, int coluna) {
        this.tipo = tipo;
        this.lexema = lexema;
        this.linha = linha;
        this.coluna = coluna;
    }

    @Override
    public String toString() {
        return String.format("Tipo: %s\nLexema: <'%s'>\nLinha: %d, Coluna: %d\n", this.tipo, this.lexema, this.linha, this.coluna);
    }
}