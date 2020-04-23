package com.goddong.mapper;

import com.goddong.mapper.entity.Seckill;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 秒杀商品表(Seckill)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-23 19:46:27
 */
@Mapper
public interface SeckillDao {

    /**
     * 通过ID查询单条数据
     *
     * @param seckillId 主键
     * @return 实例对象
     */
    Seckill queryById(Long seckillId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Seckill> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param seckill 实例对象
     * @return 对象列表
     */
    List<Seckill> queryAll(Seckill seckill);

    /**
     * 新增数据
     *
     * @param seckill 实例对象
     * @return 影响行数
     */
    int insert(Seckill seckill);

    /**
     * 修改数据
     *
     * @param seckill 实例对象
     * @return 影响行数
     */
    int update(Seckill seckill);

    /**
     * 通过主键删除数据
     *
     * @param seckillId 主键
     * @return 影响行数
     */
    int deleteById(Long seckillId);

}