package bike.rapido.paathashaala.conversion;

import bike.rapido.paathashaala.converters.ConverterType;

public class UnitConverter {
    private final ConverterType converterType;

    public UnitConverter(ConverterType converterType) {
        this.converterType = converterType;
    }

    public double convert(double fromUnit) {
        return fromUnit * converterType.multiplier();
    }
}
