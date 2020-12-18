package com.atguigu.gmall.pms.mapper;

import com.atguigu.gmall.pms.entity.CommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 * 
 * @author kunkun
 * @email kunkun@atguigu.com
 * @date 2020-12-14 22:48:36
 */
@Mapper
public interface CommentMapper extends BaseMapper<CommentEntity> {
	
}
