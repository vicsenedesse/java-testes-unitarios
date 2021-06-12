package ProjetoFuncionario;

public class UsarFuncionarioDependenteDelegar {
    
    public static void main(String[] args) {
        
        ImplementaFuncionarioDependenteDelegar objImplementaFuncionarioDependenteDelegar = new  ImplementaFuncionarioDependenteDelegar();

        objImplementaFuncionarioDependenteDelegar.setMatricula(123456);
        objImplementaFuncionarioDependenteDelegar.setNome("Victoria");
        objImplementaFuncionarioDependenteDelegar.setNomeDependente("Bethoven");

        objImplementaFuncionarioDependenteDelegar.incluir();
    }
}
