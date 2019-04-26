package org.nyu.zoo;

import org.nyu.zoo.json.Init;
import org.nyu.zoo.json.JsonElement;
import org.nyu.zoo.json.JsonSerializable;

import java.util.Optional;

@JsonSerializable
public class Frog {

    @JsonElement
    private String color;

    @JsonElement(key = "limbs")
    private String numberOfLimbs;

    @JsonElement
    private String call;

    // @JsonElement
    private String size;

    public Frog(String color, String size, String numberOfLimbs, String call) {
        this.color = color;
        this.size = size;
        this.numberOfLimbs = numberOfLimbs;
        this.call = call;
    }

    @Init
    private void initCall() {
        this.call = this.call.toUpperCase();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getNumberOfLimbs() {
        return numberOfLimbs;
    }

    public void setNumberOfLimbs(String numberOfLimbs) {
        this.numberOfLimbs = numberOfLimbs;
    }

    public Optional<String> call() {
        return Optional.of(call);
    }

    public void setCall(String call) {
        this.call = call;
    }
}
