package cn.com.pep.model.proxy.staticproxy;
/**
 * 
 * @Title: RealSubject  
 * @Description:  委托类，实现核心的业务逻辑
 * @author wwh 
 * @date 2022-9-2 15:46:16
 */
public class RealSubject implements Subject{

	@Override
	public void caculate() {
		try {
			Thread.sleep(1000);
			System.err.println("我是委托类，实现核心的业务逻辑");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
