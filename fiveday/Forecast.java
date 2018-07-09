package fiveday;

import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Forecast {
    private JSONObject obj;

    public Forecast(JSONObject obj){
        this.obj = obj;
    }

    public fiveday.Main getMain() {
        return new fiveday.Main(obj.getJSONObject("main"));
    }

    public int getId() {
        return obj.getInt("id");
    }

    public String getName() {
        return obj.getString("name");
    }

    public int getCode() {
        return obj.getInt("code");
    }

    public fiveday.Wind getWind() {
        return new fiveday.Wind(obj.getJSONObject("wind"));
    }

    public fiveday.Weather getWeather() {
        return new fiveday.Weather(obj.getJSONObject("weather"));
    }

    public int getClouds() {
        return obj.getJSONObject("clouds").getInt("all");
    }

    public String getDate() {
        Date date = new Date(obj.getLong("dt") * 1000);
        SimpleDateFormat jdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return jdf.format(date);
    }
}
