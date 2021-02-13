package MineSweeperProject;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

public class MineSweeper implements MouseListener{
	JFrame frame;
	int openButton=0;
	
	btn[][] board=new btn[10][10];
	
	public MineSweeper()
	{
		frame=new JFrame("Mine Sweeper");
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(10,10));
		
		for(int row=0; row<board.length; row++)
		{
			for(int col=0; col<board[0].length; col++)
			{
				btn b=new btn(row,col);
				frame.add(b);
				b.addMouseListener(this);
				board[row][col]=b;
			}
		}
		generateMine();
		updateCount();
		//print();
		
		frame.setVisible(true);

	}
	
	public void generateMine()
	{
		int i=0;
		while(i<10)
		{
			int randRow=(int) (Math.random()*board.length);
			int randCol=(int) (Math.random()*board[0].length);
			
			while(board[randRow][randCol].isMine())
			{
				randRow=(int) (Math.random()*board.length);
				randCol=(int) (Math.random()*board[0].length);
			}
			
			board[randRow][randCol].setMine(true);
			i++;
		}
	}
	
	public void print()
	{
		for(int row=0; row<board.length; row++)
		{
			for(int col=0; col<board[0].length; col++)
			{
				if(board[row][col].isMine())
				{
					Image img2 = new ImageIcon(MineSweeper.class.getResource("/mine.png")).getImage();
					board[row][col].setIcon(new ImageIcon(img2));
				}
				else
				{
					board[row][col].setText(board[row][col].getCount()+"");
					board[row][col].setEnabled(false);
				}
			}
		}
	}
	
	public void updateCount()
	{
		for(int row=0; row<board.length;row++)
		{
			for(int col=0; col<board[0].length; col++)
			{
				if(board[row][col].isMine())
				{
					counting(row,col);
				}
			}
		}
	}
	
	public void counting(int row, int col)
	{
		for(int i=row-1; i<=row+1; i++)
		{
			for(int j=col-1;j<=col+1; j++)
			{
				try 
				{
					int value=board[i][j].getCount();
					board[i][j].setCount(++value);
				}
				catch(Exception e)
				{
				}
			}
		}
	}
	
	public void open(int r, int c)
	{
		if(r<0|| r>=board.length|| c<0 || c>=board[0].length|| board[r][c].getText().length()>0|| board[r][c].isEnabled()==false)
		{
			return;
		}
		else if(board[r][c].getCount() !=0)
		{
			openButton++;
			board[r][c].setText(board[r][c].getCount()+"");
			board[r][c].setEnabled(false);
		}
		else
		{
			openButton++;
			board[r][c].setEnabled(false);
			open(r-1,c);
			open(r+1,c);
			open(r,c-1);
			open(r,c+1);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		btn b = (btn) e.getComponent();
		if(e.getButton()==3)
		{
			if(!b.isFlag())
			{
				Image img = new ImageIcon(MineSweeper.class.getResource("/flagicon.png")).getImage();
				b.setIcon(new ImageIcon(img));
				
				b.setFlag(true);
			}
			else
			{
				b.setIcon(null);
				b.setFlag(false);
			}
		}
		else if(e.getButton()==1)
		{
			if(b.isMine())
			{
				JOptionPane.showMessageDialog(frame, "GAME OVER!!");
				print();
			}
			else
			{
				open(b.getRow(),b.getCol());
				if(openButton==board.length*board[0].length-10)
				{
					JOptionPane.showMessageDialog(frame, "!!!YOU WIN!!!");
				}
				
			}
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
		/*btn b = (btn) e.getComponent();
		if(b.isMine())
		{
			b.setText("m");
		}
		
		else
		{
			b.setText(board[b.getRow()][b.getCol()].getCount()+"");
		}*/
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
		/*btn b = (btn) e.getComponent();
		if(b.isMine())
		{
			b.setText(null);
		}
		
		else
		{
			b.setText(null);
		}*/
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
