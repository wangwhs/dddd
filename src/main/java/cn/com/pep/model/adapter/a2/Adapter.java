package cn.com.pep.model.adapter.a2;
/**
 * 
 * @Title: Adapter  
 * @Description:  �����������̳�����Ҫ������࣬����ʵ����Ŀ�����Ľӿ�
 * @author wwh 
 * @date 2022-9-5 15:59:37
 */
public class Adapter extends Adaptee implements Target{

	@Override
	public void calculate() {
		specificRequest();
	}

}
