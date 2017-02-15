package com.simple.server.domain.contract;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.simple.server.domain.AbstractLogMsg;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(as = BusTagTemplate.class)
public class BusTagTemplate extends AbstractLogMsg{
	
	private static final long serialVersionUID = 1L;		
	private int id;
	private String sqlTemplate;
	private String desc;	
	private String searchingTag1;
	private String searchingTag2;
	private String searchingTag3;
	private String searchingTag4;
	private String searchingTag5;
	private String searchingTag6;
	private String searchingTag7;
	private String searchingTag8;
	private String searchingTag9;
	private String searchingTag10;
	private String searchingTag11;
	private String searchingTag12;
	private String searchingTag13;
	private String searchingTag14;
	private String searchingTag15;
	private String searchingTag16;
	private String searchingTag17;
	private String searchingTag18;
	private String searchingTag19;
	private String searchingTag20;
	private Set<BusTagParam> params;

	@Override
	public String getClazz() {
		return this.getClass().getName();
	}	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSqlTemplate() {
		return sqlTemplate;
	}
	public void setSqlTemplate(String sqlTemplate) {
		this.sqlTemplate = sqlTemplate;
	}		
	public String getDescription() {
		return desc;
	}
	public void setDescription(String description) {
		this.desc = description;
	}
	public Set<BusTagParam> getParams() {
		return params;
	}
	public void setParams(Set<BusTagParam> params) {
		this.params = params;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getSearchingTag1() {
		return searchingTag1;
	}
	public void setSearchingTag1(String searchingTag1) {
		this.searchingTag1 = searchingTag1;
	}
	public String getSearchingTag2() {
		return searchingTag2;
	}
	public void setSearchingTag2(String searchingTag2) {
		this.searchingTag2 = searchingTag2;
	}
	public String getSearchingTag3() {
		return searchingTag3;
	}
	public void setSearchingTag3(String searchingTag3) {
		this.searchingTag3 = searchingTag3;
	}
	public String getSearchingTag4() {
		return searchingTag4;
	}
	public void setSearchingTag4(String searchingTag4) {
		this.searchingTag4 = searchingTag4;
	}
	public String getSearchingTag5() {
		return searchingTag5;
	}
	public void setSearchingTag5(String searchingTag5) {
		this.searchingTag5 = searchingTag5;
	}
	public String getSearchingTag6() {
		return searchingTag6;
	}
	public void setSearchingTag6(String searchingTag6) {
		this.searchingTag6 = searchingTag6;
	}
	public String getSearchingTag7() {
		return searchingTag7;
	}
	public void setSearchingTag7(String searchingTag7) {
		this.searchingTag7 = searchingTag7;
	}
	public String getSearchingTag8() {
		return searchingTag8;
	}
	public void setSearchingTag8(String searchingTag8) {
		this.searchingTag8 = searchingTag8;
	}
	public String getSearchingTag9() {
		return searchingTag9;
	}
	public void setSearchingTag9(String searchingTag9) {
		this.searchingTag9 = searchingTag9;
	}
	public String getSearchingTag10() {
		return searchingTag10;
	}
	public void setSearchingTag10(String searchingTag10) {
		this.searchingTag10 = searchingTag10;
	}
	public String getSearchingTag11() {
		return searchingTag11;
	}
	public void setSearchingTag11(String searchingTag11) {
		this.searchingTag11 = searchingTag11;
	}
	public String getSearchingTag12() {
		return searchingTag12;
	}
	public void setSearchingTag12(String searchingTag12) {
		this.searchingTag12 = searchingTag12;
	}
	public String getSearchingTag13() {
		return searchingTag13;
	}
	public void setSearchingTag13(String searchingTag13) {
		this.searchingTag13 = searchingTag13;
	}
	public String getSearchingTag14() {
		return searchingTag14;
	}
	public void setSearchingTag14(String searchingTag14) {
		this.searchingTag14 = searchingTag14;
	}
	public String getSearchingTag15() {
		return searchingTag15;
	}
	public void setSearchingTag15(String searchingTag15) {
		this.searchingTag15 = searchingTag15;
	}
	public String getSearchingTag16() {
		return searchingTag16;
	}
	public void setSearchingTag16(String searchingTag16) {
		this.searchingTag16 = searchingTag16;
	}
	public String getSearchingTag17() {
		return searchingTag17;
	}
	public void setSearchingTag17(String searchingTag17) {
		this.searchingTag17 = searchingTag17;
	}
	public String getSearchingTag18() {
		return searchingTag18;
	}
	public void setSearchingTag18(String searchingTag18) {
		this.searchingTag18 = searchingTag18;
	}
	public String getSearchingTag19() {
		return searchingTag19;
	}
	public void setSearchingTag19(String searchingTag19) {
		this.searchingTag19 = searchingTag19;
	}
	public String getSearchingTag20() {
		return searchingTag20;
	}
	public void setSearchingTag20(String searchingTag20) {
		this.searchingTag20 = searchingTag20;
	}	
	
}
