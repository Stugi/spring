package ru.specialist.spring.xml;

public class StaticCPUFactory {

    public static CPU createCPU(String name){
        if ("intel".equalsIgnoreCase(name)){
            return new IntelCPU();
        } else if ("amd".equalsIgnoreCase(name)){
            return new AmdCpu();
        } else {
            return () -> "Default";
        }
    }

}
