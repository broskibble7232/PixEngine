/*
 * Copyright (c) 2018.  Created by Ryan Moore
 */

package com.majoolwip.engine.util;

public class PixSettings {

	private String title = "PixEngine";
	private int width = 320, height = 240;
	private float scale = 2.0f;
	private double updateCap = 1.0 / 60.0;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getUpdateCap() {
		return updateCap;
	}

	public void setUpdateCap(double updateCap) {
		this.updateCap = updateCap;
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

	public float getScale() {
		return scale;
	}

	public void setScale(float scale) {
		this.scale = scale;
	}
}