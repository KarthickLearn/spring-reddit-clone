package com.programming.techie.springredditclone.dto;

import com.fasterxml.jackson.annotation.JsonView;
import com.programming.techie.springredditclone.controller.View;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentsDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long postId;
    @JsonView(View.Base.class)
    private Instant createdDate;
    @JsonView(View.Base.class)
    @NotBlank
    private String text;
    @JsonView(View.Base.class)
    private String userName;
}
