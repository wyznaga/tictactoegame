import java.util.Scanner;
import java.util.Random;

public class Game
{
	public static void main(String[] args)
	{
        Scanner scan = new Scanner(System.in);
	    String temporaryFiller;
	    
	    Board boardGame = new Board();
	    
	    System.out.println("Welcome to Tic-Tac-CLI v0.1!");
	    System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
	    System.out.println();
	    System.out.println("What would you like to do?");
	    System.out.println("To initiate a new game, enter 1.");
	    System.out.println("To quit, enter 2.");
	    System.out.print("Plese enter your choice now:      ");
	    
	    byte firstChoice = scan.nextByte();
	    temporaryFiller = scan.nextLine();
	    
	    switch (firstChoice)
	    {
            case 1:
                for (int i = 0; i < 9; i++)
                {
                	byte x, y;
                	if (!(boardGame.hasXWin()) && !(boardGame.hasXWin()))
                	{
                		if (i%2 == 0)
                		{
                			System.out.println("Player One, please enter your move x- and y-coordinate;");
     						System.out.println("For example, 0, ENTER, 0 for the top-right corner");
     						x = scan.nextByte();
     						temporaryFiller = scan.nextLine();
     						y = scan.nextByte();
     						temporaryFiller = scan.nextLine();
     						boardGame.board[x][y] = 'X';
     						System.out.println("Board status:");
     						for (int k = 0; k < 3; k++)
     						{
     							for (int l = 0; l < 3; l++)
     							{
     								System.out.print((char) boardGame.board[k][l]);
     								System.out.print(' ');
     							}
     							System.out.println();
     						}
                		}
                		else
                		{
                			System.out.println("Player Two, please enter your move x- and x-coordinate;");
     						System.out.println("For example, 0, ENTER, 0 for the top-right corner");
     						x = scan.nextByte();
     						temporaryFiller = scan.nextLine();
     						y = scan.nextByte();
     						temporaryFiller = scan.nextLine();
     						boardGame.board[y][x] = 'O';
     						System.out.println("Board status:");
     						for (int k = 0; k < 3; k++)
     						{
     							for (int l = 0; l < 3; l++)
     							{
     								System.out.print((char) boardGame.board[k][l]);
     								System.out.print(' ');
     							}
     							System.out.println();
     						}
                		}
                	}
                	else
                	{
                		if (boardGame.hasXWin())
                		{
                			System.out.println("Player One has won! Congratulations!");
                			System.out.println("Now exiting; please play again!!");
                			System.exit(0);
                		}
                		else if (boardGame.hasOWin())
                		{
                			System.out.println("Player Two has won! Congratulations!");
                			System.out.println("Now exiting; please play again!!");
                			System.exit(0);
                		}
                	}
                }
                System.exit(1);
                break;
            case 2:
	            System.out.print("Thank you for playing Tic-Tac-CLI v0.1! Bye for now ... ");
	            System.out.println();
	            System.exit(0);
	            break;
            default:
                System.out.println("I'm sorry, but your choice was _not_ valid.");
                System.out.println("Please restart this program and try again ... ");
                System.exit(1);
                break;
        }
    }
}
//Property of B3r5t Team Inc.
//CEO - William Yznaga
//COO - Jacob Sarver-Verhey
//Muffin - Ethan Jeffers
