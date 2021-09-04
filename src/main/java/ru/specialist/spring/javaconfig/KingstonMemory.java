package ru.specialist.spring.javaconfig;

public class KingstonMemory implements Memory {
    @Override
    public String getVendor() {
        return "Kingston";
    }
}
