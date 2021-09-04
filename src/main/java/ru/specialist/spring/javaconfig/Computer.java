package ru.specialist.spring.javaconfig;

import java.util.List;
import java.util.stream.Collectors;

public class Computer {

    private CPU cpu;
    private Screen screen;

    private List<Memory> memoryList;
    private List<Storage> storageList;

    public Computer(){}

    public Computer(CPU cpu) {
        this.cpu = cpu;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public List<Memory> getMemoryList() {
        return memoryList;
    }

    public void setMemoryList(List<Memory> memoryList) {
        this.memoryList = memoryList;
    }

    public Screen getScreen() {
        return screen;
    }

    public List<Storage> getStorageList() {
        return storageList;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public void setStorageList(List<Storage> storageList) {
        this.storageList = storageList;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu=" + cpu.getVendor() +
                ", memoryList=" + memoryList.stream()
                                            .map(Device::getVendor)
                                            .collect(Collectors.toList()) +
                ", screen=" + screen.getVendor()+
                ", storageList=" + storageList.stream()
                                                .map(Device::getVendor)
                                                .collect(Collectors.toList()) +
                '}';
    }
}
