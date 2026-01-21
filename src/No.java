import java.util.LinkedList;

//Classe para nó de arvore sintática
public class No {
	String tipo;
    String valor;
    String tipoDado;
    LinkedList<No> filhos;
    
    public No(String tipo) {
        this.tipo = tipo;
        this.valor = null;
        this.filhos = new LinkedList<>();
    }
    
    public No(String tipo, String valor) {
        this.tipo = tipo;
        this.valor = valor;
        this.filhos = new LinkedList<>();
    }

    public void adicionarFilho(No filho) {
        if (filho != null) {
            this.filhos.add(filho);
        }
    }

    @Override
    public String toString() {
        return "No(Tipo=" + tipo + ", Valor=" + valor + ")";
    }
}
