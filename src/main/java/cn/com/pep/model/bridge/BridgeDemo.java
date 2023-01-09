package cn.com.pep.model.bridge;
/**
 * 
 * @Title: BridgeDemo  
 * @Description:  ≤‚ ‘¿‡
 * @author wwh 
 * @date 2022-9-9 11:21:47
 */
public class BridgeDemo {
	
	public static void main(String[] args) {
		Bridge b = new BeijingTarget();
		AbstractSrc as = new NanjingSrc(b);
		as.to();
		
		b = new ShanghaiTarget();
		as.bridge = b;
		as.to();
		
		as = new WuhanSrc(b);
		as.to();
		
		as.bridge = new BeijingTarget();
		as.to();
		
	}

}
