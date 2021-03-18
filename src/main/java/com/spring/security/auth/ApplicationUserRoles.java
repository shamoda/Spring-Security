package com.spring.security.auth;

import java.util.Set;

import com.google.common.collect.Sets;

import static com.spring.security.auth.ApplicationUserPermission.*;

public enum ApplicationUserRoles {
	
	STUDENT(Sets.newHashSet()),
	ADMIN(Sets.newHashSet(COURSE_READ, COURSE_WRITE, STUDENT_READ, STUDENT_WRITE));
	
	private final Set<ApplicationUserPermission> permissions;
	
	private ApplicationUserRoles(Set<ApplicationUserPermission> permissions) {
		this.permissions = permissions;
	}
	
	public Set<ApplicationUserPermission> getPermissions() {
		return permissions;
	}

}
