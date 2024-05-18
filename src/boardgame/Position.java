package boardgame;

public class Position {
	
	private int row;
	private int column;
	
	public Position(int row, int col) {
		super();
		this.row = row;
		this.column = col;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int col) {
		this.column = col;
	}

	@Override
	public String toString() {
		return row + ", " + column;
	}
	
	
	
}
