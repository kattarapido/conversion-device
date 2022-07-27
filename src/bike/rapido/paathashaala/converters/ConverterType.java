package bike.rapido.paathashaala.converters;

public enum ConverterType {
    FEET_TO_INCH(12.0),
    YARD_TO_FEET(3.0);

    private final double unitMultiplier;

    ConverterType(double unitMultiplier) {
        this.unitMultiplier = unitMultiplier;
    }

    public double multiplier() {
        return unitMultiplier;
    }
}


