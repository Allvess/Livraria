public class Editora {


    String nome;
    String ano;
    String cnpj;
    String endereço;
    String pais;
    String estado;

    public Editora(String nome, String ano, String cnpj, String endereço, String pais, String estado) {
        this.nome = nome;
        this.ano = ano;
        this.cnpj = cnpj;
        this.endereço = endereço;
        this.pais = pais;
        this.estado = estado;
    }

    public String listdados1() {
        return "Editora{" +
                "nome='" + nome + '\'' +
                ", ano='" + ano + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", endereço='" + endereço + '\'' +
                ", pais='" + pais + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
