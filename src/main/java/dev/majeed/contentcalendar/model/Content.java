package dev.majeed.contentcalendar.model;

import dev.majeed.contentcalendar.model.enums.Status;
import dev.majeed.contentcalendar.model.enums.Type;

import java.time.LocalDateTime;

public record Content(
        Integer id,
        String title,
        String desc,
        Status status,
        Type contentType,
        LocalDateTime createdAt,
        LocalDateTime updatedAt,
        String url
) {
}
