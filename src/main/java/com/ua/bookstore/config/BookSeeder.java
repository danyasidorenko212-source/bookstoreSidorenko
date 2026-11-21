package com.ua.bookstore.config;

import com.ua.bookstore.domain.Book;
import com.ua.bookstore.repository.BookRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BookSeeder implements ApplicationRunner {
    private final BookRepository repository;

    public BookSeeder(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(ApplicationArguments args) {
        repository.save(new Book(null, "Кобзар", "Тарас Шевченко", new BigDecimal("250.00"), 1840,
                "/covers/kobzar.jpg", "Збірка поезій, що стала символом української літератури.", "Поезія"));
        repository.save(new Book(null, "Тіні забутих предків", "Михайло Коцюбинський", new BigDecimal("320.00"), 1911,
                "/covers/tyni.jpg", "Повість про кохання Івана й Марічки на тлі гуцульських традицій.", "Повість"));
        repository.save(new Book(null, "Лісова пісня", "Леся Українка", new BigDecimal("280.00"), 1911,
                "/covers/lisova-pisnia.jpg", "Драма-феєрія про Мавку, Лукаша та світ природи.", "Драма"));
        repository.save(new Book(null, "Місто", "Валер'ян Підмогильний", new BigDecimal("390.00"), 1928,
                "/covers/misto.jpg", "Роман про становлення Степана Радченка у великому місті.", "Роман"));
        repository.save(new Book(null, "Захар Беркут", "Іван Франко", new BigDecimal("300.00"), 1883,
                "/covers/zahar-berkut.jpg", "Історична повість про громаду Тухлі та її боротьбу за свободу.", "Історична повість"));
    }
}
