package com.laijiantian.zce.test.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.laijiantian.common.utils.PageUtils;
import com.laijiantian.zce.test.entity.ParticipationEntity;

import java.util.Map;

/**
 * 
 *
 * @author laijiantian
 * @email 872286055@qq.com
 * @date 2021-03-27 17:58:33
 */
public interface ParticipationService extends IService<ParticipationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
