package com.ljc.uitl;

import java.text.SimpleDateFormat;
import java.util.Date;

public class IDTime {
	public static String getTime() {// 获取发送时间
		Date d = new Date(System.currentTimeMillis());
		SimpleDateFormat sdf = new SimpleDateFormat("ddHHmmss");
		return sdf.format(d);
	}
}
