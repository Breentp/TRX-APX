public class LetterDTO {
    
    private String description;
    private Long id;
    private String creditDtO;
    
    public String getDescription() {
        return this.description;
    }

    public String setDescription(final String description) {
        this.description = description;
    }

    public Long getId() {
        return this.id;
    }

    public Long setId(final Long id) {
        this.id = id;
    }

    public String getCreditDto() {
        return this.creditDtO;
    }

    public String setCreditDto(final String creditDtO) {
        this.creditDtO = creditDtO;
    }


    @Override
	public boolean equals(final Object obj) {
		if (obj == null) { return false; }
		if (obj == this) { return true; }
		if (obj.getClass() != getClass()) {
			return false;
		}
		final LetterDTO rhs = (LetterDTO) obj;
		return new EqualsBuilder().appendSuper(super.equals(obj))
					.append(description, rhs.description)
                    .append(id, rhs.id)
					.append(creditDto, rhs.creditDto)
					.isEquals();
	}

	
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(this.description)
            .append(this.id)
			.append(this.creditDtO)
			.toHashCode();
	}

    
	@Override
	public String toString() {
		return new ToStringBuilder(this)
			.append("description", description)
            .append("id", id)
			.append("creditDto", creditDtO)
			.toString();
	}
}
