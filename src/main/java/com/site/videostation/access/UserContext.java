package com.site.videostation.access;

import com.site.videostation.domain.VideoUser;

public class UserContext {
	
	private static ThreadLocal<VideoUser> userHolder = new ThreadLocal<VideoUser>();
	
	public static void setUser(VideoUser user) {
		userHolder.set(user);
	}
	
	public static VideoUser getUser() {
		return userHolder.get();
	}

}
