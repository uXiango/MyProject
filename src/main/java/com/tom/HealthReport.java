package com.tom;

import com.tom.Report;

public class HealthReport implements Report {
    @Override
    public void load() {
        System.out.println("Health loading data");
    }

    @Override
    public void print() {
        System.out.println("Health printing data");
    }
}
