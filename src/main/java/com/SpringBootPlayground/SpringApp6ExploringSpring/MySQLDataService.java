package com.SpringBootPlayground.SpringApp6ExploringSpring;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataService implements DataService{

    @Override
    public int[] retreiveData() {
        return new int[]{1,2,3,4,5};
    }
}
