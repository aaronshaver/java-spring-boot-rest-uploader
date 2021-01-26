package com.example.documents;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
public class DocumentController {

    private final DocumentRepository documentRepository;

    DocumentController(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/documents")
    List<Document> all() {
        return documentRepository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/documents")
    Document newDocument(@RequestBody Document newDocument) {
        return documentRepository.save(newDocument);
    }

    //one record
    @GetMapping("documents/{id}")
    Document one(@PathVariable Long id) {
        return documentRepository.findById(id)
                .orElseThrow(() -> new DocumentNotFoundException(id));
    }

    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello, world!";
    }
}
