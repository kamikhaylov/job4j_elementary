package ru.job4j.stream.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class EasyStream {
    private List<Integer> list;
    private ArrayList<Integer> result;

    private EasyStream(List<Integer> list) {
        this.list = list;
    }

    public static EasyStream of(List<Integer> source) {
        return new EasyStream(source);
    }

    public EasyStream map(Function<Integer, Integer> fun) {
        result = new ArrayList<>();
        for (Integer integer : list) {
            result.add(fun.apply(integer));
        }
        return new EasyStream(result);
    }

    public EasyStream filter(Predicate<Integer> fun) {
        result = new ArrayList<>();
        for (Integer integer : list) {
            if (fun.test(integer)) {
                result.add(integer);
            }
        }
        return new EasyStream(result);
    }

    public List<Integer> collect() {
        return list;
    }
}