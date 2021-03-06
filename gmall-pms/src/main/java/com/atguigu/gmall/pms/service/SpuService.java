package com.atguigu.gmall.pms.service;

import com.atguigu.gmall.pms.vo.SpuVo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.pms.entity.SpuEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author kunkun
 * @email kunkun@atguigu.com
 * @date 2020-12-14 22:48:37
 */
public interface SpuService extends IService<SpuEntity> {

    PageResultVo queryPage(PageParamVo paramVo);


    PageResultVo querySpuByCidAndPage(Long cid, PageParamVo paramVo);

    void bigSave(SpuVo spuVo);
}

