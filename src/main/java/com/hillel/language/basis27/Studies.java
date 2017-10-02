package com.hillel.language.basis27;


import com.google.common.base.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "Studies")
@Table(name = "Studies")
public class Studies {

    @Id
    @Column(name = "student_id")
    private Integer id;

    @Column
    private Integer programming;

    @Column
    private Integer math;

    @Column
    private Integer physics;

    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMath() {
        return math;
    }

    public void setMath(Integer math) {
        this.math = math;
    }

    public Integer getPhysics() {
        return physics;
    }

    public void setPhysics(Integer physics) {
        this.physics = physics;
    }

    public Integer getProgramming() {
        return programming;
    }

    public void setProgramming(Integer programming) {
        this.programming = programming;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Studies{");
        sb.append("id=").append(id);
        sb.append(", programming=").append(programming);
        sb.append(", math=").append(math);
        sb.append(", physics=").append(physics);
        sb.append('}');
        return sb.toString();
    }
}
