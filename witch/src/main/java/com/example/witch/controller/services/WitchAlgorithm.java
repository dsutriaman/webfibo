package com.example.witch.controller.services;

import java.util.List;

public class WitchAlgorithm {
   private FiboAlgorithm algorithm;
   
   public WitchAlgorithm() {}
   
   public WitchAlgorithm(FiboAlgorithm algorithm) {
	   this.algorithm = algorithm;
   }
   
   public Integer getNumberOfPeopleKillOnYear(List<Integer> arrData, Integer nYear){
       if (nYear < 1 || nYear > arrData.size()) {
           return -1;
       }
       return arrData.get(nYear - 1); 
  }
  
  public double Average(Integer A, Integer B){
      if ((A==-1) || (B==-1) ){
          return -1;
      }
      return (double)(A+B)/2;
  }
}
