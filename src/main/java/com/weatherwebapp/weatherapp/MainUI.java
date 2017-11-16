package com.weatherwebapp.weatherapp;

import com.vaadin.server.ExternalResource;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import org.springframework.boot.web.client.RestTemplateBuilder;

@SpringUI
public class MainUI extends UI{
    @Override
    protected void init(VaadinRequest vaadinRequest) {

        VerticalLayout root = new VerticalLayout();
        VerticalLayout verticalLayout = new VerticalLayout();
        Label label = new Label();

        verticalLayout.setDefaultComponentAlignment(Alignment.TOP_CENTER);
        root.setWidth("50%");

        verticalLayout.addStyleName(ValoTheme.LAYOUT_CARD);

        RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
        WeatherService weatherService = new WeatherService(restTemplateBuilder);

       WeatherE weather = weatherService.getWeather("Turkey","Bursa");

       label.addStyleName(ValoTheme.LABEL_H1);
       label.setValue(weather.getName());

       verticalLayout.addComponent(label);

       Label label2 = new Label();
        label2.addStyleName(ValoTheme.LABEL_H2);

        label2.setValue(weather.getCelsiusTemperature());

        Image icon = new Image(null,new ExternalResource("http://openweathermap.org/img/w/" + weather.getWeatherIcon() + ".png"));

        verticalLayout.addComponent(icon);

        verticalLayout.addComponent(label2);

        root.addComponent(verticalLayout);
        root.setDefaultComponentAlignment(Alignment.TOP_CENTER);
        setContent(root);

    }
}
