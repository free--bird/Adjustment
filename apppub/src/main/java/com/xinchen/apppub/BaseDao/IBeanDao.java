package com.xinchen.apppub.BaseDao;

import java.util.List;

/**
 * Created by ZH on 2016/4/10.
 */
public interface IBeanDao<T> {
    /***
     * 获取所有实体
     *
     * @return 实体List
     */
    List<T> getAll();

    /***
     * 根据id获取实体
     *
     * @param id 实体ID
     * @return
     */
    T getById(Object id);

    /***
     * 删除所有实体
     *
     * @return 成功:true 失败:false
     */
    boolean deleteAll();

    /***
     * 根据ID删除实体
     *
     * @param id 实体ID
     * @return 成功:true 失败:false
     */
    boolean deleteById(Object id);

    /***
     * 保存实体
     *
     * @param t 实体
     * @return 成功:true 失败:false
     */
    boolean save(T t);

    /***
     * 保存多个实体
     *
     * @param list 实例链表
     * @return 成功:true 失败:false
     */
    boolean savaList(List<T> list);

    /***
     * 更新实体
     *
     * @param t 实体
     * @return 成功:true 失败:false
     */
    boolean update(T t, String... updateColumnNames);

    /***
     * 更新多个实体
     *
     * @param list 实体列表
     * @return 成功:true 失败:false
     */
    boolean updateList(List<T> list, String... updateColumnNames);

}
