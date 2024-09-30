package dev.majeed.contentcalendar.repository;

import dev.majeed.contentcalendar.model.Content;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.Repository;

public interface ContentRepository extends ListCrudRepository<Content, Integer> {

}
