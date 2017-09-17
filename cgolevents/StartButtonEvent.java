package cgolevents;

import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class StartButtonEvent extends ActionEvent {

	private int width;
	private int height;
	private int countOfBeings;
	
	public StartButtonEvent(JButton button, int arg1, String name, int width, int height, int countOfBeings) {
		super((Object)button, arg1, name);
		this.width = width;
		this.height = height;
		this.countOfBeings = countOfBeings;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getCountOfBeings() {
		return countOfBeings;
	}

	public void setCountOfBeings(int countOfBeings) {
		this.countOfBeings = countOfBeings;
	}

}
