package co.edu.uniquindio.poo;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Euclidiana");

        Autor autor2 = new Autor("Agatha Christie", "12345678", "agatha@example.com", 123456789, "1890/09/15", "Britanica");


        // Autor J.R.R. Tolkien
        Autor autor1 = new Autor("J.R.R. Tolkien", "87654321", "tolkien@example.com", 987654321, "1892/03/01", "Británico");
    

        Libro libro1 = new Libro("1E786H", "12323-12-355", autor1, "The Guardian", "Las aves y el amanecer",
                LocalDate.of(2007, 1, 24), 7);
        Libro libro2 = new Libro("2F678J", "978-3-16-148410-0", autor1, "Bloomsbury",
                "Harry Potter y la piedra filosofal", LocalDate.of(1997, 6, 26), 10);
        Libro libro3 = new Libro("3G456K", "978-0-452-28423-4", autor2, "Secker & Warburg", "1984",
                LocalDate.of(1949, 6, 8), 5);
        Libro libro4 = new Libro("4H123M", "978-0-7432-7356-5", autor1, "Scribner", "El gran Gatsby",
                LocalDate.of(1925, 4, 10), 3);
        Libro libro5 = new Libro("5I987N", "978-0-19-953556-9", autor2, "T. Egerton", "Orgullo y prejuicio",
                LocalDate.of(1813, 1, 28), 4);
        Libro libro6 = new Libro("6J654P", "978-0-06-112008-4", autor1, "J.B. Lippincott & Co.", "Matar a un ruiseñor",
                LocalDate.of(1960, 7, 11), 6);
        Libro libro7 = new Libro("7K321Q", "978-0-618-15219-3", autor1, "George Allen & Unwin",
                "El señor de los anillos", LocalDate.of(1954, 7, 29), 8);
        Libro libro8 = new Libro("8L678R", "978-0-14-303500-8", autor1, "The Russian Messenger", "Guerra y paz",
                LocalDate.of(1869, 1, 1), 2);
        Libro libro9 = new Libro("9M345S", "978-0-7432-7350-4", autor2, "Chatto & Windus",
                "Las aventuras de Tom Sawyer", LocalDate.of(1876, 6, 1), 5);
        Libro libro10 = new Libro("10N234T", "978-0-06-295728-1", autor2, "William Collins", "Diez negritos",
                LocalDate.of(1939, 11, 6), 4);

    }
}
