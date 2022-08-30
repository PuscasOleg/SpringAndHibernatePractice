package com.message.spring.domain;

import javax.persistence.*;
import java.util.Set;

@Entity // класс как сущность или другими словами Entity говорит о том, что поля класса имеют отображение в БД
@Table(name = "usr") // set a custom table name
public class User {
    @Id // column id
    @GeneratedValue(strategy = GenerationType.AUTO) //GenerationType.AUTO параметр AUTO значит, что генерацией id будет заниматься БД.hibernate сам выберет из одну вышеописанных стратегий
    private Long id;
    private String username;
    private String password;
    private boolean active;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    @ElementCollection(targetClass = Role.class,fetch =FetchType.EAGER) // @ElementCollection предназначен для отображения не-сущностей (встраиваемых или базовых)
    @CollectionTable(name = "user_role",joinColumns = @JoinColumn(name = "user_id"))
    @Enumerated(EnumType.STRING)
    private Set<Role> roles;

}
