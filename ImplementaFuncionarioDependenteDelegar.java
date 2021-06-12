package ProjetoFuncionario;

//Acoplamento Fraco
//Implements = deve obrigatoriamente implementar todos os métodos
//declarados na interface.

public class ImplementaFuncionarioDependenteDelegar implements IFuncionarioDependenteDelegar{
    
    private Funcionario funcionario;
    private Dependente dependente;

  // Construtor
   public ImplementaFuncionarioDependenteDelegar(){
    funcionario = new Funcionario();
    dependente = new Dependente();

   }

    // Sobreposição (override) = Possibilita reescrever na classe filha os métodos implementados
    // previamente na classe pai, ou seja, uma classe filha pode redefinir
    // métodos herdados de suas descendentes, mantendo o nome e a assinatura.
    // Não confundir Polimorfismo com Sobrecarga!
    // Polimorfismo = Sempre há herança e os métodos tem a mesma assinatura.
    // Sobrecarga = Métodos obrigatoriamente possuem assinaturas diferentes.

   @Override
    public void incluir() {
          // Implementar o método incluir Funcionario
          System.out.println("Operação Incluir");
          System.out.println("Matricula: " + Long.toString(this.funcionario.getMatricula()) );
          System.out.println("Nome     : " + this.funcionario.getNome());
          System.out.println("Dependente    : " + this.dependente.getNome());
        
    }
    @Override
    public void alterar() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void deletar() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void pesquisar() {
        // TODO Auto-generated method stub
        
    }

// TODOS os métodos abaixo,
// foram delegados para a classe ImplementaFuncionarioDependenteDelegar


    public long getId() {
        return dependente.getId();
    }

    public void setId(long id) {
        dependente.setId(id);
    }

    public String getNomeDependente() {
        return dependente.getNome();
    }

    public void setNomeDependente(String nome) {
        dependente.setNome(nome);
    }

    public long getMatricula() {
        return funcionario.getMatricula();
    }

    public void setMatricula(long matricula) {
        funcionario.setMatricula(matricula);
    }

    public String getNome() {
        return funcionario.getNome();
    }

    public void setNome(String nome) {
        funcionario.setNome(nome);
    }
}
