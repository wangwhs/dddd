package cn.com.pep.model.bridge;
/**
 * 
 * @Title: WuhanSrc  
 * @Description:  修正抽象化角色（RefinedAbstraction）:扩展抽象化角色，改变和修正父类抽象化角色的定义；
 * @author wwh 
 * @date 2022-9-9 11:14:48
 */
public class WuhanSrc extends AbstractSrc{

	public WuhanSrc(Bridge bridge) {
		super(bridge);
	}

	@Override
	public void src() {
		System.err.println("我来自武汉......");
	}

}
