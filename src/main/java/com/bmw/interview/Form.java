package com.bmw.interview;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

public class Form {

    @Schema(hidden = true)
    private id;

    private name;

    private email;

    private birthday;

    private status;

    // Code required here.
}
