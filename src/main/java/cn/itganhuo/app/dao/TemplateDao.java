/*
 * 1. This project consists of JAVA private school online learning community group Friends co-creator
 *  [QQ group 329232140].
 * 2. See the list of IT dry technology sharing network [http://www.itganhuo.cn/teams].
 * 3. The author does not guarantee the quality of the project and its stability, reliability, and security
 *  does not bear any responsibility.
 * 1、本项目由JAVA私塾在线学习社区群友共同创作[QQ群329232140]；
 * 2、作者名单详见IT干货技术分享网[http://www.itganhuo.cn/teams]；
 * 3、作者不保证本项目质量并对其稳定性、可靠性和安全性不承担任何责任。
 */
package cn.itganhuo.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.itganhuo.app.entity.Template;

/**
 * <h2>消息模板管理之数据层接口</h2>
 * <dl>
 * <dt>功能描述</dt>
 * <dd>无</dd>
 * <dt>使用规范</dt>
 * <dd>无</dd>
 * </dl>
 * 
 * @version 0.0.1-SNAPSHOT
 * @author 天津-朱塞佩，深圳-小兴
 */
@Repository
public interface TemplateDao {

	/**
	 * 插入一条模板
	 * 
	 * @version 0.0.1-SNAPSHOT
	 * @author 朱塞佩
	 * @param template
	 *            模板
	 * @return 返回主键
	 */
	public int insert(Template template);

	/**
	 * 根据模板名称返回相应模板
	 * 
	 * @version 0.0.1-SNAPSHOT
	 * @author 朱塞佩
	 * @param name
	 *            模板名称
	 * @return 返回一条模板记录
	 */
	public Template loadByName(String name);

	/**
	 * 根据id到邮件模板表（t_template）里查询唯一一条数据
	 * 
     * @version 0.0.1-SNAPSHOT
	 * @author 深圳-小兴
	 * @param id
	 *            主键
	 * @return 一条模板记录
	 */
	public Template loadById(int id);

	/**
	 * <h2>加载全部模板数据</h2>
	 * <dl>
	 * <dt>功能描述</dt>
	 * <dd>无</dd>
	 * <dt>使用规范</dt>
	 * <dd>无</dd>
	 * </dl>
	 * 
	 * @version 0.0.1-SNAPSHOT
	 * @author 朱塞佩
	 * @return
	 */
	public List<Template> loadAll();
}
