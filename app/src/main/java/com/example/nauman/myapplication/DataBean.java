package com.example.nauman.myapplication;

/**
 * Created by nauman on 17-Dec-17.
 */

public class DataBean {
    String question, option1, option2, option3, option4;
    public static int NONE = 1111;
    public static int OPTION_1 = 0;
    public static int OPTION_2 = 1;
    public static int OPTION_3 = 2;
    public static int OPTION_4 = 3;
    public int current = NONE;
    DataBean(String que, String opt1, String opt2, String opt3, String opt4) {
        question = que;
        option1 = opt1;
        option2 = opt2;
        option3 = opt3;
        option4 = opt4;
    }
}

