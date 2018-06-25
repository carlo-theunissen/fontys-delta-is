package logic;

import models.AnimationModel;
import storage.IStorage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class RandomAnimationProvider {

    private IStorage storage;
    private List<AnimationModel> animations;
    private int countFrom;

    public RandomAnimationProvider(IStorage storage){
        this.storage = storage;
    }

    public AnimationModel getNext(){
        resetAnimationsIfInvalid();
        if(countFrom < 0){
            return null;
        }
        int index = getRandomIndex();
        AnimationModel item = animations.get(index);

        switchIndex(index, countFrom);
        countFrom--;
        return item;
    }

    private int getRandomIndex(){
        Random r = new Random();
        return r.nextInt((countFrom ) + 1);
    }

    private void switchIndex(int index1, int index2){
        if(index1 >= animations.size() || index2 >= animations.size()){
            return;
        }
        AnimationModel temp = animations.get(index1);
        animations.set(index1, animations.get(index2));
        animations.set(index2, temp);
    }

    private void resetAnimationsIfInvalid(){
        if(animations == null || countFrom <= 0){
            animations = new ArrayList<AnimationModel>( storage.GetAllModels() );
            countFrom = animations.size()-1;
        }
    }

    public IStorage getStorage() {
        return storage;
    }
}
