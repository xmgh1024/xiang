package cn.source.system.service;

import cn.source.system.domain.MallOrder;

import java.util.List;

/**
 * 订单信息Service接口
 *
 * @author ljp
 * @date 2022-06-19
 */
public interface IMallOrderService
{
    /**
     * 查询订单信息
     *
     * @param id 订单信息主键
     * @return 订单信息
     */
    public MallOrder selectMallOrderById(Long id);

    /**
     * 查询订单信息列表
     *
     * @param mallOrder 订单信息
     * @return 订单信息集合
     */
    public List<MallOrder> selectMallOrderList(MallOrder mallOrder);

    /**
     * 新增订单信息
     *
     * @param mallOrder 订单信息
     * @return 结果
     */
    public int insertMallOrder(MallOrder mallOrder);

    /**
     * 修改订单信息
     *
     * @param mallOrder 订单信息
     * @return 结果
     */
    public int updateMallOrder(MallOrder mallOrder);

    /**
     * 批量删除订单信息
     *
     * @param ids 需要删除的订单信息主键集合
     * @return 结果
     */
    public int deleteMallOrderByIds(Long[] ids);

    /**
     * 删除订单信息信息
     *
     * @param id 订单信息主键
     * @return 结果
     */
    public int deleteMallOrderById(Long id);
}
