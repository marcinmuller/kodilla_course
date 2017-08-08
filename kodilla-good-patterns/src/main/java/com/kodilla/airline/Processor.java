package com.kodilla.airline;

import java.util.List;
import static java.util.stream.Collectors.toList;

/**
 * Created by Marcin Muller on 08.08.17.
 */
public class Processor {
    ConectionMap conectionMap=new ConectionMap();
    public void findFrom(String from){
        System.out.println("loty z "+from);
        conectionMap
                .getSet()
                .stream()
                .filter(s->s.getFrom().equals(from))
                .forEach(System.out::println);

    }
    public void findTo(String to){
        System.out.println("loty do "+to);
        conectionMap
                .getSet()
                .stream()
                .filter(s->s.getTo().equals(to))
                .forEach(System.out::println);

    }
    public void findVia(String from, String to) {
        System.out.println("loty z " + from + " do " + to);
        List<Flight> fromList = conectionMap
                .getSet()
                .stream()
                .filter(s -> s.getFrom().equals(from))
                .collect(toList());

        List<Flight> toList = conectionMap
                .getSet()
                .stream()
                .filter(s -> s.getTo().equals(to))
                .collect(toList());

        for(Flight f: fromList){
            for(Flight t: toList){
               if(f.getTo().equals(t.getFrom())){
                   System.out.println(f+" "+t);
               }
            }
        }
    }
}
