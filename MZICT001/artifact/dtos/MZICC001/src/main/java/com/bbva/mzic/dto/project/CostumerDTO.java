public class CostumerDTO {
    
    private Long id;
    private Sting name;

    public Long getId() {
        return this.id;
    }

    public Long setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public String setName(final long name) {
        this.name = name;
    }


    @Override
	public boolean equals(final Object obj) {
		if (obj == null) { return false; }
		if (obj == this) { return true; }
		if (obj.getClass() != getClass()) {
			return false;
		}
		final CostumerDTO rhs = (CostumerDTO) obj;
		return new EqualsBuilder().appendSuper(super.equals(obj))
					.append(id, rhs.id)
					.append(name, rhs.name)
					.isEquals();
	}

	
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(this.id)
			.append(this.name)
			.toHashCode();
	}


	@Override
	public String toString() {
		return new ToStringBuilder(this)
			.append("id", id)
			.append("name", name)
			.toString();
	}

}
