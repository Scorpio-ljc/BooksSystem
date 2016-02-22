package com.ljc.uitl;
/**
 * 表格分页的工具包
 * @author scxh
 *
 */
public class PagesUtil {
	private int allPages;//总页数
	private int allRow=0;//总行数
	private int nowPages=1;//当前页数,默认为第一页
	private Object[][] pagesData;//当前页数的数据
	private int rowOfpages=18;//一页中数据的行数
	public PagesUtil(int allRow){
		this.allRow=allRow;
		if(allRow%rowOfpages==0){
			allPages=allRow/rowOfpages;
		}
		else{
			allPages=allRow/rowOfpages+1;
		}
	}
	public int getAllPages() {
		return allPages;
	}
	public void setAllPages(int allPages) {
		this.allPages = allPages;
	}
	public int getAllRow() {
		return allRow;
	}
	public void setAllRow(int allRow) {
		this.allRow = allRow;
	}
	public int getNowPages() {
		return nowPages;
	}
	public void setNowPages(int nowPages) {
		this.nowPages = nowPages;
	}
	public Object[][] getPagesData() {
		return pagesData;
	}
	public void setPagesData(Object[][] pagesData) {
		this.pagesData = pagesData;
	}
	public int getRowOfpages() {
		return rowOfpages;
	}
	public void setRowOfpages(int rowOfpages) {
		this.rowOfpages = rowOfpages;
	}
	
}
