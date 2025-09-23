package com.disl.starter.entities;

import com.disl.starter.constants.AppTables;
import com.disl.starter.constants.AppTables.PrivilegeTable;
import com.disl.starter.models.AuditModel;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = AppTables.PRIVILEGE_NAME)
@Getter
@Setter
public class Privilege extends AuditModel<String> {

	@Column(name = PrivilegeTable.NAME)
	private String name;
	
	@Column(name = PrivilegeTable.DESC_NAME)
	private String descName;
}
