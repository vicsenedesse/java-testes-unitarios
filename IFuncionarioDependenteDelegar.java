package ProjetoFuncionario;

//Acoplamento = Interface diminui o acoplamento.
//Interface = Ligação Física ou Lógica entre dois Sistemas.

public interface IFuncionarioDependenteDelegar {
    
    public abstract void incluir();
    public abstract void alterar();
    public abstract void deletar();
    public abstract void pesquisar();
}
