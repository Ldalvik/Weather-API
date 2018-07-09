package current;

import org.json.JSONObject;

public class Coordinates {
    JSONObject obj;

    public Coordinates(JSONObject obj){
        this.obj = obj;
    }
    public double getLongitude() {
        return obj.getDouble("lon");
    }

    public double getLatitude() {
        return obj.getDouble("lat");
    }
}
