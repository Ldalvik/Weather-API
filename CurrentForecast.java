import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import yo.current.*;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentForecast {
    private JSONObject obj;

    public CurrentForecast(String zipcode, String country, String API_KEY) {
        try {
            String json = Utils.getRequest("https://api.openweathermap.org/data/2.5/weather?zip=" + zipcode + "," + country + "&APPID=" + API_KEY);
            JSONTokener token = new JSONTokener(json);
            this.obj = new JSONObject(token);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    public Coordinates getCoordinates() {
        return new Coordinates(obj.getJSONObject("coord"));
    }

    public Main getMain() {
        return new Main(obj.getJSONObject("main"));
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

    public Wind getWind() {
        return new Wind(obj.getJSONObject("wind"));
    }

    public Sys getSys() {
        return new Sys(obj.getJSONObject("sys"));
    }

    public int getClouds() {
        return obj.getJSONObject("clouds").getInt("all");
    }

    public Long getVisibility() {
        return obj.getLong("visibility");
    }

    public String getDate() {
        Date date = new Date(obj.getLong("dt") * 1000);
        SimpleDateFormat jdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return jdf.format(date);
    }

    public Weather getWeather() {
        JSONArray arr = obj.getJSONArray("weather");
        JSONObject obj2 = arr.getJSONObject(0);
        return new Weather(obj2);
    }

    @Override
    public String toString() {
        return obj.toString();
    }
}
