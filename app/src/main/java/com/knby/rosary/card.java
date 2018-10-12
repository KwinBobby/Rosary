package com.knby.rosary;

/**
 * Created by Kevin on 2/22/2017.
 */

public class card {

    private String heading;
    private String description;
    private int drawingID;

    public int getDrawingID() {
        return drawingID;
    }

    public String getDescription() {
        return description;
    }

    public String getHeading() {
        return heading;
    }

    public card(String heading, String description, int drawingID) {
        this.heading = heading;
        this.drawingID = drawingID;
        this.description = description;
    }
}
