package fiveday;

import org.json.JSONObject;

public class Weather{
        private JSONObject obj;

    public Weather(JSONObject obj){
        this.obj = obj;
    }

        public int getId () {
        return obj.getInt("id");
    }

        public String getIcon () {
        return obj.getString("icon");
    }

        public String getDescription () {
        return obj.getString("description");
    }

        public String getMain () {
        return obj.getString("main");
    }
}
