package homework04.book;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

public class BookServiceTest {
    private BookRepository bookRepository;
    private BookService bookService;

    @BeforeEach
    public void setUp() {
        // создание заглушки для объекта bookRepository.
        bookRepository = mock(BookRepository.class);
        // создание объекта bookService с использованием заглушки bookRepository.
        bookService = new BookService(bookRepository);
    }

    @Test
    public void testFindBookById() {
        // объявление переменной id типа String со значением "1".
        String id = "1";
        // создание объекта book типа Book с переданными параметрами.
        Book book = new Book(id, "Book1", "Author1");
        // определение поведения заглушки bookRepository при вызове метода findById с параметром id.
        when(bookRepository.findById(id)).thenReturn(book);
        // вызов метода findBookById объекта bookService с параметром id и сохранение результата в переменную result.
        Book result = bookService.findBookById(id);
        // проверка ожидаемого значения (book) и фактического значения (result) с помощью метода assertEquals.
        assertEquals(book, result);
        // проверка, был ли вызван метод findById у заглушки bookRepository с параметром id один раз
        // с помощью метода verify и аргумента times(1).
        verify(bookRepository, times(1)).findById(id);
    }

    @Test
    public void testFindAllBook() {
        // создание объекта book1 типа Book с переданными параметрами.
        Book book1 = new Book("1", "Book1", "Author1");
        // создание объекта book2 типа Book с переданными параметрами.
        Book book2 = new Book("2", "Book2", "Author2");
        // создание списка books типа List<Book> с использованием метода asList класса Arrays.
        List<Book> books = Arrays.asList(book1, book2);
        // определение поведения заглушки bookRepository при вызове метода findAll.
        when(bookRepository.findAll()).thenReturn(books);
        // вызов метода findAllBooks объекта bookService и сохранение результата в переменную result.
        List<Book> result = bookService.findAllBooks();
        // проверка ожидаемого значения (books) и фактического значения (result) с помощью метода assertEquals.
        assertEquals(books, result);
        // проверка, был ли вызван метод findAll у заглушки bookRepository с параметром id один раз с помощью метода
        // verify и аргумента times(1).
        verify(bookRepository, times(1)).findAll();
    }
}