package ru.specialist.spring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        System.out.println("Beans: " + Arrays.toString(ctx.getBeanDefinitionNames()));

        Computer computer = ctx.getBean(Computer.class);
        System.out.println(computer);
    }
}
