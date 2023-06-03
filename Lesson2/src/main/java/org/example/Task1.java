package org.example;

import org.json.JSONObject;

import java.util.Iterator;

public class Task1 {

    public String createRequestString(String[] paramName, String[] paramValue) {
        if (paramName.length == 0 || paramValue.length == 0) {
            return "";
        }

        StringBuilder requestString = new StringBuilder();

        if (paramName.length == paramValue.length) {
            if (paramName.length == 1) {
                requestString.append(String.format(" WHERE %s=\'%s\'", paramName[0], paramValue[0]));
                return requestString.toString();
            }

            requestString.append(" WHERE ");
            for (int i = 0; i < paramValue.length; i++) {
                requestString.append(String.format("%s=\'%s\'", paramName[i], paramValue[i]));
                if (i != paramName.length - 1) {
                    requestString.append(" AND ");
                }
            }
            return requestString.toString();
        }
        return "";
    }
    public String jsonToSql(String jsonString) {
        StringBuilder requestString = new StringBuilder(" WHERE ");
        JSONObject jo = new JSONObject(jsonString);
        Iterator<String> key = jo.keys();
        while (key.hasNext()) {
            String str = key.next();
            if (!jo.get(str).equals("null")) {
                requestString.append(String.format("%s=\'%s\'", str, jo.get(str)));
            } else {
                continue;
            }
            requestString.append(" AND ");
        }
        return requestString.toString();
    }
}
