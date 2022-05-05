package com.belhard.lesson10;

import com.belhard.lesson10.base.Box;
import com.belhard.lesson10.model.Car;
import com.belhard.lesson10.model.Track;
import com.belhard.lesson10.util.MaxPowerCarComparator;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
//        BigDecimal bigDecimal=BigDecimal.valueOf(10);
//        BigDecimal bigDecimal1=BigDecimal.valueOf(10);
//        System.out.println(bigDecimal.equals(bigDecimal1));
//        System.out.println(bigDecimal.compareTo(bigDecimal1));
//        if(bigDecimal.compareTo(bigDecimal1)==0){
//            System.out.println("они равны");
//        }

        Car car1 = new Car("grey", 50, "S2");
        Car car2 = new Car("black", 60, "S2");
        Car car3 = new Car("red", 40, "S1");
        List<Car> cars = new ArrayList<Car>() {{
            add(car1);
            add(car2);
            add(car3);
        }};
//        System.out.println(car1);
        /*ArrayList<Integer>arrayList=new ArrayList<>(){{
            add(12);
            add(1);
            add(15);
        }};
        arrayList.stream()
                .sorted()
                .forEach(System.out::println);
        */
        cars.stream().sorted().forEach(car-> System.out.println(car));
//        cars.stream()
//                .sorted()
//                .forEach(car -> {
//                    System.out.println(car);
//                    //любые действия что бы что-то ещё сделать
//                });
        Track track1=new Track("grey", 50, "S2",100);
        Track track2=new Track("black", 60, "S10",60);
        ArrayList<Track>tracks=new ArrayList<>(){{
            add(track1);
            add(track2);
        }};
        tracks.stream().forEach(track -> System.out.println(track));
        Comparator pawerComparator=new MaxPowerCarComparator();
        cars.stream()
                .sorted(pawerComparator)
                //можно добавить еще компаратор
                .forEach(car-> System.out.println(car));
        //Collections.sort(cars);

        Box<String>stringBox=new Box<>("hello");
        System.out.println(stringBox.getT());
        Box<Integer>integerBox=new Box<>(45);
        System.out.println(integerBox.getT());
        List<Box>boxes=new ArrayList<Box>(){{
            add(stringBox);
            add(integerBox);
        }};
        boxes.stream()
                .filter(s->s.getT().equals("hello"))
                .forEach(System.out::println);
    }
}
