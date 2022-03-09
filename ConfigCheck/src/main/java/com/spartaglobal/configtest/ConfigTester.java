package com.spartaglobal.configtest;

public class ConfigTester {

    public static void main(String[] args) {
        ConfigTester ct = new ConfigTester();
        System.out.println(ct.getMessage("Jamal"));
    }

    public String getMessage(String name) {
        return "Welcome to sparta " + name + "!";
    }

}
