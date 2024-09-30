package dev.majeed.contentcalendar.model;

import dev.majeed.contentcalendar.model.enums.Status;
import dev.majeed.contentcalendar.model.enums.Type;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;
import java.util.Optional;

@Table(value = "tbl_content")
public record Content(
        @Id
        Integer id,
        @NotBlank
        String title,
        String desc,
        Status status,
        Type contentType,
        LocalDateTime createdAt,
        Optional<LocalDateTime> updatedAt,
        @Email
        String url
) {
}
