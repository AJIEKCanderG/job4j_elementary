package ru.job4j.lambda;

import java.util.Objects;

public class Attachment {
    private final String names;
    private final int size;

    public Attachment(String name, int size) {
        this.names = name;
        this.size = size;
    }

    public String getName() {
        return names;
    }

    public int getSize() {
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Attachment attachment = (Attachment) o;
        return Objects.equals(names, attachment.names);
    }

    @Override
    public int hashCode() {
        return Objects.hash(names);
    }
}