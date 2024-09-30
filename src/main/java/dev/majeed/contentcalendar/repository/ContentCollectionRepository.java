package dev.majeed.contentcalendar.repository;

import dev.majeed.contentcalendar.model.Content;
import dev.majeed.contentcalendar.model.enums.Status;
import dev.majeed.contentcalendar.model.enums.Type;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {
//    Keep a collection of pieces of content in memory so that we can work with them in our application
    private final List<Content> contents = new ArrayList<>();

    public ContentCollectionRepository() {}

    public List<Content> findAll() {
        return contents;
    }

    public Optional<Content> findById(Integer id) {
        return contents.stream().filter(c -> c.id().equals(id)).findFirst();
    }

    public void save(Content content) {
        contents.add(content);
    }

    @PostConstruct
    private void init() {
        Content c = new Content(
                1,
                "My first blog post",
                "My first blog post",
                Status.IDEA,
                Type.ARTICLE,
                LocalDateTime.now(),
                null,
                ""
        );

        contents.add(c);
    }


    public boolean existsById(Integer id) {
        return contents.stream().filter(c -> c.id().equals(id)).count() == 1;
    }

    public void delete(Integer id) {
        contents.removeIf(c -> c.id().equals(id));
    }
}
