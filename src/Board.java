public class Board
{
    private char[][] board = {{'_','_','_'},{'_','_','_'},{'_','_','_'}};
    
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
        if (board[0] == {'X','X','X'} || board[0] == {'O','O','O'})
        {
            isAnXWin = true;
        }
        else if (board[1] == {'X','X','X'} || board[0] == {'O','O','O'})
        {
            isAnXWin = true;
        }
        else if (board[2] == {'X','X','X'} || board[0] == {'O','O','O'})
        {
            isAnXWin = true;
        }
        else if ((board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X'))
        {
            isAnXWin = true;
        }
        else if ((board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X'))
        {
            isAnXWin = true;
        }
        else if ((board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X'))
        {
            isAnXWin = true;
        }
        else if ((board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X'))
        {
            isAnXWin = true;
        }
        else if ((board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X'))
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
        if (board[0] == {'O','O','O'})
        {
            isAnOWin = true;
        }
        else if (board[1] = {'O','O','O'})
        {
            isAnOWin = true;
        }
        else if (board[2] == {'O','O','O'})
        {
            isAnOWin = true;
        }
        else if ((board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O'))
        {
            isAnOWin = true;
        }
        else if ((board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O'))
        {
            isAnOWin = true;
        }
        else if ((board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O'))
        {
            isAnOWin = true;
        }
        else if ((board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O'))
        {
            isAnOWin = true;
        }
        else if ((board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O'))
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
