package ru.netology.domain;

import java.util.Objects;

public class Smartphone extends Product {
    private String producer;


    public Smartphone(int id, String name, int price, String producer) {
        super(id, name, price);
        this.producer = producer;
    }
public Smartphone() {

}
    public String getProducer() {
        return producer;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Smartphone that = (Smartphone) o;
        return Objects.equals(producer, that.producer);
    }


    @Override
    public String toString() {
        return "Smartphone{" +
                "producer='" + producer + '\'' +
                '}';
    }
}