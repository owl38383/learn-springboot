package com.aquiver.learnweb.demo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

/**
 * @Classname Java
 * @Description 描述
 * @Date 2021/3/16 10:59
 * @Author 刁闯
 */

public class Java {
    public static void main(String[] args) {
        Map<String, Object> stringObjectSortedMap = new ConcurrentSkipListMap<>();
        HashSet<Integer> integers = new HashSet<>();
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
}
