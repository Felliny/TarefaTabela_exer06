package Model;

public class Item {

    int andar;
    String departamento;
    String descricao;
    String nome;


    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Item{" +
                "andar=" + andar +
                ", departamento='" + departamento + '\'' +
                ", descricao='" + descricao + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
