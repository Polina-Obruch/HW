package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Film> oneList = new ArrayList<>();
        oneList.add(new Film(5));
        oneList.add(new Film(8));
        oneList.add(new Film(2));
        oneList.add(new Film(6));

        System.out.println("Изначальный");
        for (Film film : oneList) {
            System.out.print(film.getId() + " ");
        }
        System.out.println();

        List<Integer> ids = oneList.stream().map(Film::getId).collect(Collectors.toList());

        System.out.println("ids");
        for (Integer id : ids) {
            System.out.print(id + " ");
        }
        System.out.println();

        HashMap<Integer, Film> filmHashMap = oneList.stream().

        Map<Integer, Film> filmMap = oneList.stream().collect
                (Collectors.toMap(Film::getId, film -> film)));

        System.out.println("mapa");
        for (Map.Entry<Integer, Film> filmEntry: filmMap.entrySet()){
            System.out.print(filmEntry.getKey() + " ");
        }
        System.out.println();

        //Вот это дает изменение порядка - т.е. наш return
         List<Film> result = new ArrayList<>(filmMap.values());

        System.out.println("return");
        for (Film film : result) {
            System.out.print(film.getId() + " ");
        }
        System.out.println();

       //List<Film> resultNew = oneList.stream().map(Film::getId).map(filmMap.get()).collect(Collectors.toList());

        List<Film> resultNew = new ArrayList<>();

        for (Integer id: ids) {
            resultNew.add(filmMap.get(id));
        }
        System.out.println("Решение для return");
        for (Film film : resultNew) {
            System.out.print(film.getId() + " ");
        }

        //List<Film> resultNew1 = filmMap.keySet().stream().filter(id).collect(Collectors.toList());




    }
}