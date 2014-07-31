package net.zhuoweizhang.makeshift.java.awt.image;

import android.graphics.Bitmap;

public class BufferedImage {
	private Bitmap bitmap;
	public BufferedImage(Bitmap bitmap) {
		this.bitmap = bitmap;
	}

	public int getWidth() {
		return bitmap.getWidth();
	}

	public int getHeight() {
		return bitmap.getHeight();
	}

	public int[] getRGB(int startX, int startY, int w, int h, int[] rgbArray, int offset, int scansize) {
		if (rgbArray == null) {
			rgbArray = new int[offset + (scansize * h)];
		}
		bitmap.getPixels(rgbArray, offset, scansize, startX, startY, w, h);
		return rgbArray;
	}
}
