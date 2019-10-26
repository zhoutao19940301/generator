package com.zmm.generator.dao;

import com.zmm.generator.entity.Dict;
import java.util.List;

public interface DictMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Dict record);

    Dict selectByPrimaryKey(Integer id);

    List<Dict> selectAll();

    int updateByPrimaryKey(Dict record);
}