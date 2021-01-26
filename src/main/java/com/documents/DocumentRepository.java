package com.documents;

import org.springframework.data.jpa.repository.JpaRepository;

interface DocumentRepository extends JpaRepository<Document, Long> {
}
