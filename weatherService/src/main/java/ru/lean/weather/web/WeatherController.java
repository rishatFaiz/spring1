package ru.lean.weather.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.lean.weather.dto.WeatherData;
import ru.lean.weather.service.WeatherService;

import java.time.LocalDate;

@RestController
public class WeatherController {

  private WeatherService weatherService;

  @Autowired
  public WeatherController(WeatherService weatherService) {
    this.weatherService = weatherService;
  }

  @GetMapping("/name")
  public String serviceName() {
    return "weatherService";
  }

  @GetMapping("/weather/{city}/{date}")
  public WeatherData getWeatherData(@PathVariable String city, @PathVariable @DateTimeFormat(pattern = "dd.MM.yyyy") LocalDate date) {
    return weatherService.findByCityAndDate(city, date).orElse(new WeatherData());
  }


}
