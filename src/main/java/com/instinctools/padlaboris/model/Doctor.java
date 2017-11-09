package com.instinctools.padlaboris.model;

import lombok.Data;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import java.util.Objects;

/**
 * Entity which details the Doctor.
 */
@Entity
@Data
@Table(name = "doctor")

public class Doctor implements Persistable<Integer>{

    private static final long serialVersionUID = 8633679029764964434L;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "doctor_id")
    private Integer id;

    @Column (name = "firstName")
    private String firstName;

    @Column (name = "lastName")
    private String lastName;

    @Column (name = "department")
    private String department;

    @Column (name = "position")
    private Integer position;

    @Override
    public boolean isNew() {
        return Objects.nonNull(id);
    }

    /*
    @OneToOne(mappedBy = "md")
    private MedicalLeave medicalLeave;

    @OneToOne(mappedBy = "md")
    private Recipe recipe;
    */
}

