package com.lin.Crystal.entry;

public class NewsEntry {
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String title;
	private String source;
	private int star;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public int getStar() {
		return star;
	}
	public void setStar(int star) {
		this.star = star;
	}

}
