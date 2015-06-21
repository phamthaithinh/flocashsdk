package com.flocash.sdk.models;

import java.io.Serializable;
import java.util.List;

public class AdditionInfo implements Serializable{
	private List<CustomField> fields;

	public List<CustomField> getFields() {
		return fields;
	}

	public void setFields(List<CustomField> fields) {
		this.fields = fields;
	}

}
