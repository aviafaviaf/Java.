package n6.n11;

public class Temperature implements Convertable {
    public double value;

    public Temperature(double value) {
        this.value = value;
    }

    @Override
    public double convert(TemperatureCategory category) {
        if (category == TemperatureCategory.KELVIN)
            return value + 273;
        else if (category == TemperatureCategory.FAHRENHEIT)
            return value * 1.8 + 32;
        return 0;
    }
}
