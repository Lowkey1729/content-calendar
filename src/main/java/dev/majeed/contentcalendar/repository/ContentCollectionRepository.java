package dev.majeed.contentcalendar.repository;

import dev.majeed.contentcalendar.model.Content;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {
//    Keep a collection of pieces of content in memory so that we can work with them in our application
    private final List<Content> content = new ArrayList<>();

    public ContentCollectionRepository() {}

    public List<Content> findAll() {
        return content;
    }

    public Optional<Content> findById(Integer id) {
        return content.stream().filter(c -> c.id().equals(id)).findFirst();
    }

}
