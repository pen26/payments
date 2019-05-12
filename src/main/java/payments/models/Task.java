package payments.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

//mapowanie klasy do bazy danych
@Entity
@Table
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String custcontent;

    @Column(columnDefinition = "TEXT")
    private String emcontent;

    @Column
    private String employee;

    /*@Column(nullable = false)
    private Boolean done;*/

    @Column(nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime begdateTime;

    @Column
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime clodateTime;

    public Task() {
    }

    public Task(@NotNull String title, String custcontent, String emcontent, String employee, @NotNull LocalDateTime begdateTime, LocalDateTime clodateTime) {
        this.title = title;
        this.custcontent = custcontent;
        this.emcontent = emcontent;
        this.employee = employee;
        this.clodateTime = clodateTime;
        this.begdateTime = begdateTime;
    }

   /* public Task(@NotNull String title, String custcontent, String emcontent, String employee, Boolean done, @NotNull LocalDateTime begdateTime, @NotNull LocalDateTime clodateTime) {
        this.title = title;
        this.custcontent = custcontent;
        this.emcontent = emcontent;
        this.employee = employee;
        this.done = done;
        this.begdateTime = begdateTime;
        this.clodateTime = clodateTime;
    }*/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCustcontent() {
        return custcontent;
    }

    public void setCustcontent(String custcontent) {
        this.custcontent = custcontent;
    }

    public String getEmcontent() {
        return emcontent;
    }

    public void setEmcontent(String emcontent) {
        this.emcontent = emcontent;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    /*public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }*/

    public LocalDateTime getBegdateTime() {
        return begdateTime;
    }

    public void setBegdateTimeout(LocalDateTime begdateTime) {
        this.begdateTime = begdateTime;
    }

    public LocalDateTime getClodateTime() {
        return clodateTime;
    }

    public void setClodateTime(LocalDateTime clodateTime) {
        this.clodateTime = clodateTime;
    }
}