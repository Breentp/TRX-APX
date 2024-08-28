package com.bbva.mzic.dto.project;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * The ExampleDTO class...
 */
public class ExampleDTO implements Serializable  {
	private static final long serialVersionUID = 2931699728946643245L;

	private String lastName;
	private String email;
	private String phone;
	private String firstName;


	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(final String phone) {
		this.phone = phone;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	
	@Override
	public boolean equals(final Object obj) {
		if (obj == null) { return false; }
		if (obj == this) { return true; }
		if (obj.getClass() != getClass()) {
			return false;
		}
		final ExampleDTO rhs = (ExampleDTO) obj;
		return new EqualsBuilder().appendSuper(super.equals(obj))
					.append(lastName, rhs.lastName)
					.append(email, rhs.email)
					.append(phone, rhs.phone)
					.append(firstName, rhs.firstName)
					.isEquals();
	}

	
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(this.lastName)
			.append(this.email)
			.append(this.phone)
			.append(this.firstName)
			.toHashCode();
	}

	
	
	@Override
	public String toString() {
		return new ToStringBuilder(this)
			.append("lastname", lastName)
			.append("email", email)
			.append("phone", phone)
			.append("firstName", firstName)
			.toString();
	}
}