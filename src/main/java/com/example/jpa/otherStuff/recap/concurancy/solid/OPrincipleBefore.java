package com.example.jpa.otherStuff.recap.concurancy.solid;
//
public class OPrincipleBefore {

}


class DrawingService {
    public void drawShape(String type, int x, int y) {
        if (type.equals("circle")) {
            System.out.println("Drawing Circle at(" + x + " , " + y + ") ");
        } else if (type.equals("rectangle")) {
            System.out.println("Drawing Rectangle at(" + x + " , " + y + ") ");
        } else if (type.equals("triangle")) {
            System.out.println("Drawing Triangle at(" + x + " , " + y + ") ");
        }
    }
}
