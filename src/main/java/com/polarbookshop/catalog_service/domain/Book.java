package com.polarbookshop.catalog_service.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;

public record Book(

        @NotBlank(message = "The book ISBN must be define.")
        @Pattern(
                regexp = "^([0-9]{10}|[0-9]{13})$",
                message = "The ISBN format must be valid."
        )
        String isbn,
        @NotBlank(
                message = "The book title must be defined."
        )
        String title,
        @NotBlank(
                message = "The book author must be defined."
        )
        String author,
        @NotNull(message = "The book price must be defined.")
        @Positive(message = "The boot price must be greater than zero.")
        Double price
) {
}
