package com.bjpowernode.sch;

public class School {
    private String name;
    private String address;

    @Override
    public String toString() {
        return "School{" +
                "学校名字：'" + name + '\'' +
                ", 学校地址：'" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
