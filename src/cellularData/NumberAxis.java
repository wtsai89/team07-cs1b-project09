package cellularData;

import javafx.scene.chart.Axis;

import java.util.List;

public class NumberAxis extends Axis {
    @Override
    protected Object autoRange(double length) {
        return null;
    }

    @Override
    protected void setRange(Object range, boolean animate) {

    }

    @Override
    protected Object getRange() {
        return null;
    }

    @Override
    public double getZeroPosition() {
        return 0;
    }

    @Override
    public double getDisplayPosition(Object value) {
        return 0;
    }

    @Override
    public Object getValueForDisplay(double displayPosition) {
        return null;
    }

    @Override
    public boolean isValueOnAxis(Object value) {
        return false;
    }

    @Override
    public double toNumericValue(Object value) {
        return 0;
    }

    @Override
    public Object toRealValue(double value) {
        return null;
    }

    @Override
    protected List calculateTickValues(double length, Object range) {
        return null;
    }

    @Override
    protected String getTickMarkLabel(Object value) {
        return null;
    }
}
