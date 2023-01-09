package cn.com.pep.model.chain;

import cn.com.pep.model.chain.impl.AbstractLogger;
import cn.com.pep.model.chain.impl.DebugLogger;
import cn.com.pep.model.chain.impl.ErrorLogger;
import cn.com.pep.model.chain.impl.InfoLogger;

/**
 * @Title: ChainResponsibility  
 * @Description:Ϊ���󴴽���һ�������߶������������ģʽ������������ͣ�������ķ����ߺͽ����߽��н���������ģʽ������Ϊ�����ģʽ��
 * 				����ģʽ�У�ͨ��ÿ�������߶���������һ�������ߵ����á����һ�������ܴ����������ô�����ͬ�����󴫵ݸ���һ�������ߣ��������ơ�
 * 				��ͼ�������������ߺͽ����������һ���ö�����󶼿��ܽ������󣬽���Щ�������ӳ�һ��������������������������֪��û�ж�������λ�á�
 * 				��Ҫ�����ְ�����ϵĴ����߸��������󣬿ͻ���ֻ��Ҫ�������͵�ְ�����ϼ��ɣ������������Ĵ���ϸ�ں�����Ĵ��ݣ�����������������ķ����ߺ�����Ĵ����Ž��н����ˡ�
 * 				��ʱʹ�ã��ڴ�����Ϣ��ʱ����Թ��˺ܶ����
 * 				��ν�������ص��඼ʵ��ͳһ�Ľӿ�
 * 				�ؼ����룺Handler����ۺ����Լ�����HandlerRequest�����ж��Ƿ���ʣ����û�дﵽ���������´��ݣ�ֱ��û����������Ϊֹ
 * 				�ŵ㣺 1����������϶ȣ�������ķ����ߺͽ����߽����˽��
 * 					 2����ǿ������ָ��ְ�������ԣ�ͨ���ı����ڵĳ�Ա���ߵ������ǵĴ�������̬����������ɾ�����Σ�
 * 					 3�������µ���������ܷ��㣻
 * 				ȱ�㣺 1�����ܱ�֤����һ�������գ�
 * 					 2��ϵͳ�����ܵ�һ��Ӱ�죬���Բ����㣬�������ѭ�����ã�
 * 				     3�����ܲ����׹۲�����ʱ����������а��ų�����
 * 				Ӧ��ʵ����1�����Ĵ�����2��js�е�ð��ʱ�䣻3��tomcat�ж�encoding�Ĵ���4��structs�еĹ�������
 * 				Ӧ�ó�����1���ж��������Դ���һ�����󣬾�����Щ�������������������ʱ��̬ȷ����2���ڲ���ȷָ�������ߵ�����£����������е�һ���ύһ������3�����Զ�ָ̬��һ�������һ������
 * @author wwh 
 * @date 2022-6-20 14:06:05
 */
public class ChainResponsibility {

	public static void main(String[] args) {
		AbstractLogger logger = getLoggerChains();
		logger.loggerMsg(AbstractLogger.DEBUG, "Mine major is java...");
	}
	
	public static AbstractLogger getLoggerChains() {
		AbstractLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);
		InfoLogger infoLogger = new InfoLogger(AbstractLogger.INFO);
		ErrorLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		debugLogger.setNextLogger(infoLogger).setNextLogger(errorLogger);
		return debugLogger;
	}
}
