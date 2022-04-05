package com.spartaglobal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BoredResponse{

	@JsonProperty("activity")
	private String activity;

	@JsonProperty("accessibility")
	private Integer accessibility;

	@JsonProperty("price")
	private Integer price;

	@JsonProperty("link")
	private String link;

	@JsonProperty("type")
	private String type;

	@JsonProperty("key")
	private String key;

	@JsonProperty("participants")
	private Integer participants;

	public String getActivity(){
		return activity;
	}

	public Integer getAccessibility(){
		return accessibility;
	}

	public Integer getPrice(){
		return price;
	}

	public String getLink(){
		return link;
	}

	public String getType(){
		return type;
	}

	public String getKey(){
		return key;
	}

	public Integer getParticipants(){
		return participants;
	}

	@Override
 	public String toString(){
		return 
			"BoredResponse{" + 
			"activity = '" + activity + '\'' + 
			",accessibility = '" + accessibility + '\'' + 
			",price = '" + price + '\'' + 
			",link = '" + link + '\'' + 
			",type = '" + type + '\'' + 
			",key = '" + key + '\'' + 
			",participants = '" + participants + '\'' + 
			"}";
		}
}