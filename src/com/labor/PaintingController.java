package com.labor;

public class PaintingController {
    private Painting model;
    private PaintingView view;

    public PaintingController(Painting model, PaintingView view){
        this.model = model;
        this.view = view;
    }

    public void setPaintingName(String name){
        model.setName(name);
    }

    public String getPaintingName(){
        return model.getName();
    }

    public void setPaintingId(String id){
        model.setId(id);
    }

    public String getPaintingId(){
        return model.getId();
    }

    public void setPainterName(String category){
        model.setPainterName(category);
    }

    public String getPainterName(){
        return model.getPainterName();
    }
    public void updateView(){
        view.printPaintingInfo(model.getName(), model.getId(), model.getPainterName());
    }
}
