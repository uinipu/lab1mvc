package com.labor;

public class Main {
    public static void main(String[] args) {


        Painting model  = retrievePaintingFromDatabase();

        PaintingView view = new PaintingView();

        PaintingController controller = new PaintingController(model, view);

        controller.updateView();
        System.out.println("1234567890oiuhgfghjkiuytr");

        //update model data
        controller.setPaintingName("Girl With The Pearl Earring");
        controller.setPainterName("Vermeer");
        System.out.println("\nAfter updating, Painting Details are as follows");

        controller.updateView();
    }

    private static Painting retrievePaintingFromDatabase(){
        Painting painting = new Painting();
        painting.setName("Marlene Diptych");
        painting.setId("01");
        painting.setPainterName("Andy Warhol");
        return painting;
    }
}
