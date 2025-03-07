import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        Filme filme1 = new Filme("Oldboy",2000,10,190);
        Filme filme2 = new Filme("Topgun",1980,2,200);
        Filme filme3 = new Filme("Interstellar",2014,8,170);
        Filme filme4 = new Filme("Perfect Days",2023,10,185);


        Serie serie1 = new Serie("Lost",2000,3,9,10);
        Serie serie2 = new Serie("Breaking Bad",2001,10,6,20);
        Serie serie3 = new Serie("Game Of Thrones",2015,8,8,10);
        Serie serie4 = new Serie("Supernatural",2002,7,12,15);

        List<Titulo> titulos = new LinkedList<>();

            titulos.add(filme1);
            titulos.add(filme2);
            titulos.add(filme3);
            titulos.add(filme4);
            titulos.add(serie1);
            titulos.add(serie2);
            titulos.add(serie3);
            titulos.add(serie4);
            System.out.println(titulos.size());
            Collections.sort(titulos);
        for (Titulo titulo : titulos) {
            System.out.println(titulo);
        }


    }
}
