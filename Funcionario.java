package ProjetoFuncionario;

//Coesão = atributos e métodos possuem responsabilidas e competências inerentes.

public class Funcionario {
    
     //Atributos
     long matricula;
     String nome;
 
     //Encapsulamento = GET e SET
     //      Controlar o acesso de atributos e métodos de um objeto,
     //      através de uma interface bem definida.
 
     public long getMatricula() {
         return matricula;
     }
     public void setMatricula(long matricula) {
         this.matricula = matricula;
     }
     public String getNome() {
         return nome;
     }
     public void setNome(String nome) {
         this.nome = nome;
     }
}
