package com.okay.family.common.enums

import com.alibaba.fastjson.JSONArray
import com.okay.family.common.bean.common.SimpleBean

enum RunResult {

    SUCCESS(2, "成功"),
    FAIL(3, "失败"),
    UNRUN(4, "无法运行"),
    USER_ERROR(5, "用户错误")

    int code

    String desc

    RunResult(int code, String desc) {
        this.code = code
        this.desc = desc
    }

    static JSONArray getAll() {
        JSONArray result = new JSONArray()
        RunResult.values().each {x ->
            result << SimpleBean.getBean(x.getCode(), x.getDesc())
        }
        result
    }

}
