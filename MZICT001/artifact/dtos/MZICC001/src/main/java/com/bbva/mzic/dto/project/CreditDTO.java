public class CreditDTO {
    
    private Long id;
    private String desCredit;

    public Long getId() {
        return this.id;
    }

    public Long setId(final Long id) {
        this.id = id;
    }

    public String getDesCredit() {
        return this.desCredit;
    }

    public String setDesCredit(final String desCredit) {
        this.desCredit = desCredit;
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
                    .append(id, rhs.id)
					.append(desCredit, rhs.desCredit)
					.isEquals();
	}

	
    
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
            .append(this.id)
			.append(this.desCredit)
			.toHashCode();
	}

	
    
	@Override
	public String toString() {
		return new ToStringBuilder(this)
            .append("id", id)
			.append("desCredit", desCredit)
			.toString();
}
