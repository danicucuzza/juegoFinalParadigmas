package juego;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class NameWinniLeven {


	private int posicionX;
	private int posicionY;
	private Font font;
	private Color color;

	public NameWinniLeven(int posicionX, int posicionY, Font font, Color color, int vidas) {
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		this.font = font;
		this.color = color;

	}
	public void dibujarse(Graphics g) {
		g.setColor(color);
		g.setFont(font);
		g.drawString("Winni Leven MESSA VS. ROLANDO", posicionX, posicionY);
	}

}
