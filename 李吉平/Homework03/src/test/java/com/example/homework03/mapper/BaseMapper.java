package com.example.homework03.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.sql.Wrapper;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface BaseMapper {
    int insert(T entity);
    // 根据 entity 条件，删除记录
    int delete(@Param(Constants.WRAPPER) Wrapper wrapper);
    // 删除（根据ID 批量删除）
    int deleteBatchIds(@Param(Constants.COLLECTION) Collection<? extends
                Serializable> idList);
    // 根据 ID 删除
    int deleteById(Serializable id);
    // 根据 columnMap 条件，删除记录
    int deleteByMap(@Param(Constants.COLUMN_MAP) Map<String, Object> columnMap);
    // 根据 whereWrapper 条件，更新记录
    int update(@Param(Constants.ENTITY) T updateEntity, @Param(Constants.WRAPPER)
    Wrapper<T> whereWrapper);
    // 根据 ID 修改
    int updateById(@Param(Constants.ENTITY) T entity);
    // 根据 ID 查询
    T selectById(Serializable id);
    // 根据 entity 条件，查询一条记录
    T selectOne(@Param(Constants.WRAPPER) Wrapper<T> queryWrapper);
    // 查询（根据ID 批量查询）
    List<T> selectBatchIds(@Param(Constants.COLLECTION) Collection<? extends
            Serializable> idList);
    // 根据 entity 条件，查询全部记录
    List<T> selectList(@Param(Constants.WRAPPER) Wrapper<T> queryWrapper);
    // 查询（根据 columnMap 条件）
    List<T> selectByMap(@Param(Constants.COLUMN_MAP) Map<String, Object> columnMap);
    // 根据 Wrapper 条件，查询全部记录
    List<Map<String, Object>> selectMaps(@Param(Constants.WRAPPER) Wrapper<T>
                                                 queryWrapper);
    // 根据 Wrapper 条件，查询全部记录。注意： 只返回第一个字段的值
    List<Object> selectObjs(@Param(Constants.WRAPPER) Wrapper<T> queryWrapper);
    // 根据 entity 条件，查询全部记录（并翻页）
    IPage<T> selectPage(IPage<T> page, @Param(Constants.WRAPPER) Wrapper<T>
            queryWrapper);
    // 根据 Wrapper 条件，查询全部记录（并翻页）
    IPage<Map<String, Object>> selectMapsPage(IPage<T> page,
                                              @Param(Constants.WRAPPER) Wrapper<T> queryWrapper);
    // 根据 Wrapper 条件，查询总记录数
    Integer selectCount(@Param(Constants.WRAPPER) Wrapper<T> queryWrapper);

    class T {
    }
}
