package com.disl.starter.models.responses;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DefaultErrorResponse {
    private Integer status;
    private String timestamp;
    private String error;
    private String message;
    private String trace;
    private String path;

}
