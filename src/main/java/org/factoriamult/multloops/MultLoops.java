package org.factoriamult.multloops;


public class MultLoops {
    public String[] mult(int n){
        String[] table = new String  [10];
        for ( int i = 1; i <=10; i++){
            int result = n*i;
            table[i-1]= n +"x" + i +"=" + result;
            
        }
        return table;
    }
}










