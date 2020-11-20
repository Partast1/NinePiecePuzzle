package com.example.ninepiecepuzzle;

public class PieceFactory {
    public PuzzlePiece createPiece(String url, float pos){
        return new PuzzlePiece(url,pos);
    }
}
