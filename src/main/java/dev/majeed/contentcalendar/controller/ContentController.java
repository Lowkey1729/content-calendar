package dev.majeed.contentcalendar.controller;

import dev.majeed.contentcalendar.model.Content;
import dev.majeed.contentcalendar.repository.ContentRepository;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/contents")
public class ContentController {

    private final ContentRepository repository;

    public ContentController(ContentRepository contentCollectionRepository) {
        this.repository = contentCollectionRepository;
    }

    @GetMapping("")
    public List<Content> findAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Content> findById(@PathVariable Integer id) {
        return repository.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/create")
    public void create(@Valid @RequestBody Content content) {
        repository.save(content);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/update/{id}")
    public void update(@RequestBody Content content, @PathVariable Integer id) {
        if (! repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NO_CONTENT, "Content not found");
        }

        repository.save(content);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        if (! repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NO_CONTENT, "Content not found");
        }

        repository.deleteById(id);
    }
}
