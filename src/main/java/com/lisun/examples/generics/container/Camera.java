package com.lisun.examples.generics.container;

/**
 * @author Aleksey
 * @since 2/5/14
 */
public class Camera implements Comparable<Camera> {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Camera camera = (Camera) o;

        return !(pixel != null ? !pixel.equals(camera.pixel) : camera.pixel != null);

    }

}
