package com.lizzy.collection.entity;

import com.lizzy.collection.entity.common.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
public class Plan extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int planId;

	@Column(nullable = false)
	private String type;

	@Column
	private String description;

	@Column(nullable = false)
	private int price;

	@Column(nullable = false)
	private LocalDateTime renewalDate;

	@Column
	private String status;
}
