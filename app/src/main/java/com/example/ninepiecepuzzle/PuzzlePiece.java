package com.example.ninepiecepuzzle;

public class PuzzlePiece {
    private String url;
    private float position;

    //Getters
    public String getUrl() {
        return url;
    }
    public float getPosition() {
        return position;
    }
    //Setters

    public void setUrl(String url) {
        url = url;
    }
    public void setPosition(float position) {
        this.position = position;
    }

    public PuzzlePiece(String url) {
        setUrl(url);

    }
}
