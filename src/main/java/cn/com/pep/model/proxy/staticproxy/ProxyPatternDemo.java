package cn.com.pep.model.proxy.staticproxy;
/**
 * 
 * @Title: ProxyPatternDemo  
 * @Description:  
 * @author wwh 
 * @date 2022-9-2 16:26:17
 */
public class ProxyPatternDemo {
	
	public static void main(String[] args) {
		Subject delegate = new ProxySubject(new RealSubject());
		delegate.caculate();
		
	}
}
