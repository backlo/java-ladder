package laddergame.domain.ladder;

public class Point {
	static final Point CONNECT = new Point(true);
	static final Point DISCONNECT = new Point(false);

	private final boolean hasBridge;

	private Point(final boolean hasBridge) {
		this.hasBridge = hasBridge;
	}

	public boolean hasBridge() {
		return this.hasBridge;
	}
}
