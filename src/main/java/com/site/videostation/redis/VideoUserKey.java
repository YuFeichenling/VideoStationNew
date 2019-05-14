package com.site.videostation.redis;

public class VideoUserKey extends BasePrefix{

	public static final int TOKEN_EXPIRE = 5;
	private VideoUserKey(int expireSeconds, String prefix) {
		super(expireSeconds, prefix);
	}
	public static VideoUserKey token = new VideoUserKey(TOKEN_EXPIRE, "tk");
	public static VideoUserKey getById = new VideoUserKey(0, "id");
}
