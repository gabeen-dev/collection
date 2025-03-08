package com.lizzy.collection.entity;

import com.lizzy.collection.entity.common.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Users extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false)
	private String email;

	@Column
	private String password;

	@Column
	private String name;

	@Column(nullable = false)
	private String role;

	@Column(nullable = false)
	private String status;
}
