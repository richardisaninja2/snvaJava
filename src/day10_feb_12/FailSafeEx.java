package day10_feb_12;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeEx {
    public static void main(String[] args) {
        //the copyWtriteArraylist uses failsfae approach
        //creates a snapshot of the list when the iterrator is created
        //modification made to the original list when the iterrator is created
        CopyOnWriteArrayList<String> names = new CopyOnWriteArrayList<String>();

        names.add("harper");
        names.add("bi");
        names.add("ge");
        names.add("ed");
        names.add("al");
        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()){
            String name = iterator.next();
            if(name.equals("harper")){
                names.remove(0);
                names.add("lilly");
            }
            System.out.println(name);
        }
    }
}
