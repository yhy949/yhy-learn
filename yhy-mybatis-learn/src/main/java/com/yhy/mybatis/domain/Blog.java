package com.yhy.mybatis.domain;

import java.util.List;

/**
 * @author : yhy
 * @since ： 2018/1/20
 */
public class Blog {

    private Long id;
    private String name;
    private Author author;
    private List<Tar> tars;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<Tar> getTar() {
        return tars;
    }

    public void setTar(List<Tar> tars) {
        this.tars = tars;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author=" + author +
                ", tar=" + tars +
                '}';
    }
}
