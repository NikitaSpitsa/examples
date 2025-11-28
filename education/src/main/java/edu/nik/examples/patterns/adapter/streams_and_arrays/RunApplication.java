package edu.nik.examples.patterns.adapter.streams_and_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class RunForTest {
    public static void main(String[] args) {
        Object[] objectsArray = new Object[5];

        objectsArray[0] = "value";
        objectsArray[1] = new String[]{"Lilu", "Mabo"};
        objectsArray[2] = new int[]{1, 2, 3};
        objectsArray[3] = "%pattern%";
        objectsArray[4] = new ArrayList<>(Arrays.asList("Good", 45, "Look"));

        System.out.println("we have input :\n");
        for (Object object : objectsArray) {
            if (object instanceof String[]) {
                String[] stringArray = (String[]) object;
                for (String item : stringArray){
                    System.out.print(" " + item);
                }
            } else if (object instanceof int[]) {
                int[] intArray = (int[]) object;
                for (int item : intArray){
                    System.out.print(" " + item);
                }
            } else{
                System.out.print(object);
            }
            System.out.println();

        }

        System.out.println("\n Then we made flat and got output : \n");
        for (Object object : flatten(objectsArray)) {
            if (object instanceof String[] stringArray) {
                for (String sell : stringArray){
                    System.out.print(" " + sell);
                }
            } else if (object instanceof int[]) {
                int[] intArray = (int[]) object;
                for (int sell : intArray){
                    System.out.print(" " + sell);
                }
            } else{
                System.out.print(object);
            }
            System.out.println();

        }
    }

    private static Object[] flatten(Object[] array) {
        List<Object> resultList = new ArrayList<>();

        for (Object object : array) {
            if (object != null) {
                if (object instanceof Collection) {
                    resultList.addAll((Collection) object);
//                } else if (object instanceof String[]) {
//                    resultList.add((String[]) object);
//                } else if (object instanceof int[]) {
//                    resultList.add((int[]) object);
                } else {
                    resultList.add(object);
                }
            }
        }

        return resultList.toArray();
    }
}
