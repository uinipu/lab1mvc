package com.labor;

public class Painting {
    private String PaintingName;
    private String PaintingId;
    private String PainterName;

    public String getId() {
        return PaintingId;
    }

    public void setId(String id) {
        this.PaintingId = id;
    }

    public String getName() {
        return PaintingName;
    }

    public void setName(String name) {
        this.PaintingName = name;
    }

    public String getPainterName() {
        return PainterName;
    }

    public void setPainterName(String name) {
        this.PainterName = name;
    }

}
