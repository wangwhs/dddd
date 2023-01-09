package cn.com.pep.model.adapter.a1;
/**
 * 
 * @Title: AdapterPatternDemo  
 * @Description:  测试代码
 * @author wwh 
 * @date 2022-9-5 10:56:33
 */
public class AdapterPatternDemo {
	
	public static void main(String[] args) {
		AudioMediaPlayer player = new AudioMediaPlayer();
		player.play("mp3", "红日.mp3");
		player.play("mp4", "天下无贼.mp4");
		player.play("vlc", "平凡的世界.vlc");
	}
}
