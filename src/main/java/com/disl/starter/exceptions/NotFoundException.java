package com.disl.starter.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotFoundException extends RuntimeException {
    private Class<?> className;

    public NotFoundException(Class<?> className) {
        this.className = className;
    }

//    public Class<?> getClassName() {
//        return className;
//    }
//
//    public void setClassName(Class<?> className) {
//        this.className = className;
//    }
}
