import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import fiveday.Forecast;

import java.io.IOException;

public class FiveDayForecast {
    private String URL_ENDPOINT = "https://api.openweathermap.org/data/2.5/forecast?";
    public JSONArray forecasts;

    public FiveDayForecast(String zipcode, String country, String API_KEY) {
        try {
            String json = Utils.getRequest(URL_ENDPOINT + "zip=" + zipcode + "," + country + "&APPID=" + API_KEY);
            JSONTokener token = new JSONTokener(json);
            this.forecasts = new JSONObject(token).getJSONArray("list");
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    public Forecast getForecast(int place) {
            return new Forecast(forecasts.getJSONObject(place));
        }
}
