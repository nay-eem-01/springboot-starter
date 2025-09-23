package com.disl.starter.models.requests;

import com.disl.starter.enums.RoleType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoleCreateRequest {

	private String roleName;
	private long[] previlegeId;
	private RoleType roleType;
	private String description;

}
