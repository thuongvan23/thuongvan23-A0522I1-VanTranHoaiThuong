package com.example.ss11_thcustomermanagement.model;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    private final List<String> abc = new ArrayList<>();
    {
        abc.add("a");
        abc.add("b");
        abc.add("c");
    }

    public List<String> getter(){
        return abc;
    }

}
