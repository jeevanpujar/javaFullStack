package com.shristi.inter.assg;

public class VLCMediaPlayer implements MediaPlayer  {

	@Override
	public void playMusic() {
		System.out.println("playing using VLC");
		
	}

	@Override
	public void downloadMusic() {
		System.out.println("saved in mkv format");
		
	}

	
}
