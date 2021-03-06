package com.rest.mutants.utils;

import java.util.Arrays;
import java.util.List;


public class DNASequence {
	private String[] dna;

	public String[] getDna() {
		return dna;
	}

	public void setDna(String[] dna) {
		this.dna = dna;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
	      return true;
	    if (!(o instanceof DNASequence))
	      return false;
	    DNASequence sequence = (DNASequence) o;
	    
	    return Arrays.equals(this.getDna(), sequence.getDna());
	}
	
	@Override
	public String toString() {
		List<String> list = Arrays.asList(dna);
		
		String dnaSequence = "";
		
		for(String element: list)
			dnaSequence += element+ "|";
		
		return dnaSequence;
	}
	  	
}
