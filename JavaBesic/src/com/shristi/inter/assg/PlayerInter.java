package com.shristi.inter.assg;

public class PlayerInter {
	public static void main(String[] args) {
		MediaPlayer mediaPlayer=new VLCMediaPlayer();
		mediaPlayer.playMusic();
	    mediaPlayer.downloadMusic();
	    
	    mediaPlayer=new WindowsMediaPlayer11();
	    mediaPlayer.playMusic();
	    mediaPlayer.downloadMusic();
	}

}
