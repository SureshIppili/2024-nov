package com.hackerrank.weather.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackerrank.weather.model.Weather;
import com.hackerrank.weather.repository.WeatherRepository;

import java.util.List;
import java.util.Optional;

@Service
public class WeatherService {

    @Autowired
    private WeatherRepository weatherRepository;

    public Weather createWeatherRecord(Weather weather) {
        return weatherRepository.save(weather);
    }

    public List<Weather> getAllWeatherRecords() {
        return weatherRepository.findAll();
    }

    public Optional<Weather> getWeatherRecordById(Long id) {
        return weatherRepository.findById(id);
    }

    public void deleteWeatherRecord(Long id) {
        weatherRepository.deleteById(id);
    }
}