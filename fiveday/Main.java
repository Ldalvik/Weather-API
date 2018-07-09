package fiveday;

import org.json.JSONObject;

public class Main {
    private JSONObject obj;

    public Main(JSONObject obj) {
        this.obj = obj;
    }

    public double getTemp() {
        return obj.getDouble("temp");
    }

    public int getHumidity() {
        return obj.getInt("humidity");
    }

    public double getPressure() {
        return obj.getDouble("pressure");
    }

    public double getTempMin() {
        return obj.getDouble("temp_min");
    }

    public double getTempMax() {
        return obj.getDouble("temp_max");
    }

    public double getGroundLevel() {
        return obj.getDouble("grnd_level");
    }

    public double getSeaLevel() {
        return obj.getDouble("sea_level");
    }
}
