package cn.com.pep.model.adapter.a1;
/**
 * 
 * @Title: AdapterPatternDemo  
 * @Description:  ���Դ���
 * @author wwh 
 * @date 2022-9-5 10:56:33
 */
public class AdapterPatternDemo {
	
	public static void main(String[] args) {
		AudioMediaPlayer player = new AudioMediaPlayer();
		player.play("mp3", "����.mp3");
		player.play("mp4", "��������.mp4");
		player.play("vlc", "ƽ��������.vlc");
	}
}
