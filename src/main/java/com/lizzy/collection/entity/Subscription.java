package com.lizzy.collection.entity;

import com.lizzy.collection.entity.common.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
public class Subscription extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int subscriptionId;

	@Column(nullable = false)
	private LocalDateTime endDate;
}
