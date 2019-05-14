package com.site.videostation.dao;

import com.site.videostation.domain.VideoUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface VideoUserDao {
	
	@Select("select * from video_user where name = #{name}")
	public VideoUser getById(@Param("name")long id);


}
