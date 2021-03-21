package com.proximity.app.model;

import lombok.Data;

import java.util.List;
import java.util.Objects;

@Data
public class Category extends Content {
    private String name;
    private CategoryType categoryType;
    private List<Media> media;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Category category = (Category) o;
        return Objects.equals(name, category.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }
}
