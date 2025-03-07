package com.lizzy.collection.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Contents {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false)
	private String contentType;

	@Column(nullable = false)
	private String title;

	@Column(nullable = false)
	private int viewCount;

	@Column(nullable = false)
	private String description;

	@Column
	private String url;

	@Column(nullable = false)
	private double rating;

	@Column(nullable = false)
	private String status;
}
