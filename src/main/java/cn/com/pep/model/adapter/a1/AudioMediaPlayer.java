package cn.com.pep.model.adapter.a1;
/**
 * @Title: AudioMediaPlayer
 * @Description: 目标对象
 * @author wwh
 * @date 2022-9-5 10:49:33
 */
public class AudioMediaPlayer implements MeidaPlayer {

	private MediaPlayerAdapter adapter;

	@Override
	public void play(String audioType, String filename) {
		if ("mp3".equalsIgnoreCase(audioType)) {
			System.out.println("Playing mp3 and filename is: " + filename);
		} else if ("mp4".equalsIgnoreCase(audioType) || "vlc".equalsIgnoreCase(audioType)) {
			adapter = new MediaPlayerAdapter(audioType);
			adapter.play(audioType, filename);
		}
	}
}
