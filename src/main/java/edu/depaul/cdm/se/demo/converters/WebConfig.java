package edu.depaul.cdm.se.demo.converters;

import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry reg){
        reg.addConverter(new RoomTypeConverter());
    }
}
