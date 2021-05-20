package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.example.demo.transfer.KeyValue;
import lombok.*;

import javax.persistence.*;




@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "Movies")
@SequenceGenerator(name = "idGenerator", sequenceName = "MOVIES_SEQ", initialValue = 1, allocationSize = 1)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Movie extends com.example.demo.domain.BaseEntity {

    @Column(length = 50, nullable = false, unique = false)
    private String typeofdmovie;


    @Column(length = 20, nullable = false)
    private String title;


    @Column(length = 30, nullable = false)
    private String productionstudio;




}
