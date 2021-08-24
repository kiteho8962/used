package com.yeon.ho.used.handler.script;

public class Script {
    public static String back(String msg) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<script>");
        stringBuffer.append("alert(`"+msg+"`);");
        stringBuffer.append("history.back();");
        stringBuffer.append("</script>");
        return stringBuffer.toString();
    }
}
