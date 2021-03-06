/*
 * Copyright 2014-2024 the https://github.com/xiaoxing598/itganhuo.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * This project consists of JAVA private school online learning community group Friends co-creator [QQ group 329232140].
 * 本项目由JAVA私塾在线学习社区群友共同创作[QQ群329232140];
 * See the list of IT dry technology sharing network [http://www.itganhuo.cn/teams].
 * 作者名单详见IT干货技术分享网[http://www.itganhuo.cn/teams];
 * The author does not guarantee the quality of the project and its stability, reliability, and security does not bear any responsibility.
 * 作者不保证本项目质量并对其稳定性、可靠性和安全性不承担任何责任.
 */
package cn.itganhuo.app.service;

import cn.itganhuo.app.entity.Label;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <h2>标签服务层接口</h2>
 * <dl>
 * <dt>功能描述</dt>
 * <dd>对标签表的CRUD操作</dd>
 * <dt>使用规范</dt>
 * <dd>无</dd>
 * </dl>
 *
 * @author 深圳-小兴
 * @version 0.0.1-SNAPSHOT
 */
@Service
public interface LabelService {

    /**
     * <h2>保存一个标签</h2>
     * <dl>
     * <dt>功能描述</dt>
     * <dd>无</dd>
     * <dt>使用规范</dt>
     * <dd>无</dd>
     * </dl>
     *
     * @param label 标签数据
     * @return 返回主键
     * @version 0.0.1-SNAPSHOT
     * @author 深圳-小兴
     */
    public int saveLabel(Label label);

    /**
     * <h2>根据主键删除标签</h2>
     * <dl>
     * <dt>功能描述</dt>
     * <dd>无</dd>
     * <dt>使用规范</dt>
     * <dd>无</dd>
     * </dl>
     *
     * @param id 标签主键
     * @return 删除成功返回true，否则返回false。
     * @version 0.0.1-SNAPSHOT
     * @author 深圳-小兴
     */
    public boolean delLabelById(int id);

    /**
     * <h2>根据主键修改标签</h2>
     * <dl>
     * <dt>功能描述</dt>
     * <dd>无</dd>
     * <dt>使用规范</dt>
     * <dd>无</dd>
     * </dl>
     *
     * @param label 标签数据
     * @return 修改成功返回true，否则返回false。
     * @version 0.0.1-SNAPSHOT
     * @author 深圳-小兴
     */
    public boolean updateLabelById(Label label);

    /**
     * <h2>按条件查询标签列表</h2>
     * <dl>
     * <dt>功能描述</dt>
     * <dd>无</dd>
     * <dt>使用规范</dt>
     * <dd>无</dd>
     * </dl>
     *
     * @param label 查询条件
     * @return 标签集合
     * @version 0.0.1-SNAPSHOT
     * @author 深圳-小兴
     */
    public List<Label> getLabelByCondition(Label label);

    /**
     * <h2>按条件查询标签列表</h2>
     * <dl>
     * <dt>功能描述</dt>
     * <dd>无</dd>
     * <dt>使用规范</dt>
     * <dd>无</dd>
     * </dl>
     *
     * @param userId 当前用户编号
     * @return 标签集合
     * @version 0.0.1-SNAPSHOT
     * @author 深圳-小兴
     */
    public List<Map<String, String>> getLabelByCondition2(int userId);

    /**
     * <h2>统计标签使用率最高的列表，现在默认只查询前10个。</h2>
     * <dl>
     * <dt>功能描述</dt>
     * <dd>无</dd>
     * <dt>使用规范</dt>
     * <dd>无</dd>
     * </dl>
     *
     * @return 标签集合
     * @author 深圳-小兴
     */
    List<Label> queryPopularTags(int limit);

}
