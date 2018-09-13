package tech.valery.partnersrestservices.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String username;

    @NotNull
    @Column(unique=true)
    private String login;

    @NotNull
    private String password;

    private BigDecimal balance;

    private boolean status;

    public Long getId() {
        return id;
    }

    public Customer() {
        balance = BigDecimal.ZERO;
    }

    public Customer(String username, String login, String password, BigDecimal balance, boolean status) {
        this.username = username;
        this.login = login;
        this.password = password;
        this.balance = balance;
        this.status = status;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
