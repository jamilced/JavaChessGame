package pieces;

import game.Square;
import players.PlayerType;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class Knight extends Piece{
    private PlayerType playerType;
    public Knight(PlayerType playerType){
        super(PieceType.Knight, playerType);
    }

    @Override
    public boolean isValidMove(Square initialSquare, Square finalSquare) {
        return (Math.abs(finalSquare.getCoordinate().getY() - initialSquare.getCoordinate().getY()) == 1 &&
                Math.abs(finalSquare.getCoordinate().getX() - initialSquare.getCoordinate().getX()) == 2)
                || (Math.abs(finalSquare.getCoordinate().getY() - initialSquare.getCoordinate().getY()) == 2 &&
                Math.abs(finalSquare.getCoordinate().getX() - initialSquare.getCoordinate().getX()) == 1);
    }

}
