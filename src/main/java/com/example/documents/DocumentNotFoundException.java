package com.example.documents;

public class DocumentNotFoundException extends RuntimeException {

    DocumentNotFoundException(Long id) {
        super("Could not find document " + id);
    }
}
