package com.example;

import main.java.com.example.List;

public class Main {
    public static void main(String[] args) {
        List list = new List();
        for(int i = 0; i < 5; i++){
            list.addElem(i, i);
        }
        list.printAllElems();
    }
}