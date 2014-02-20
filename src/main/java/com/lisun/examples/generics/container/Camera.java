package com.lisun.examples.generics.container;

/**
 * @author Aleksey
 * @since 2/5/14
 */
public class Camera extends Product implements Comparable<Camera> {
    private Integer pixel;

    public Integer getPixel() {
        return pixel;
    }

    public void setPixel(int pixel) {
        this.pixel = pixel;
    }

    @Override
    public int compareTo(Camera o) {
        return (o.getPixel()).compareTo(this.getPixel());
    }
}
