package ru.lean.weather.service.impl;

import org.springframework.stereotype.Service;
import ru.lean.weather.dto.WeatherData;
import ru.lean.weather.service.WeatherService;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class WeatherServiceImpl implements WeatherService {

  private static final Map<String, Map<LocalDate, WeatherData>> weatherDataStatistic = new HashMap<>();

  static {
    Map<LocalDate, WeatherData> weatherDataMap = new HashMap<>();
    WeatherData weatherData = new WeatherData();
    weatherData.setDate(LocalDate.of(2020, 2, 19));
    weatherData.setHumidity(50);
    weatherData.setPressure(750);
    weatherData.setTemperature(-6);
    weatherDataMap.put(weatherData.getDate(), weatherData);
    weatherDataStatistic.put("Уфа", weatherDataMap);
  }


  @Override
  public Optional<WeatherData> findByCityAndDate(String city, LocalDate date) {
    return Optional.ofNullable(weatherDataStatistic.get(city)).map(it -> it.get(date));
  }
}
