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
package cn.itganhuo.app.common.pool;

import java.text.MessageFormat;

import org.junit.Test;
import org.springframework.util.Assert;

/**
 * <h2>[类用途简述]</h2>
 * <dl>
 * <dt>功能描述</dt>
 * <dd>无</dd>
 * <dt>使用规范</dt>
 * <dd>无</dd>
 * </dl>
 * 
 * @version 0.0.1-SNAPSHOT
 * @author 深圳-小兴
 */
public class TestConfigPool {

	@Test
	public void test() {
		Assert.notNull(ConfigPool.getString("parameter.emailLinkValidCertification"));
		Assert.notNull(ConfigPool.getString("parameter.requestGetContextPath"));
		Assert.isTrue("恭喜你：admin，邮箱地址认证成功！".equals(MessageFormat.format(ConfigPool.getString("respMsg.email.EmailAuthSuccessful"), "admin")));
	}

	@Test
	public void testGetString() {
		System.out.println(ConfigPool.getString("parameter.emailLinkValidCertification"));
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(ConfigPool.getString("parameter.emailLinkValidCertification"));
	}
	
	@Test
	public void testSetProperty() {
		System.out.println(ConfigPool.getString(ConstantPool.REAL_PATH));
		ConfigPool.setProperty(ConstantPool.REAL_PATH, "/home/jre");
		System.out.println(ConfigPool.getString(ConstantPool.REAL_PATH));
	}
}
