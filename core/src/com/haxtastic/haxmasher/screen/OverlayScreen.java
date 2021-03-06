/*
Copyright 2014 Magnus Bridén

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package com.haxtastic.haxmasher.screen;

import com.haxtastic.haxmasher.Constants;
import com.haxtastic.haxmasher.Haxmasher;
import com.haxtastic.haxmasher.Haxput;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class OverlayScreen extends Screen {
	private float x = 0.1f;
	private float y = 0.25f;
	
	public OverlayScreen(Haxmasher haxmasher) {
	}
	
	@Override
	public void tick(float dt, Haxput input) {
	}
	
	@Override
	public void render(float dt) {
		batch.setProjectionMatrix(camera.combined);
		batch.begin();
		font.setColor(0, 0, 0, 1);
		String msg = "Haxtastic gaming by mAgz 2014";
		font.draw(batch, msg, x*Constants.PIXELS_PER_METER_X, y*Constants.PIXELS_PER_METER_Y);
		batch.end();
	}
	
	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void show() {
	}

	@Override
	public void hide() {
		//batch.end();
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}

	@Override
	public void dispose() {
	}

	@Override
	public void render(float dt, SpriteBatch b, BitmapFont f) {
		// TODO Auto-generated method stub
		
	}

}

