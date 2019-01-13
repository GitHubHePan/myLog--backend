package com.imooc.VO;

import javax.validation.constraints.Min;
import lombok.Data;

@Data
public class Page {

  @Min(value = 0,message = "不可为负")
  private Integer pageSize;

  @Min(value = 0,message = "页数不可为负")
  private Integer pageNumber;

}
