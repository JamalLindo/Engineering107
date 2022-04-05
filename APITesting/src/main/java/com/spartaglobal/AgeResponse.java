package com.spartaglobal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AgeResponse{

	@JsonProperty("name")
	private String name;

	@JsonProperty("count")
	private Integer count;

	@JsonProperty("age")
	private Integer age;

	@JsonProperty("country_id")
	private String countryId;

	public String getName(){
		return name;
	}

	public Integer getCount(){
		return count;
	}

	public Integer getAge(){
		return age;
	}

	public String getCountryId(){
		return countryId;
	}

	@Override
 	public String toString(){
		return 
			"AgeResponse{" + 
			"name = '" + name + '\'' + 
			",count = '" + count + '\'' + 
			",age = '" + age + '\'' + 
			",country_id = '" + countryId + '\'' + 
			"}";
		}
}