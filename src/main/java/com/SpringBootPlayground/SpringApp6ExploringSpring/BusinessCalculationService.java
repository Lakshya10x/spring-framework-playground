package com.SpringBootPlayground.SpringApp6ExploringSpring;

import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;
import java.util.Arrays;
@Component
public class BusinessCalculationService {

    DataService dataService;
    public BusinessCalculationService(DataService dataService)
    {
        this.dataService = dataService;
    }
    public int findMax()
    {
        return Arrays.stream(dataService.retreiveData()).max().orElse(0);
    }
}
