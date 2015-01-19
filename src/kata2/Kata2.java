package kata2;

import java.util.HashMap;
import java.util.Iterator;


public class Kata2 {


    public static void main(String[] args) {
        int[] vector = {2,2,11,4,2,6,11,2,3,5,11,5};
        
        HashMap<Integer,Integer> histograma = new HashMap<>();
        
        for(int i=0;i<vector.length;i++) {
            if(histograma.containsKey(vector[i])) {
                histograma.put(vector[i],histograma.get(vector[i])+1);
            } else {
                histograma.put(vector[i],1);
            }
        }
        Iterator numbersite = histograma.keySet().iterator();
        int frecuency = 0;
        int biggest = 0;
        for(int i=0;i<histograma.size();i++) {
            int number = (int)numbersite.next();
            if(histograma.get(number)> frecuency) {
                biggest = number;
                frecuency = histograma.get(number); 
            }
            System.out.println(number + "->" + histograma.get(number)); 
        }   
        System.out.println("El numero con mayor frecuencia es el: " + biggest);
    }
}