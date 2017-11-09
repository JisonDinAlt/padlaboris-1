package com.instinctools.padlaboris.model;

import lombok.Data;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import java.util.Objects;

/**
 * Entity which details the Address.
 */
@Entity
@Data
@Table(name = "address")

public class Address implements Persistable<Integer>{

    private static final long serialVersionUID = 560577930848630334L;

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "address_id")
    private Integer id;

    @Column (name = "country")
    private String country;

    @Column (name = "region")
    private String region;

    @Column (name = "street")
    private String street;

    @Column (name = "house")
    private Integer house;

    @Column (name = "apartment")
    private Integer apartment;

    @Column (name = "postCode")
    private Integer postCode;

    @Override
    public boolean isNew() {
        return Objects.nonNull(id);
    }
}
