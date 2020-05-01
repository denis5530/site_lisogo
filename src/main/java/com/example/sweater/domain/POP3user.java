package com.example.sweater.domain;

import javax.persistence.*;

@Entity
public class POP3user {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String login;
    private String password;
    private String smtp;
    private String smtpPort;
    private String pop3;
    private String pop3Port;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User author;



    public POP3user() {
    }

    public POP3user(String login, String password, String smtp, String smtpPort, String pop3, String pop3Port, User author) {
        this.login = login;
        this.password = password;
        this.smtp = smtp;
        this.smtpPort = smtpPort;
        this.pop3 = pop3;
        this.pop3Port = pop3Port;
        this.author = author;
    }

    public String getAuthorName() {
        return author != null ? author.getUsername() : "<none>";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getSmtp() {
        return smtp;
    }

    public void setSmtp(String smtp) {
        this.smtp = smtp;
    }

    public String getSmtpPort() {
        return smtpPort;
    }

    public void setSmtpPort(String smtpPort) {
        this.smtpPort = smtpPort;
    }

    public String getPop3() {
        return pop3;
    }

    public void setPop3(String pop3) {
        this.pop3 = pop3;
    }

    public String getPop3Port() {
        return pop3Port;
    }

    public void setPop3Port(String pop3Port) {
        this.pop3Port = pop3Port;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }


}
