package ru.specialist.spring.javaconfig;

public class IntelCPU implements CPU {
    @Override
    public String getVendor() {
        return "Intel";
    }

}
