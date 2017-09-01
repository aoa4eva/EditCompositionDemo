package me.aoa4eva.demo;

import javax.persistence.*;

@Entity
public class Education {

    @Id
    @GeneratedValue
    long id;

    String name;

    @ManyToOne()
    Person p;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getP() {
        return p;
    }

    public void setP(Person p) {
        this.p = p;
    }
}
