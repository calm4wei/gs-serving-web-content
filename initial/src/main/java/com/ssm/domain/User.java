package com.ssm.domain;

/**
 * Created on 2016/6/22
 *
 * @author feng.wei
 */
public class User {

    private String id;
    private String name;
    private Integer age;
    private String sex;
    private String nation;

    public User() {
    }

    public User(String id, String name, Integer age, String sex, String nation) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.nation = nation;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", nation='" + nation + '\'' +
                '}';
    }
}