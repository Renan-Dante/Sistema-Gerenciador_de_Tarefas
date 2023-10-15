package br.com.renandante.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tb_users")
public class UserModel {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    //@Column(name = "userName") - Mudar nome do atributo na coluna da tabela do banco de dados
    @Column(unique = true)
    private String userName;
    private String name;
    private String password;

    @CreationTimestamp
    private LocalDateTime createdAt;

    // //Getters and Setters -> LOMBOK
    // public void setUserName(String userName) {
    //     this.userName = userName;
    // }

    // public String getUserName() {
    //     return userName;
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }

    // public String getName() {
    //     return name;
    // }

    // public void setPassword(String password) {
    //     this.password = password;
    // }

    // public String getPassword() {
    //     return password;
    // }
}
