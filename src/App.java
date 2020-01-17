public class App {
    public static void main(String[] args) {

       Editora alvesedition =  new Editora("EditionAlves",
               "2k20",
               "72.883.902/0001-24",
               "Rua Principal  n 51b",
               "Brasil",
               "São Paulo");



        Autor pessoa  = new Autor("Patrick"
        , "Alves",
                "aventura",
                "Masculino",
                "Brasil",
                "São  Paulo",
                26);

        Livro livro = new Livro ("As aventuras de Allves",
                "False",
                "Aventura",
                pessoa.nome,
                alvesedition.nome,
                6,
                2018);

        alvesedition.listdados1();
            System.out.println(alvesedition.listdados1());

         pessoa.listdado();
            System.out.println(pessoa.listdado());

        )
         livro.abreLivro();
            if ( livro.abreLivro()  ==






    }
}
