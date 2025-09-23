package com.disl.starter.features.cms.dto;

import com.disl.starter.features.cms.entity.Page;
import com.disl.starter.features.cms.entity.Section;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class PageDto extends Page {

    private List<Section> sections = new ArrayList<>();

//    public List<Section> getSections() {
//        return sections;
//    }
//
//    public void setSections(List<Section> sections) {
//        this.sections = sections;
//    }
}
