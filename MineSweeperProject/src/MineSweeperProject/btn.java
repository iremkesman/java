package MineSweeperProject;

import javax.swing.JButton;

public class btn extends JButton{
	
	private int col, row, count;
	private boolean mine, flag;
	
	public btn(int row, int col)
	{
		this.col=col;
		this.row=row;
		this.count=0;
		this.flag=false;
		this.mine=false;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public boolean isMine() {
		return mine;
	}

	public void setMine(boolean mine) {
		this.mine = mine;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
