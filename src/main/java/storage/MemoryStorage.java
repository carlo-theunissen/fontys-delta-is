package storage;

import models.AnimationModel;

import java.util.ArrayList;
import java.util.Collection;

public class MemoryStorage implements IStorage {
    private Collection<AnimationModel> collection = new ArrayList<AnimationModel>();
    public Collection<AnimationModel> GetAllModels() {
        return collection;
    }

    public void PushAnimation(AnimationModel animation) {
        collection.add(animation);
    }
}
