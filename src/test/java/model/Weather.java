package model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.HashMap;
import java.util.Map;


@JsonPropertyOrder({
        "City",
        "Temperature",
        "Humidity",
        "WeatherDescription",
        "WindSpeed",
        "WindDirectionDegree"
})
public class Weather {

    @JsonProperty("City")
    private String city;
    @JsonProperty("Temperature")
    private String temperature;
    @JsonProperty("Humidity")
    private String humidity;
    @JsonProperty("WeatherDescription")
    private String weatherDescription;
    @JsonProperty("WindSpeed")
    private String windSpeed;
    @JsonProperty("WindDirectionDegree")
    private String windDirectionDegree;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("City")
    public String getCity() {
        return city;
    }

    @JsonProperty("City")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("Temperature")
    public String getTemperature() {
        return temperature;
    }

    @JsonProperty("Temperature")
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    @JsonProperty("Humidity")
    public String getHumidity() {
        return humidity;
    }

    @JsonProperty("Humidity")
    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    @JsonProperty("WeatherDescription")
    public String getWeatherDescription() {
        return weatherDescription;
    }

    @JsonProperty("WeatherDescription")
    public void setWeatherDescription(String weatherDescription) {
        this.weatherDescription = weatherDescription;
    }

    @JsonProperty("WindSpeed")
    public String getWindSpeed() {
        return windSpeed;
    }

    @JsonProperty("WindSpeed")
    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    @JsonProperty("WindDirectionDegree")
    public String getWindDirectionDegree() {
        return windDirectionDegree;
    }

    @JsonProperty("WindDirectionDegree")
    public void setWindDirectionDegree(String windDirectionDegree) {
        this.windDirectionDegree = windDirectionDegree;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}