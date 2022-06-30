package com.practice.arrays;

public class String3DArrayExample {

    public static void main(String[] args) {

        String[][][] a = {{
                           {"a", "b"},
                           {"d", "e", "f"}
                          },
                         {
                           {"g", "h", "i", "j"}
                         }
                       };

        for(int i=0; i<a.length; i++){

            for(int j=0; j<a[i].length; j++){

                for(int k=0; k<a[i][j].length; k++) {

                    System.out.println("Length...a.length...." + a.length+"....a[i].length..."+a[i].length+"....a[i][j].length.."+a[i][j].length);
                }
            }
        }
    }
}
