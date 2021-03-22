package com.proximity.app.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
public class Tag  {
    private String name;
    private List<Content> contents;

    public Tag() {
        this.contents = new ArrayList<>();
    }

    public Tag(String name) {
        this.name = name;
        this.contents = new ArrayList<>();
    }

    public void add(Content content) {
        this.contents.add(content);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tag tag = (Tag) o;
        return Objects.equals(name, tag.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
