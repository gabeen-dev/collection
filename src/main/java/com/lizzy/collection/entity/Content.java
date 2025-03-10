package com.lizzy.collection.entity;

import com.lizzy.collection.entity.common.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Content extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int contentId;

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
