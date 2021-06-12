package ProjetoFuncionario;

public class UsarFuncionarioDependente {
    
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario();
        Dependente dependente = new Dependente();
        ImplementaFuncionarioDependente objFuncionarioDependente = new ImplementaFuncionarioDependente(); 

       
        funcionario.setMatricula(123456);
        funcionario.setNome("Victoria");

        dependente.setId(2708);
        dependente.setNome("Bethoven");
        dependente.setGrauParentesco("filho");

        objFuncionarioDependente.setFuncionario(funcionario);
        objFuncionarioDependente.setDependente(dependente);

        objFuncionarioDependente.incluir();

    }
}
