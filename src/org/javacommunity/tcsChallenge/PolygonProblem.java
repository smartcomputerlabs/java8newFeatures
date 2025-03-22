package org.javacommunity.tcsChallenge;

import java.util.HashMap;
import java.util.Scanner;

public class PolygonProblem {
    public static void main(String[] args) {
        Scanner s = null;
        int numOfCord = 0;
        boolean exception = true;
        HashMap<Integer,int[]> coridnatesMap = new HashMap();
        float sideLength1 = 0f;
        float sideLength2 = 0f;
        float sideLength3 = 0f;
        Double area = 0d;
        while(exception)
        try {
            s = new Scanner(System.in);
            System.out.print("Input some integer example 4 :");
            numOfCord= s.nextInt();
            exception = false;
        }catch(Exception e){
            System.out.println("Wrong Input...");
            exception = true;
        }


        Scanner s2 = null;
        int i = 0;
        String inputCoordinates = null;
        int cord1 = 0;
        int cord2 = 0;
        exception = true;
        for(int j=1;j<=numOfCord;j++) {
            exception = true;
            while (exception) {
                try {
                    s2 = new Scanner(System.in);
                    System.out.println("Input coordinate no. "+j+" with a space between x and y coordinates, for example 2 3 :");
                    inputCoordinates = s2.nextLine().trim();
                    if (inputCoordinates.contains(" ") && !inputCoordinates.contains("  ")) {
                        cord1 = Integer.parseInt(inputCoordinates.split(" ")[0]);
                        cord2 = Integer.parseInt(inputCoordinates.split(" ")[1]);
                        coridnatesMap.put(j,new int[]{cord1,cord2});

                        //System.out.println(cord1);
                        //System.out.println(cord2);
                    } else {
                        System.out.println("Wrong Input...");
                        exception = true;
                        continue;
                    }

                    //   System.out.println(inputCoordinates);
                    //cord2 = s2.nextInt();
           /* if(){

            }*/
                    exception = false;
                } catch (Exception e) {
                    System.out.println("Wrong Input...");
                    exception = true;
                }
            }
        }
        int x1 =0;
        int y1 =0;
        int x2 =0;
        int y2 =0;
        int x3 =0;
        int y3 =0;
        float semiPerimeter = 0f;
        /*for(int key : coridnatesMap.keySet()){
            coridnatesMap.get(key);
        }*/
        int minX = 0;
      //  int coridnatesMapIndex = 1;
        int[] keysInuse = {1,2,3};

        while(coridnatesMap.size() > 2) {
            if(keysInuse[0] == minX){
                keysInuse[0] = keysInuse[1];
                keysInuse[1] = keysInuse[2];
                keysInuse[2] = keysInuse[2]+1;
            } else if(keysInuse[1] == minX){
                keysInuse[1] = keysInuse[2];
                keysInuse[2] = keysInuse[2]+1;
            } else if(keysInuse[2] == minX){
                keysInuse[2] = keysInuse[2]+1;
            }
            int[] c1 = coridnatesMap.get(keysInuse[0]);
            x1 = c1[0];
            y1 = c1[1];
            minX = keysInuse[0];
            int[] c2 = coridnatesMap.get(keysInuse[1]);
            x2 = c2[0];
            y2 = c2[1];
            minX = x2 < x1 ? (keysInuse[1]) : minX;
            int[] c3 = coridnatesMap.get(keysInuse[2]);
            x3 = c3[0];
            y3 = c3[1];
            minX = x3 < minX ? (keysInuse[2]) : minX;

            sideLength1 = (float) Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
            sideLength2 = (float) Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
            sideLength3 = (float) Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
            semiPerimeter = (sideLength1 + sideLength2 + sideLength3) / 2;
            area = area + Math.sqrt(semiPerimeter * (semiPerimeter - sideLength1) * (semiPerimeter - sideLength2) * (semiPerimeter - sideLength3));
            coridnatesMap.remove(minX);
        }
        System.out.println("Max Possible Area:"+ area.intValue());
        System.out.println();
    }
}
