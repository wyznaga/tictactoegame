import java.util.Arrays;

public class Board
{
    public char[][] board = {{'_','_','_'},{'_','_','_'},{'_','_','_'}};
    
    private boolean isAnXWin = false;
    private boolean isAnOWin = false;
    
    public char[][] getBoard()
    {
        return this.board;
    }
    
    public void setBoard(char[][] boardIn)
    {
        this.board = boardIn;
    }
    
    public boolean hasXWin()
    {
        char[] rowOfX = {'X', 'X', 'X'};
        if (Arrays.equals(rowOfX, this.board[0]))
        {
            isAnXWin = true;
        }
        else if (Arrays.equals(rowOfX, this.board[1]))
        {
            isAnXWin = true;
        }
        else if (Arrays.equals(rowOfX, this.board[2]))
        {
            isAnXWin = true;
        }
        else if ((this.board[0][0] == 'X' && this.board[1][0] == 'X' && this.board[2][0] == 'X'))
        {
            isAnXWin = true;
        }
        else if ((this.board[0][1] == 'X' && this.board[1][1] == 'X' && this.board[2][1] == 'X'))
        {
            isAnXWin = true;
        }
        else if ((this.board[0][2] == 'X' && this.board[1][2] == 'X' && this.board[2][2] == 'X'))
        {
            isAnXWin = true;
        }
        else if ((this.board[0][0] == 'X' && this.board[1][1] == 'X' && this.board[2][2] == 'X'))
        {
            isAnXWin = true;
        }
        else if ((this.board[0][2] == 'X' && this.board[1][1] == 'X' && this.board[2][0] == 'X'))
        {
            isAnXWin = true;
        }
        else
        {
            isAnXWin = false;
        }
        return isAnXWin;
    }
    
    public boolean hasOWin()
    {
        char[] rowOfO = {'O', 'O', 'O'};
        if (Arrays.equals(rowOfO, this.board[0]))
        {
            isAnOWin = true;
        }
        else if (Arrays.equals(rowOfO, this.board[1]))
        {
            isAnOWin = true;
        }
        else if (Arrays.equals(rowOfO, this.board[2]))
        {
            isAnOWin = true;
        }
        else if ((this.board[0][0] == 'O' && this.board[1][0] == 'O' && this.board[2][0] == 'O'))
        {
            isAnOWin = true;
        }
        else if ((this.board[0][1] == 'O' && this.board[1][1] == 'O' && this.board[2][1] == 'O'))
        {
            isAnOWin = true;
        }
        else if ((this.board[0][2] == 'O' && this.board[1][2] == 'O' && this.board[2][2] == 'O'))
        {
            isAnOWin = true;
        }
        else if ((this.board[0][0] == 'O' && this.board[1][1] == 'O' && this.board[2][2] == 'O'))
        {
            isAnOWin = true;
        }
        else if ((this.board[0][2] == 'O' && this.board[1][1] == 'O' && this.board[2][0] == 'O'))
        {
            isAnOWin = true;
        }
        else
        {
            isAnOWin = false;
        }
        return isAnOWin;
    }
}
