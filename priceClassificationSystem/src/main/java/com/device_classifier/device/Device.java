package com.device_classifier.device;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "devices")
public class Device {
    // Variables with specified types
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int battery_power;
    private boolean blue;
    private float clock_speed;
    private boolean dual_sim;
    private int fc;
    private boolean four_g;
    private int int_memory;
    private float m_dep;
    private int mobile_wt;
    private int n_cores;
    private int pc;
    private int px_height;
    private int px_width;
    private int ram;
    private int sc_h;
    private int sc_w;
    private int talk_time;
    private boolean three_g;
    private boolean touch_screen;
    private boolean wifi;
    private int price_range;

    // Default constructor
    public Device() {
    }

    // Getters
    public int getId() {
        return id;
    }

    public int getBattery_power() {
        return battery_power;
    }

    public boolean isBlue() {
        return blue;
    }

    public float getClock_speed() {
        return clock_speed;
    }

    public boolean isDual_sim() {
        return dual_sim;
    }

    public int getFc() {
        return fc;
    }

    public boolean isFour_g() {
        return four_g;
    }

    public int getInt_memory() {
        return int_memory;
    }

    public float getM_dep() {
        return m_dep;
    }

    public int getMobile_wt() {
        return mobile_wt;
    }

    public int getN_cores() {
        return n_cores;
    }

    public int getPc() {
        return pc;
    }

    public int getPx_height() {
        return px_height;
    }

    public int getPx_width() {
        return px_width;
    }

    public int getRam() {
        return ram;
    }

    public int getSc_h() {
        return sc_h;
    }

    public int getSc_w() {
        return sc_w;
    }

    public int getTalk_time() {
        return talk_time;
    }

    public boolean isThree_g() {
        return three_g;
    }

    public boolean isTouch_screen() {
        return touch_screen;
    }

    public boolean isWifi() {
        return wifi;
    }

    public int getPrice_range() {
        return price_range;
    }

    // Setters
    public void setBattery_power(int battery_power) {
        this.battery_power = battery_power;
    }

    public void setBlue(boolean blue) {
        this.blue = blue;
    }

    public void setClock_speed(float clock_speed) {
        this.clock_speed = clock_speed;
    }

    public void setDual_sim(boolean dual_sim) {
        this.dual_sim = dual_sim;
    }

    public void setFc(int fc) {
        this.fc = fc;
    }

    public void setFour_g(boolean four_g) {
        this.four_g = four_g;
    }

    public void setInt_memory(int int_memory) {
        this.int_memory = int_memory;
    }

    public void setM_dep(float m_dep) {
        this.m_dep = m_dep;
    }

    public void setMobile_wt(int mobile_wt) {
        this.mobile_wt = mobile_wt;
    }

    public void setN_cores(int n_cores) {
        this.n_cores = n_cores;
    }

    public void setPc(int pc) {
        this.pc = pc;
    }

    public void setPx_height(int px_height) {
        this.px_height = px_height;
    }

    public void setPx_width(int px_width) {
        this.px_width = px_width;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setSc_h(int sc_h) {
        this.sc_h = sc_h;
    }

    public void setSc_w(int sc_w) {
        this.sc_w = sc_w;
    }

    public void setTalk_time(int talk_time) {
        this.talk_time = talk_time;
    }

    public void setThree_g(boolean three_g) {
        this.three_g = three_g;
    }

    public void setTouch_screen(boolean touch_screen) {
        this.touch_screen = touch_screen;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public void setPrice_range(int price_range) {
        this.price_range = price_range;
    }
}
