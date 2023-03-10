package ir.kalateh.springdatajpaintroduction.repository;

import ir.kalateh.springdatajpaintroduction.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
