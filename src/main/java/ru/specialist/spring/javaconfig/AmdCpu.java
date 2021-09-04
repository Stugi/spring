package ru.specialist.spring.javaconfig;

public class AmdCpu implements CPU {

    @Override
    public String getVendor() {
        return "AMD";
    }

}
