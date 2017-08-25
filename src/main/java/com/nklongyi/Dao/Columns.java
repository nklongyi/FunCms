package com.nklongyi.Dao;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * 文章分类
 * Created by longyi on 2017/8/24.
 */


@Entity
@Table(name = "Columns")
public class Columns implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false,name = "name")
    private String name;//栏目名称

    @Column(nullable = false,name = "intro")
    private String intro;//栏目介绍

    @OneToMany(mappedBy = "columns")
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Article> articles = new HashSet<Article>();//栏目关联的文章

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Set<Article> getArticles() {
        return articles;
    }

    public void setArticles(Set<Article> articles) {
        this.articles = articles;
    }
}
