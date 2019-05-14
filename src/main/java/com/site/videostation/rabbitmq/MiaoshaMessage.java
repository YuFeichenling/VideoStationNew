package com.site.videostation.rabbitmq;

import com.site.videostation.domain.VideoUser;

public class MiaoshaMessage {
	private VideoUser user;
	private long goodsId;
	public VideoUser getUser() {
		return user;
	}
	public void setUser(VideoUser user) {
		this.user = user;
	}
	public long getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(long goodsId) {
		this.goodsId = goodsId;
	}
}
