package cn.com.pep.model.proxy.staticproxy;

/**
 * 
 * @Title: ProxySubject
 * @Description: 代理类实现了代理接口
 * @author wwh
 * @date 2022-9-2 15:47:35
 */
public class ProxySubject implements Subject {

	/**
	 * 持有一个委托类的引用
	 */
	private Subject delegate;

	public ProxySubject(Subject delegate) {
		this.delegate = delegate;
	}

	/**
	 * 将请求分配给委托者执行，记录任务执行前后的时间
	 */
	@Override
	public void caculate() {
		// TO DO Auto-generated method stub
		long begin = System.currentTimeMillis();
		delegate.caculate();
		long end = System.currentTimeMillis();
		System.err.println("总共耗时：" + (end - begin) + "毫秒");

	}

}
