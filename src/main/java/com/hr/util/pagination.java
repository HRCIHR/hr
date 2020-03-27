package com.hr.util;

public class pagination {// 分页
	private Integer page; // 页数
	private Integer rows; // 条数
	private String sort; // 哪一列排序
	private String order; // 排序规则

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public pagination() {
		super();
	}

	public pagination(Integer page, Integer rows) {
		super();
		this.page = page;
		this.rows = rows;
	}

	public pagination(Integer page, Integer rows, String sort, String order) {
		super();
		this.page = page;
		this.rows = rows;
		this.sort = sort;
		this.order = order;
	}

	@Override
	public String toString() {
		return "pagination [page=" + page + ", rows=" + rows + ", sort=" + sort + ", order=" + order + "]";
	}

	// 静态方法 封装 页面计算
	public static void pageformat(pagination page) {
		int pages = page.getPage();
		page.setPage((pages - 1) * page.getRows());
	}
}
