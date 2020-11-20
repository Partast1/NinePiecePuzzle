package com.example.ninepiecepuzzle;

import java.util.ArrayList;
import java.util.List;

public class PuzzleHandler {
    List<PuzzlePiece> pieces = new ArrayList<>();

    //Creates new pieces and populate the board
    public void populateBoard(int piecesNum){
        PieceFactory pieceFactory = new PieceFactory();
        int pieceValue = 1;
        for (int i = 0; i < piecesNum;i++){
            PuzzlePiece piece = pieceFactory.createPiece(String.valueOf(pieceValue));
            pieceValue++;
            pieces.add(piece);
        }
    }
    //Gets a specific puzzlepiece and a piece to swap with
    public void SwapPieces(PuzzlePiece selectedPiece, PuzzlePiece targetPiece){

    }
    //Resets game
    public void ResetBoard(){

    }
}
