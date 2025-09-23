package com.disl.starter.models.responses;

import lombok.Getter;
import lombok.Setter;

import javax.xml.crypto.Data;
import java.util.Date;

@Getter
@Setter
public class ApplicationLog {
	private String fileName;
	private Date lastModified;
	private String fileSize;

}