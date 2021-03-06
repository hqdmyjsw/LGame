package org.test;

import loon.LTrans;
import loon.LTransition;
import loon.Screen;
import loon.action.sprite.MovieClip;
import loon.action.sprite.Sprite;
import loon.event.GameTouch;
import loon.opengl.GLEx;
import loon.utils.res.ResourceLocal;
import loon.utils.timer.LTimerContext;

public class MovieClipTest extends Screen {

	@Override
	public LTransition onTransition() {
		return LTransition.newEmpty();
	}

	@Override
	public void draw(GLEx g) {

	}

	@Override
	public void onLoad() {
		
		ResourceLocal res = getResourceConfig("resource.json");
		MovieClip c = new MovieClip(res.getSheet("Monster01json"), 128);
		c.setLoop(true);
		c.setScale(2f, 2f);
		c.setLocation(155, 55);
		c.setTrans(LTrans.TRANS_MIRROR_ROT270);
		add(c);

		MovieClip c2 = new MovieClip(res.getSheet("Monster01json"), 128);
		c2.setLoop(true);
		c2.setLocation(255, 55);
		c2.setScale(2f, 2f);
		c2.setTrans(LTrans.TRANS_MIRROR);
		add(c2);

		MovieClip c3 = new MovieClip(res.getSheet("Monster02json"), 128);
		c3.setLoop(true);
		c3.setLocation(155, 155);
		c3.setScale(2f, 2f);
		add(c3);

		Sprite c4 = new Sprite(res.getSheet("Monster02json"), 255, 155, 128);
		c4.setScale(2f, 2f);
		add(c4);
		

		add(MultiScreenTest.getBackButton(this,0));
	}

	@Override
	public void alter(LTimerContext timer) {

	}

	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void touchDown(GameTouch e) {

	}

	@Override
	public void touchUp(GameTouch e) {

	}

	@Override
	public void touchMove(GameTouch e) {

	}

	@Override
	public void touchDrag(GameTouch e) {

	}

	@Override
	public void resume() {

	}

	@Override
	public void pause() {

	}

	@Override
	public void close() {

	}

}
