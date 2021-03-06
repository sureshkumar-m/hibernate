package com.family.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "mother", schema = "family")
public class Mother {

	@Id
	@GeneratedValue(generator = "PrimaryKeyJoinColumnGenerator")
	@GenericGenerator(name = "PrimaryKeyJoinColumnGenerator", strategy = "foreign", parameters = @Parameter(value = "father", name = "property"))
	private long id;

	@Column
	private String mName;

	@OneToOne(mappedBy = "mother", cascade = CascadeType.ALL)
	private Father father;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public Father getFather() {
		return father;
	}

	public void setFather(Father father) {
		this.father = father;
	}

}
