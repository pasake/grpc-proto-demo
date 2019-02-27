package com.sennotech.sennofit.insole.app.sku

import com.google.protobuf.StringValue
import com.sennotech.euler.common.util.logger
import com.sennotech.sennofit.insole.app.sku.generated.CreateSkuRequest
import com.sennotech.sennofit.insole.app.sku.generated.GetSkuRequest
import com.sennotech.sennofit.insole.app.sku.generated.ListSkuRequest
import com.sennotech.sennofit.insole.app.sku.generated.SkuDetail
import org.springframework.stereotype.Service
import javax.annotation.PostConstruct

/**
 * @author 严鸿豪
 * @create 2019-02-20 18:13
 */
@Service
class SkuService(
        private val skuRepository: SkuRepository
) {
    private val log = logger()

    @PostConstruct
    fun initSku() {
        if (skuRepository.count() == 0L) {
            log.info("初始化商品信息")
            val sku1 = SkuEntity(
                    skuName = "SennoFit Sports-迪卡波",
                    oriPrice = 19900,
                    curPrice = 9900,
                    picUrl = "https://insole-1255704943.cos.ap-hongkong.myqcloud.com/production/goods/Tekapo.png"
            )
            val sku2 = SkuEntity(
                    skuName = "SennoFit Sports-罗弗敦",
                    oriPrice = 19900,
                    curPrice = 9900,
                    picUrl = "https://insole-1255704943.cos.ap-hongkong.myqcloud.com/production/goods/Norway.png"
            )
            val sku3 = SkuEntity(
                    skuName = "SennoFit Sports-普罗旺斯",
                    oriPrice = 19900,
                    curPrice = 9900,
                    picUrl = "https://insole-1255704943.cos.ap-hongkong.myqcloud.com/production/goods/Montevideo.png"
            )
            skuRepository.saveAll(arrayListOf(sku1, sku2, sku3))
        }
    }

    fun create(request: CreateSkuRequest): SkuDetail =
            convertToSkuDetail(skuRepository.save(convertToSkuEntity(request)))

    fun list(request: ListSkuRequest?): List<SkuDetail> =
            skuRepository.findAll().map { convertToSkuDetail(it) }

    fun getSku(request: GetSkuRequest): SkuDetail {
        val sku = skuRepository.findById(request.id).orElseThrow {
            Exceptions.SkuNotFound("63f92d77-1dba-4d6c-94ab-52fc17833d18")
        }

        return convertToSkuDetail(sku)
    }

    private fun convertToSkuEntity(request: CreateSkuRequest): SkuEntity {
        return SkuEntity(
                skuName = request.skuName,
                curPrice = request.curPrice,
                oriPrice = request.oriPrice,
                picUrl = request.skuUrl
        )
    }

    private fun convertToSkuDetail(skuEntity: SkuEntity): SkuDetail {
        return SkuDetail.newBuilder()
                .setId(skuEntity.id)
                .setCurPrice(skuEntity.curPrice)
                .setOriPrice(skuEntity.oriPrice)
                .setPicUrl(skuEntity.picUrl)
                .setDesc(StringValue.of(skuEntity.desc ?: ""))
                .setSkuName(skuEntity.skuName)
                .build()
    }
}