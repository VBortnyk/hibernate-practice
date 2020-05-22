import com.dev.hbnt.lib.Injector;
import com.dev.hbnt.model.Author;
import com.dev.hbnt.model.Book;
import com.dev.hbnt.service.BookService;

import java.util.List;

public class Main {
    private static final Injector injector = Injector.getInstance("com.dev.library");

    public static void main(String[] args) {
        System.out.println("testy");
//        Author shevchenko = new Author();
//        shevchenko.setName("Taras");
//        shevchenko.setSurname("Shevchenko");
//
//        BookService bookService = (BookService) injector.getInstance(BookService.class);
//        Book kobzar = new Book();
//        kobzar.setAuthor(List.of(shevchenko));
//        bookService.create(kobzar);
//
//
//

    }
}
