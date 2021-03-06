package br.com.homecare.model.surveyform;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import br.com.homecare.model.survey.Type;

public class FieldResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String label;

	private Type type;

	private List<String> options = new ArrayList<String>();

	private List<FieldResponse> fields;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public List<String> getOptions() {
		return options;
	}

	public void setOptions(List<String> options) {
		this.options = options;
	}

	public List<FieldResponse> getFields() {
		return fields;
	}

	public void setFields(List<FieldResponse> fields) {
		this.fields = fields;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof FieldResponse) {
			FieldResponse field = (FieldResponse) obj;
			return Objects.equals(id, field.getId());
		}
		return false;
	}
}
