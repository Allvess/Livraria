public class Livro {

    String titulo;
    boolean estadoLivro;
    String genero1;
    String autor;
    String editora;
    int paginaA;
    int anoP;

    public Livro(String titulo, boolean estadoLivro, String genero1, String autor, String editora, int paginaA, int anoP) {
        this.titulo = titulo;
        this.estadoLivro = estadoLivro;
        this.genero1 = genero1;
        this.autor = autor;
        this.editora = editora;
        this.paginaA = paginaA;
        this.anoP = anoP;
    }

    public String listdados3() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", estadoLivro='" + estadoLivro + '\'' +
                ", genero1='" + genero1 + '\'' +
                ", autor='" + autor + '\'' +
                ", editora='" + editora + '\'' +
                ", paginaA=" + paginaA +
                ", anoP=" + anoP +
                '}';
    }
     public void abreLivro() {

         this.estadoLivro = true;
     }

     public  void  FechaL() {
         this.estadoLivro = false;
     }








}