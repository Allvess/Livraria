public class Autor {

    String  nome;
    String sobrenome;
    String generoLiterarel;
    String sexo;
    String pais;
    String cidade;
    int idade;

    public Autor(String nome, String sobrenome, String generoLiterarel, String sexo, String pais, String cidade, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.generoLiterarel = generoLiterarel;
        this.sexo = sexo;
        this.pais = pais;
        this.cidade = cidade;
        this.idade = idade;
    }

    public String listdado() {
        return "Autor{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", generoLiterarel='" + generoLiterarel + '\'' +
                ", sexo='" + sexo + '\'' +
                ", pais='" + pais + '\'' +
                ", cidade='" + cidade + '\'' +
                ", idade=" + idade +
                '}';
    }
}



