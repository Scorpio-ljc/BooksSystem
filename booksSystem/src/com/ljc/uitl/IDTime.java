package com.ljc.uitl;

import java.text.SimpleDateFormat;
import java.util.Date;

public class IDTime {
	public static String getTime() {// ��ȡ����ʱ��
		Date d = new Date(System.currentTimeMillis());
		SimpleDateFormat sdf = new SimpleDateFormat("ddHHmmss");
		return sdf.format(d);
	}
}
