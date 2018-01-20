package com.yhy.mybatis.domain;

/**
 * @author : yhy
 * @since ： 2018/1/20
 */
public class Tar {
    private Long id;
    private String name;

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

    @Override
    public String toString() {
        return "Tar{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

