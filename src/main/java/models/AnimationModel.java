package models;

import java.util.Collection;

public class AnimationModel {
    Collection<FrameModel> Frames;

    public Collection<FrameModel> getFrames() {
        return Frames;
    }

    public void setFrames(Collection<FrameModel> frames) {
        Frames = frames;
    }
}
