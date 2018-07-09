package current;

import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;

public class  Sys {
    private JSONObject obj;

    public Sys(JSONObject obj) {
        this.obj = obj;
    }

    public int getType() {
        return obj.getInt("type");
    }

    public int getId() {
        return obj.getInt("id");
    }
    public double getMessage() {
        return obj.getDouble("message");
    }

    public String getCountry() {
        return obj.getString("country");
    }

    public String getSunrise() {
        Date date = new Date(obj.getLong("sunrise")*1000);
        SimpleDateFormat jdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return jdf.format(date);
    }
    public String getSunset() {
        Date date = new Date(obj.getLong("sunset")*1000);
        SimpleDateFormat jdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return jdf.format(date);
    }
}
