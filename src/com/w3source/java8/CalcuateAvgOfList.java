package com.w3source.java8;

import java.util.Arrays;
import java.util.List;

public class CalcuateAvgOfList {
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(1,10,2,4,3,6,5,7,9,8);
	 double dl = list.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
	 System.out.println(dl);
	 
}
}
