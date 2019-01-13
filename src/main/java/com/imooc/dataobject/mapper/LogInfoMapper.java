package com.imooc.dataobject.mapper;

import com.imooc.dataobject.LogInfo;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface LogInfoMapper {
  @Select("select * from log_info")
   List<LogInfo> selectAll();

  @Insert("insert into log_info(log_data,is_edit,log_picture) "
      + "values (#{log_data, jdbcType=VARCHAR},#{is_edit, jdbcType=TINYINT},"
      + "#{log_picture, jdbcType=VARCHAR})")
   int insertByMap(Map<String,Object> map);



  @Insert("insert into log_info(log_data,is_edit,log_picture)"
      + " values (#{log_data, jdbcType=VARCHAR},#{is_edit, jdbcType=TINYINT},"
      + "#{log_picture, jdbcType=VARCHAR})")
  int insertByObj(LogInfo loginfo);

  @Select("select * from log_info  where create_time BETWEEN #{start} AND #{end}")
  List<LogInfo> selectByDate(@Param ("start") String start,
                             @Param("end") String end);

  @Update("update log_info set log_data = #{log_data}, is_edit = 1 ,log_picture = #{log_picture} where user_id= #{user_id} and date(regdate) = curdate();")
  int updateByObj(LogInfo loginfo);
}
