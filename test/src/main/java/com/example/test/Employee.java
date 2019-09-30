package com.example.test;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_EMPTY) 
public class Employee {
	
	@JsonProperty("country_code")
    private String countryCode;
	/**
	 * Represents language code of customer
	 */
    @JsonProperty("language_code")
    private String languageCode;
    public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getLanguageCode() {
		return languageCode;
	}
	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}
	public String getEntityId() {
		return entityId;
	}
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}
	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	/**
     * Represents entity id of customer
     */
    @JsonProperty("entity_id")
    private String entityId;
    /**
     * Represents prefix of customer
     */
    @JsonProperty("prefix")
    private String prefix;

}
