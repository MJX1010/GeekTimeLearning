package com.tm.apitest.json;

import org.json.JSONObject;

public class Result {

    public static final int RESULT_SUCCESS = 0;
    public static final int RESULT_EXCEPTION = -1;

    /**
     * ������
     */
    public int code = 0;

    /**
     * ������Ϣ
     */
    public String message;

    /**
     * ���ؽ��
     */
    public Object result;

    public Result(int code, String msg)
    {
        this.code = code;
        this.message = msg;
    }

    public JSONObject toJson() {
        JSONObject jo = new JSONObject();
        jo.put("code", code);
        jo.put("message", message);
        jo.put("result", result);

        return jo;
    }
}
