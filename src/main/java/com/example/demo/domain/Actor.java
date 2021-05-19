package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.example.demo.transfer.KeyValue;
import lombok.*;

import javax.persistence.*;




@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "Actors")
@SequenceGenerator(name = "idGenerator", sequenceName = "ACTORS_SEQ", initialValue = 1, allocationSize = 1)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Actor extends com.example.demo.domain.BaseEntity {

	@Column(length = 50, nullable = false, unique = true)
	private String email;


	@Column(length = 20, nullable = false)
	private String firstname;


	@Column(length = 30, nullable = false)
	private String lastname;

	private Integer age;

	@Column(length = 50)
	private String address;


}
