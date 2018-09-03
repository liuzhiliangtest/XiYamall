package com.atguigu.bean;

import java.util.ArrayList;

/**
 * @author liuzhiliang
 * @create 2018-09-03 8:55
 */
public class Teacher {
    public static void main(String[] args) {
        ArrayList<Student> objects = new ArrayList<Student>();
        System.out.println("我是C");
        System.out.println("我是A");
        System.out.println("我是e");
        System.out.println("我是B");
        Teacher teacher = new Teacher();
        doStudent("中国", 18);
        teacher.ceshiMethod("韩国");


    }

    //这是一个method方法
    /*
    param:zhongguo

     */
    public static void doStudent(String name, int age) {
        System.out.println("学生的姓名:" + name + " 年龄:" + age);
    }

    public String ceshiMethod(String name) {
        System.out.println("name" + name);
        return name;
    }

}

