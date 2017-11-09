package com.instinctools.padlaboris.model;

import lombok.Data;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import java.util.Objects;

/**
 * Entity which details the Procedure.
 */
@Entity
@Data
@Table(name = "procedure")

public class Procedure implements Persistable<Integer>
{

    private static final long serialVersionUID = -4702349964151853393L;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "procedure_id")
    private Integer id;

    @Column (name = "procedureName")
    private String procedureName;

    @Column (name = "procedureCode")
    private String procedureCode;

    @Column (name = "procedureDescription")
    private String procedureDescription;

    @Column (name = "procedureClass")
    private String procedureClass;

    @Override
    public boolean isNew() {
        return Objects.nonNull(id);
    }
}

