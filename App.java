public class App 
{
    public static void main( String[] args ) {
        FiveDayForecast w = new FiveDayForecast("02155", "us","API_KEY");
        for(int i = 0; i<w.forecasts.length(); i++){
            System.out.println(w.getForecast(i).getDate());
        }
        
        CurrentForecast cf = new CurrentForecast("02155", "us", "API_KEY");
        cf.getWeather().getDescription();
        cf.getCoordinates().getLongitude();
    }
}
