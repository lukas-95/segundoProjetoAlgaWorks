public class Pessoa {

    String nome;
    int idade;

    Pessoa(String nome){
        this.nome = nome;
        //se tem uma inicialização pesada pode chamar ele em outro construtor.
    }
    Pessoa(String nome, int idade){
        this(nome); // Tem que ser a primeira instrução do construtor.
        this.idade = idade;
    }

}
