package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class CategoryVo {

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private int categoryType;

    @JsonProperty("foods")
    private List<ProductVo> productVoList;

}
