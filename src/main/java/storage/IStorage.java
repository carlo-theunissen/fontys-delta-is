package storage;

import models.AnimationModel;

import java.util.Collection;

public interface IStorage {
    Collection<AnimationModel> GetAllModels();
    void PushAnimation(AnimationModel animation);
}
