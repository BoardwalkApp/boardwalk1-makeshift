package net.zhuoweizhang.makeshift.javax.imageio;

import java.io.*;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import net.zhuoweizhang.makeshift.java.awt.image.BufferedImage;

public class ImageIO {
	public static void setUseCache(boolean set) {
	}

	public static BufferedImage read(InputStream is) throws IOException {
		Bitmap bmp = BitmapFactory.decodeStream(is);
		return makeBufferedImage(bmp);
	}

	public static BufferedImage read(File input) throws IOException {
		Bitmap bmp = BitmapFactory.decodeFile(input.getAbsolutePath());
		return makeBufferedImage(bmp);
	}

	private static BufferedImage makeBufferedImage(Bitmap bmp) {
		// Every one of our BufferedImages is backed with an Android Bitmap
		return new BufferedImage(bmp);
	}
}
