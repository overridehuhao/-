package miaoshaproject.service;

import miaoshaproject.service.model.PromoModel;

/**
 * Created by asus on 2019/3/16.
 */
public interface PromoService {

    //根据itemId获取即将进行的或正在进行的秒杀活动
    PromoModel getPromoByItemId(Integer itemId);
}
