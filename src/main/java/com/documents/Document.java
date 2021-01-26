package com.documents;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.print.Doc;
import java.util.Objects;

@Entity
public class Document {

    private @Id @GeneratedValue Long id;
    private String contents;

    Document() {}

    Document(String contents) {
        this.contents = contents;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Document))
            return false;
        Document document = (Document) o;
        return Objects.equals(this.id, document.id) && Objects.equals(this.contents, document.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.contents);
    }

    @Override
    public String toString() {
        return "Document{" + "id=" + this.id + ", contents='" + this.contents + '}';
    }

}
