package com.javakc.springbootssm.user.dao;


import com.javakc.springbootssm.user.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;


public interface UserDao {

    /**
     * 用户添加
     * @param user 实体类
     * @return 条数
     */
    public int insert(User user);

    /**
     * 用户修改
     * @param user 实体类
     * @return 条数
     */
    public int update(User user);

    /**
     * 用户删除
     * @param id 实体类
     * @return 条数
     */
    public int delete(int id);

    /**
     * 根据主键查询对象
     * @param id 主键
     * @return 对象
     */
    public User queryById(int id);

    /**
     * 根据条件分页查询
     * @param params 查询条件
     * @return 对象
     */
    public List<User> queryByOage(Map<String,Object> params);

    /**
     * 根据条件查询总条数
     * @param params 查询条件
     * @return 总条数
     */
    public long queryByCount(Map<String,Object> params);
}
