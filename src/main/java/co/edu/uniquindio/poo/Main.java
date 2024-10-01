package co.edu.uniquindio.poo;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class Main {
        public static void main(String[] args) {
                Biblioteca biblioteca = new Biblioteca("Biblioteca Euclidiana");

                Autor autor2 = new Autor("Agatha Christie", "12345678", "agatha@example.com", 123456789, "1890/09/15",
                                "Britanica");

                Autor autor1 = new Autor("J.R.R. Tolkien", "87654321", "tolkien@example.com", 987654321, "1892/03/01",
                                "Británico");

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
                Libro libro6 = new Libro("6J654P", "978-0-06-112008-4", autor1, "J.B. Lippincott & Co.",
                                "Matar a un ruiseñor",
                                LocalDate.of(1960, 7, 11), 6);
                Libro libro7 = new Libro("7K321Q", "978-0-618-15219-3", autor1, "George Allen & Unwin",
                                "El señor de los anillos", LocalDate.of(1954, 7, 29), 8);
                Libro libro8 = new Libro("8L678R", "978-0-14-303500-8", autor1, "The Russian Messenger", "Guerra y paz",
                                LocalDate.of(1869, 1, 1), 2);
                Libro libro9 = new Libro("9M345S", "978-0-7432-7350-4", autor2, "Chatto & Windus",
                                "Las aventuras de Tom Sawyer", LocalDate.of(1876, 6, 1), 5);
                Libro libro10 = new Libro("10N234T", "978-0-06-295728-1", autor2, "William Collins", "Diez negritos",
                                LocalDate.of(1939, 11, 6), 4);

                biblioteca.agregarLibro(libro1);
                biblioteca.agregarLibro(libro2);
                biblioteca.agregarLibro(libro3);
                biblioteca.agregarLibro(libro4);
                biblioteca.agregarLibro(libro5);
                biblioteca.agregarLibro(libro6);
                biblioteca.agregarLibro(libro7);
                biblioteca.agregarLibro(libro8);
                biblioteca.agregarLibro(libro9);
                biblioteca.agregarLibro(libro10);

                // Crear Estudiantes
                Estudiante estudiante1 = new Estudiante("Juan Pérez", "111222333", "juan.perez@mail.com", 321456789,
                                20);
                Estudiante estudiante2 = new Estudiante("Ana María", "444555666", "ana.maria@mail.com", 312456789, 22);

                // Agregar Estudiantes a la Biblioteca
                biblioteca.agregarEstudiante(estudiante1);
                biblioteca.agregarEstudiante(estudiante2);

                // Crear Bibliotecarios
                Bibliotecario bibliotecario1 = new Bibliotecario("Carlos Sánchez", "777888999",
                                "carlos.sanchez@mail.com", 311123456, 2000.0, 5);
                Bibliotecario bibliotecario2 = new Bibliotecario("Marta López", "111333555", "marta.lopez@mail.com",
                                310789123, 2500.0, 3);

                // Agregar Bibliotecarios a la Biblioteca
                biblioteca.agregarBibliotecario(bibliotecario1);
                biblioteca.agregarBibliotecario(bibliotecario2);

                // Registrar Préstamos
                Prestamo prestamo1 = new Prestamo(LocalDate.now(), LocalDate.now().plusDays(10), 5.0, "P001",
                                estudiante1, bibliotecario1);
                DetallePrestamo detalle1 = new DetallePrestamo(2, libro1, 200.000);
                prestamo1.agregarDetallePrestamo(detalle1);
                biblioteca.registrarPrestamo(prestamo1);

                Prestamo prestamo2 = new Prestamo(LocalDate.now(), LocalDate.now().plusDays(5), 3.0, "P002",
                                estudiante2, bibliotecario2);
                DetallePrestamo detalle2 = new DetallePrestamo(1, libro2, 200.000);
                prestamo2.agregarDetallePrestamo(detalle2);
                biblioteca.registrarPrestamo(prestamo2);
                prestamo2.entregarPrestamo();
                biblioteca.ConsultarDatosPrestamo("P001");
                biblioteca.ConsultarDatosPrestamo("P002");

                biblioteca.mostrarCatalogo();

                biblioteca.TotalGanancia();

                biblioteca.totalPagoBibliotecarios();

                biblioteca.estudianteConMasPrestamos();

                biblioteca.cantidadPrestamosLibro("Cien Años de Soledad");
        }
}
