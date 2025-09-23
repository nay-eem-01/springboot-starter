package com.disl.starter.models;


import com.disl.starter.enums.AscOrDescType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class PaginationArgs {

    private int pageNo;
    private int pageSize;
    private String sortBy;
    private AscOrDescType ascOrDesc;
    private Map<String, Object> parameters;

    public PaginationArgs(
            int pageNo, int pageSize,
            String sortBy, AscOrDescType ascOrDesc
    ) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.sortBy = sortBy;
        this.ascOrDesc = ascOrDesc;
    }

}
