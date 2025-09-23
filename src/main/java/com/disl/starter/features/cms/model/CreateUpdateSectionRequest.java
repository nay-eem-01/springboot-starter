package com.disl.starter.features.cms.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUpdateSectionRequest {

    @NotBlank
    private String title;

    private long id;
    private String description;
    private String content;
    private String externalLink;
    private Long imageFileId;
    private boolean active;
}
