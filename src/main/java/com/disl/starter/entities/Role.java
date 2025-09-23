package com.disl.starter.entities;

import com.disl.starter.constants.AppTables;
import com.disl.starter.constants.AppTables.RoleTable;
import com.disl.starter.enums.RoleType;
import com.disl.starter.models.AuditModel;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;

@Entity
@Table(name = AppTables.ROLE_NAME)
@Getter
@Setter
public class Role extends AuditModel<String> {

	@Column(name = RoleTable.ROLE_NAME)
	private String roleName;

	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
	@JoinTable(
			name = AppTables.ROLE_PRIVILEGE_NAME,
			joinColumns = @JoinColumn(name = RoleTable.ROLE_ID),
			inverseJoinColumns = @JoinColumn(name = RoleTable.PRIVILEGE_ID)
	)
	private Collection<Privilege> privileges;

	@Column(name = RoleTable.ROLE_TYPE)
	@Enumerated(EnumType.STRING)
	private RoleType roleType;

	@Column(name = RoleTable.DESCRIPTION, columnDefinition="TEXT")
	private String description;

	@Column(name = RoleTable.IMAGE_URL)
	private String imageUrl;
}
