package hibernate;

import hibernate.objetos.Album;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Raquel on 31/01/17.
 */
public class Main {
    private static Scanner teclado = new Scanner(System.in);


    public static void main(String[] args) {
        mostrarAlbumId();
    }

    private static void mostrarAlbumId() {
        System.out.print("Introduce un id: ");
        int id = teclado.nextInt();

        String query = "select * from album where id = " + id + ";";

        Session session = HibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery(query);
        List resultado = q.list();

        Iterator iterator = resultado.iterator();
        while (iterator.hasNext()) {
            Album album = (Album) iterator.next();
            System.out.println("- " + album.getId() + " - " + album.getTituloAl() + " - " + album.getAnio() + ".");
        }
        session.close();

    }

}
