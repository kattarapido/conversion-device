package bike.rapido.paathashaala.conversion;

import org.junit.Test;

import static bike.rapido.paathashaala.converters.ConverterType.FEET_TO_INCH;
import static bike.rapido.paathashaala.converters.ConverterType.YARD_TO_FEET;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class UnitConverterTest {

    @Test
    public void shouldConvertFeetToInches() {
        double inches = new UnitConverter(FEET_TO_INCH).convert(1.0);
        assertThat(inches, is(12.0));
    }

    @Test
    public void shouldConvertYardToFeet() {
        double feet = new UnitConverter(YARD_TO_FEET).convert(1);
        assertThat(feet, is(3.0));
    }
}