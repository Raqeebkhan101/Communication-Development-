/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matlab;

import matlab.MatlabController;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;



/**
 *
 * @author shashiru1
 */
public class SpeakerSound {
    
    
    public void beepSound(){
    
    InputStream in;
        
        try{
    
            in = new FileInputStream(new File("C:\\Lanugage\\beep.wav"));
            AudioStream audios = new AudioStream(in);
            AudioPlayer.player.start(audios);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
    }
    
    public void recording(){
        
       SpeakerSound sound = new SpeakerSound();
       MatlabController matlab = new MatlabController();
       sound.beepSound();
       matlab.startRecorder();
    }
    
}
