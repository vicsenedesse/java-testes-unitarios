package ProjetoFuncionario;

//Acoplamento Fraco
//Implements = deve obrigatoriamente implementar todos os métodos
//declarados na interface.

public class ImplementaFuncionarioDependente implements IFuncionarioDependente {
    
    private Funcionario funcionario;
    private Dependente dependente;

    // Sobreposição (override) = Possibilita reescrever na classe filha os métodos implementados
    // previamente na classe pai, ou seja, uma classe filha pode redefinir
    // métodos herdados de suas descendentes, mantendo o nome e a assinatura.
    // Não confundir Polimorfismo com Sobrecarga!
    // Polimorfismo = Sempre há herança e os métodos tem a mesma assinatura.
    // Sobrecarga = Métodos obrigatoriamente possuem assinaturas diferentes.

    @Override
    public Funcionario getFuncionario() {
        return this.funcionario;
    }

    @Override
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public void setDependente(Dependente dependente) {
        this.dependente = dependente;
    }

    @Override
    public Dependente getDependente() {
        return this.dependente;
    }

    @Override
    public void incluir() {
        // Implementar o método incluir Funcionario
        System.out.println("Operação Incluir");
        System.out.println("Matricula: " + Long.toString(this.funcionario.getMatricula()));
        System.out.println("Nome     : " + this.funcionario.getNome());
        System.out.println("Dependente    : " + this.dependente.getNome());
        System.out.println("Grau Parentesco    : " + this.dependente.getGrauParentesco());
    }

    @Override
    public void alterar() {
        // Implementar o método alterar Funcionario
    }

    @Override
    public void deletar() {
        // Implementar o método deletar Funcionario
    }

    @Override
    public void pesquisar() {
        // Implementar o método pesquisar Funcionario
    }
}
