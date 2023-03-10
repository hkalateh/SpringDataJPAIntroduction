package ir.kalateh.springdatajpaintroduction.init;

import ir.kalateh.springdatajpaintroduction.domain.Book;
import ir.kalateh.springdatajpaintroduction.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final BookRepository bookRepository;

    public DataInitializer(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Book cc = Book.builder().title("clean code").isbn("123123").publisher("C martin").build();
        bookRepository.save(cc);

        Book ca = Book.builder().isbn("123127").title("clean architect").publisher("c martin").build();
        bookRepository.save(ca);

        bookRepository.findAll().forEach(book -> {
            System.out.println("book id : " + book.getId());
            System.out.println("book title : " + book.getTitle());
        });
    }
}
