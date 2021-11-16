package com.dsa.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class UsingMaps {
    public static void main(String[] a){
        System.out.println("HASHMAP \n _______________");
        UsingHashMap maps = new UsingHashMap();
        maps.addValues();
        maps.readValues();
        maps.readyByEntrySet();

        System.out.println("\nTREEMAP \n _______________");
        UsingTreeMap treeMap = new UsingTreeMap();
        treeMap.addValues();
        treeMap.readValues();
        treeMap.readyByEntrySet();
    }
}

class UsingHashMap{
    Map<String,Integer> map = new HashMap<>();

    public void addValues(){
        map.put("age",18);
        map.put("salary",180000);
        map.put("height",18);
    }

    public void readValues(){
        for (String key:map.keySet()) {
            System.out.println(key+" -> "+map.get(key));
        }
    }

    public void readyByEntrySet(){
        for (Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
    }
}

class UsingTreeMap{
    Map<String,Integer> map = new TreeMap<>();
    public void addValues(){
        map.put("age",18);
        map.put("salary",180000);
        map.put("height",18);
    }
    public void readValues(){
        for (String key:map.keySet()) {
            System.out.println(key+" -> "+map.get(key));
        }
    }

    public void readyByEntrySet(){
        for (Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
    }
}
