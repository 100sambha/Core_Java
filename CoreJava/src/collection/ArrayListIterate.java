package collection;
import java.util.*;

import java.util.ArrayList;

public class ArrayListIterate {
	public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        
//        for(String s :list) {
//        	System.out.println(s);
//        }
        
        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
        
	}
}
