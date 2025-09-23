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

//    public PaginationArgs(
//            int pageNo, int pageSize, String sortBy,
//            AscOrDescType ascOrDesc, Map<String, Object> parameters
//    ) {
//        this.pageNo = pageNo;
//        this.pageSize = pageSize;
//        this.sortBy = sortBy;
//        this.ascOrDesc = ascOrDesc;
//        this.parameters = parameters;
//    }
//
//    public int getPageNo() {
//        return pageNo;
//    }
//
//    public void setPageNo(int pageNo) {
//        this.pageNo = pageNo;
//    }
//
//    public int getPageSize() {
//        return pageSize;
//    }
//
//    public void setPageSize(int pageSize) {
//        this.pageSize = pageSize;
//    }
//
//    public String getSortBy() {
//        return sortBy;
//    }
//
//    public void setSortBy(String sortBy) {
//        this.sortBy = sortBy;
//    }
//
//    public AscOrDescType getAscOrDesc() {
//        return ascOrDesc;
//    }
//
//    public void setAscOrDesc(AscOrDescType ascOrDesc) {
//        this.ascOrDesc = ascOrDesc;
//    }
//
//    public Map<String, Object> getParameters() {
//        return parameters;
//    }
//
//    public void setParameters(Map<String, Object> parameters) {
//        this.parameters = parameters;
//    }
}
