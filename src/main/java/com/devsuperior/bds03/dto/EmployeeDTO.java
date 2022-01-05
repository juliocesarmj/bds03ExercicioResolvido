package com.devsuperior.bds03.dto;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.devsuperior.bds03.entities.Employee;

public class EmployeeDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;

	@NotBlank(message = "Campo requerido")
	private String name;

	@Email(message = "Email inválido")
	private String email;

	@NotNull(message = "Campo requerido")
	private Long departmentId;

	public EmployeeDTO() {
	}

	public EmployeeDTO(final Long id, final String name, final String email, final Long departmentId) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.departmentId = departmentId;
	}

	public EmployeeDTO(final Employee entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.email = entity.getEmail();
		this.departmentId = entity.getDepartment().getId();
	}

	public Long getId() {
		return this.id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public Long getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(final Long departmentId) {
		this.departmentId = departmentId;
	}
}
