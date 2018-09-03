package com.atguigu.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuzhiliang
 * @create 2018-09-03 11:19
 */
public class TemplateTest {
    public static void main(String[] args) {
        System.out.println("");
        List list = new ArrayList<>();
        list.add("zhongguo");
        list.add("mongo");
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
