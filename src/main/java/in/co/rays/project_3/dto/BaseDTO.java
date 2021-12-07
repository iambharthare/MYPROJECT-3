package in.co.rays.project_3.dto;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


/**
 * Parent class of all Dto in application. It contains generic attributes.
 * @author ShubHam
 *
 */

public abstract class BaseDTO implements Serializable,Comparable<BaseDTO>,DropdownList {

protected Long id;
protected String createdBy;
protected String modifiedBy;
protected Timestamp createdDatetime;
protected Timestamp modifiedDatetime;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getCreatedBy() {
	return createdBy;
}
public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
}
public String getModifiedBy() {
	return modifiedBy;
}
public void setModifiedBy(String modifiedBy) {
	this.modifiedBy = modifiedBy;
}
public Timestamp getCreatedDatetime() {
	return createdDatetime;
}
public void setCreatedDatetime(Timestamp createdDatetime) {
	this.createdDatetime = createdDatetime;
}
public Timestamp getModifiedDatetime() {
	return modifiedDatetime;
}
public void setModifiedDatetime(Timestamp modifiedDatetime) {
	this.modifiedDatetime = modifiedDatetime;
}
public int compareTo(BaseDTO next) {
    return getValue().compareTo(next.getValue());
}
}