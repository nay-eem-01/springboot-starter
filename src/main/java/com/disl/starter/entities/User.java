package com.disl.starter.entities;

import com.disl.starter.constants.AppTables;
import com.disl.starter.constants.AppTables.UserTable;
import com.disl.starter.models.AuditModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = AppTables.USER_NAME)
@Getter
@Setter
public class User extends AuditModel<String> {

	@Column(name = UserTable.EMAIL, nullable = false, unique = true)
	private String email;

	@Column(name = UserTable.password)
	@JsonIgnore
	@Size(max = 120)
	private String password;

	@Column(name = UserTable.PASSWORD_RESET_TOKEN)
	private String passwordResetToken;

	@Column(name = UserTable.NAME)
	private String name;

	@Column (name = UserTable.VERIFIED)
	private Boolean verified = false;

	@Column (name = UserTable.BANNED)
	private Boolean banned = false;

	@JoinTable(
		name = AppTables.USER_ROLE_NAME,
		joinColumns = @JoinColumn(name = UserTable.USER_ID),
		inverseJoinColumns = @JoinColumn(name = UserTable.ROLE_ID)
	)
	@ManyToMany(fetch = FetchType.EAGER)
	private Set<Role> roles = new HashSet<>();

}