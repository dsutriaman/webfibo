package com.example.witch.controller.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibo1 implements FiboAlgorithm {

	@Override
	public List<Integer> init(Integer nYear) {
		int nPrev = 0, nCurrent = 1, total= 1, nNext=0; 
        ArrayList<Integer> result = new ArrayList<Integer>(Arrays.asList(total));
        for (int i = 0; i < nYear; ++i) {
            nNext = nPrev + nCurrent;
            total= total + nNext;
            result.add(total);
            nPrev = nCurrent;
            nCurrent = nNext;
        }
        return result;
	}

}
