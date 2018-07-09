package fiveday;

import org.json.JSONObject;

public class Wind {
    private JSONObject obj;

    public Wind(JSONObject obj) {
        this.obj = obj;
    }

    public double getSpeed() {
        return (double) obj.get("speed");
    }
    public int getDegrees() {
        return obj.getInt("deg");
    }

}
