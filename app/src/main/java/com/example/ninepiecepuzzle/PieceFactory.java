package com.example.ninepiecepuzzle;

public class PieceFactory {
    public PuzzlePiece createPiece(String url){
        return new PuzzlePiece(url);
    }
}
