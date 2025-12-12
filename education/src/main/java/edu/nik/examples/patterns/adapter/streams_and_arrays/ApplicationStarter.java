package edu.nik.examples.patterns.adapter.streams_and_arrays;

import java.util.*;
import java.util.stream.Stream;

public class RunApplication {
    public static void main(String[] args) {
        Object[] objectsArray = new Object[5];

        objectsArray[0] = "value";
        objectsArray[1] = new String[]{"Lilu", "Mabo"};
        objectsArray[2] = new int[]{1, 2, 3};
        objectsArray[3] = "%pattern%";
        objectsArray[4] = new ArrayList<>(Arrays.asList("Good", 45, "Look"));

        System.out.println("we have input :\n");
        print(objectsArray);

        System.out.println("\n Then we made flat and got output : \n");
        print (flatten(objectsArray));
    }

    private static void print(Object[] objectsArray) {
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
    }

    private static Object[] flatten(Object[] array) {
        return Arrays.stream(array)
                .filter(Objects::nonNull)
                .flatMap(obj -> obj instanceof Collection<?> ? ((Collection<?>) obj).stream() : Stream.of(obj))
               .toArray(Object[]::new);
    }
}
