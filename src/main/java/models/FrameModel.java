package models;

import java.util.Collection;

public class FrameModel {
    private Collection<ColorModel> Colors;

    public Collection<ColorModel> getColors() {
        return Colors;
    }

    public void setColors(Collection<ColorModel> colors) {
        Colors = colors;
    }
}
