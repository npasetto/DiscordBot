package org.jointheleague.modules.pojo.dictionary;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DictionaryWrapper {

	@SerializedName("shortdef")
	@Expose
	private List<String> shortdef = null;
	
	@SerializedName("fl")
	@Expose
	private String fl;

	public List<String> getShortdef() {
		return shortdef;
	}

	public void setShortdef(List<String> shortdef) {
		this.shortdef = shortdef;
	}
<<<<<<< HEAD
	
	public String getFl() {
		return fl;
	}

	public void setFl(String fl) {
		this.fl = fl;
	}
=======

	public String getFl() {
		return fl;
	}

	public void setFl(String fl) {
		this.fl = fl;
	}
	
>>>>>>> branch 'feature/EvanBot' of https://github.com/LEAGUE-Level6/DiscordBot.git
}
