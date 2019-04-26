package org.nyu.zoo;

import org.nyu.zoo.json.JsonElement;
import org.nyu.zoo.json.JsonSerializable;

import java.util.Optional;

@JsonSerializable
public class Frog {

    @JsonElement
    private String color = "green";

    @JsonElement
    private String size = "1";

    @JsonElement(key = "limbs")
    private String numberOfLimbs = "4";

    @JsonElement
    private String call = "ribbit!";


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
