package com.SpringBootPlayground.SpringApp6ExploringSpring;

public class MongoDBDataService implements DataService{
    @Override
    public int[] retreiveData() {
        return new int[]{6,7,8,9};
    }
}
