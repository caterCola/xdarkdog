package com.xdarkdog.weixin.applyin;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class SimsimiUtil {
	public static final String url = "http://sandbox.api.simsimi.com/request.p";
	public static final String token = "b87e743f-150e-4ebc-9dae-bd1a55837311";
	public static final String locale = "zh";
	public static final double ft = 1.0;

	// 返回和小黄鸡对话的结果
	public static String talk(String text) {
		String params = "key=" + token + "&lc=" + locale + "&ft=" + ft + "&text=" + text;
		String jsonStr = URLConnectionHelper.sendGet(url, params);
		JSONObject msg = JSON.parseObject(jsonStr);
		String result = msg.getString("result");
		if ("100".equals(result)) {
			return msg.getString("response");
		}
		return "暗黑无边，你我并肩！";
	}
}
