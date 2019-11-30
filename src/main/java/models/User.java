package models;

public class User {
    private Integer id;
    private String name;
    private String password;
    private Integer age;

    public User() {
    }
    public User(String name, String password, Integer age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }
    public User(Integer id, String name, String password, Integer age) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPass() {
        return password;
    }
    public void setPass(String password) {
        this.password = password;
    }
}