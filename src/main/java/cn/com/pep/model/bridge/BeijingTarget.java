package cn.com.pep.model.bridge;
/**
 * 
 * @Title: BeijingTarget  
 * @Description:  具体实现化角色，给出实现化角色的具体定义，通过实现接口的方式与桥接口进行绑定
 * @author wwh 
 * @date 2022-9-9 10:58:38
 */
public class BeijingTarget implements Bridge{

	@Override
	public void target() {
		System.err.println("我要去北京......");
	}

}
