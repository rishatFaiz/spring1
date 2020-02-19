package ru.lean.weather.service;

import ru.lean.weather.dto.WeatherData;

import java.time.LocalDate;
import java.util.Optional;

public interface WeatherService {

  Optional<WeatherData> findByCityAndDate(String city, LocalDate date);

}
