/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.itemlistbackend;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jojow
 */
@XmlRootElement
public class Item {

    private int id;
    private String name;
    private float price;
    private int count;

    public Item(int i, String n, float p) {
        id = i;
        name = n;
        price = p;
        count = 0;
    }

    public Item() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
