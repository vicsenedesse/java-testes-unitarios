package ProjetoFuncionario;

//Coesão = atributos e métodos possuem responsabilidas e competências inerentes.

public class Dependente {
    
    //Atributos
    long id;
    String nome;
    String grauParentesco;

    //Encapsulamento = GET e SET
    //      Controlar o acesso de atributos e métodos de um objeto,
    //      através de uma interface bem definida.

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getGrauParentesco() {
        return grauParentesco;
    }
    public void setGrauParentesco(String grauParentesco) {
        this.grauParentesco = grauParentesco;
    }
}
