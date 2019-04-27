package com.thoughtworks.nho.olsapi.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.List;

@ApiModel("训练营基本信息类")
public class TrainCampSimpleInfo {

    @ApiModelProperty("id")
    private Long id;
    @ApiModelProperty("名称")
    private String name;
    @ApiModelProperty("类型")
    private String type;
    @ApiModelProperty("简述")
    private String desc;
    @ApiModelProperty("价格")
    private BigDecimal price;
    @ApiModelProperty("课时")
    private Float score;
    @ApiModelProperty("任务卡ids")
    private List<Integer> taskCardIds;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public List<Integer> getTaskCardIds() {
        return taskCardIds;
    }

    public void setTaskCardIds(List<Integer> taskCardIds) {
        this.taskCardIds = taskCardIds;
    }
}
