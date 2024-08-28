package com.bbva.mzic;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.mzic.dto.projecto.CostumerDTO;
import com.bbva.mzic.dto.projecto.LetterDTO;

/**
 * In this class, the input and output data is defined automatically through the setters and getters.
 */
public abstract class AbstractMZICT00101MXTransaction extends AbstractTransaction {

	public AbstractMZICT00101MXTransaction(){
	}


	/**
	 * Return value for input parameter String
	 */
	protected String getString(){
		return (String)this.getParameter("String");
	}

	/**
	 * Return value for input parameter CostumerDTO
	 */
	protected CostumerDTO getCostumerdto(){
		return (CostumerDTO)this.getParameter("CostumerDTO");
	}

	/**
	 * Set value for LetterDTO output parameter LetterDTO
	 */
	protected void setLetterdto(final LetterDTO field){
		this.addParameter("LetterDTO", field);
	}
}
