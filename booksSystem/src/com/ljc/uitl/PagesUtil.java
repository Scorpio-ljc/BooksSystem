package com.ljc.uitl;
/**
 * ����ҳ�Ĺ��߰�
 * @author scxh
 *
 */
public class PagesUtil {
	private int allPages;//��ҳ��
	private int allRow=0;//������
	private int nowPages=1;//��ǰҳ��,Ĭ��Ϊ��һҳ
	private Object[][] pagesData;//��ǰҳ��������
	private int rowOfpages=18;//һҳ�����ݵ�����
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
