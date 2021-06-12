package ProjetoFuncionario;

//Acoplamento = Interface diminui o acoplamento.
//Interface = Ligação Física ou Lógica entre dois Sistemas.

public interface IFuncionarioDependente {
    
    public abstract Funcionario getFuncionario();
    public abstract void  setFuncionario(Funcionario funcionario);
    public abstract void setDependente(Dependente dependente);
    public abstract Dependente getDependente();
    public abstract void incluir();
    public abstract void alterar();
    public abstract void deletar();
    public abstract void pesquisar();
}
