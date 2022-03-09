package ru.avbugorov.architecturesandpatterns.dto;

public class UserDto {
    Long id;
    String name;
    String password;

    public UserDto(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public UserDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public UserDto() {
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
