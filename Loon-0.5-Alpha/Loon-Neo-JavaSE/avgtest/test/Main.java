package test;

import loon.LSetting;
import loon.javase.Loon;

public class Main {

	public static void main(String[]args) {
		LSetting setting = new LSetting();
		setting.width = 480;
		setting.height = 320;
		setting.fps = 60;
		setting.isFPS = true;
		setting.fontName = "黑体";
		setting.isLogo = false;
		Loon.register(setting, TitleScreen.class);
	}


}