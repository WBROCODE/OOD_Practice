import Display.MaxDisplay;
import Display.StatisticsDisplay;
import Subject.WeatherData;

public class App {
    public static void main(String[] args) throws Exception {
        WeatherData weatherData = new WeatherData();

        StatisticsDisplay statisticsDisplay =
                new StatisticsDisplay(weatherData);
        MaxDisplay maxDisplay = new MaxDisplay(weatherData);

        weatherData.setter(80, 65, 10.4f);
        System.out.println("-------------------------------------------");
        weatherData.setter(82, 70, 29.2f);
        System.out.println("-------------------------------------------");
        weatherData.setter(78, 90, 29.2f);
    }
}
