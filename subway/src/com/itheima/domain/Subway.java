package com.itheima.domain;

import java.util.Objects;

public class Subway {
    private String id;
    private String name;
    private String line;


    public Subway() {
    }

    public Subway(String id, String name, String line) {
        this.id = id;
        this.name = name;
        this.line = line;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subway subway = (Subway) o;
        return Objects.equals(id, subway.id) &&
                Objects.equals(name, subway.name) &&
                Objects.equals(line, subway.line);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, line);
    }

    @Override
    public String toString() {
        return "Subway{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", line='" + line + '\'' +
                '}';
    }
}
