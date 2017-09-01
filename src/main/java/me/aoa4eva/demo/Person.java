package me.aoa4eva.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Person {

    @Id
    @GeneratedValue
    long id;

    String name;

    @OneToMany()
    Set<Education> eduList;


    public Person()
    {
        eduList = new HashSet<>();
    }

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

    public Set<Education> getEduList() {
        return eduList;
    }

    public void setEduList(Set<Education> eduList) {
        this.eduList = eduList;
    }

    public void addEdu(Education edu)
    {
        eduList.add(edu);
    }
}
