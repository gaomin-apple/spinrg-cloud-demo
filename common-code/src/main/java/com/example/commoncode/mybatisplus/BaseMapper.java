package com.example.commoncode.mybatisplus;

import com.baomidou.mybatisplus.core.mapper.Mapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @Auther: min gao
 * @Date: 2023/5/7 17:26
 * @Description:
 */
public interface BaseMapper<T> extends Mapper<T> {
    /**
     * 插入一条记录
     *
     * @param entity 实体对象
     * @return 插入成功记录数
     */
    int insert(T entity);

    /**
     * 根据 ID 删除一条记录
     *
     * @param id 主键ID
     * @return 删除成功记录数
     */
    int deleteById(Serializable id);

    /**
     * 删除（根据ID 批量删除）
     *
     * @param idList 主键ID列表(不能为 null 以及 empty)
     * @return 删除成功记录数
     */
    int deleteBatchIds(@Param(Constants.COLLECTION) Collection<? extends Serializable> idList);

    /**
     * 根据 ID 修改一条记录
     *
     * @param entity 实体对象
     * @return 修改成功记录数
     */
    int updateById(@Param(Constants.ENTITY) T entity);

    /**
     * 根据 ID 查询一条记录
     *
     * @param id 主键ID
     * @return 实体对象
     */
    T selectById(Serializable id);

    /**
     * 查询（根据ID 批量查询）
     *
     * @param idList 主键ID列表(不能为 null 以及 empty)
     * @return 实体对象列表
     */
    List<T> selectBatchIds(@Param(Constants.COLLECTION) Collection<? extends Serializable> idList);

    /**
     * 查询（根据 columnMap 条件）
     *
     * @param columnMap 表字段 map 对象
     * @return 实体对象列表
     */
    List<T> selectByMap(@Param(Constants.COLUMN_MAP) Map<String, Object> columnMap);
}
