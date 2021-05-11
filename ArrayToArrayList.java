package javaPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
public static void main(String[] args) {
	String[] Students = {"Neha", "Akanksha", "Astha"};
	ArrayList<String> arrList = new ArrayList<>(Arrays.asList(Students));
	arrList.add("Madhu");
	arrList.add("Avantika");
	System.out.println(arrList);
	System.out.println(arrList.get(2));
}
}
