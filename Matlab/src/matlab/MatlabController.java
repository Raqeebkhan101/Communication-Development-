/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matlab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author shashiru1
 */
public class MatlabController {
    
    public void startRecorder(){
        
        final JavaSoundRecorder recorder = new JavaSoundRecorder();
		Thread stopper = new Thread(new Runnable() {
			public void run() {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
				recorder.finish();
			}
		});

		stopper.start();
		recorder.start();
        
        
        
    }
    
    public void startMatlab(){
    
    //start the matlab exe one
        try {
            Runtime.getRuntime().exec("C:\\Test\\Recording\\Untitled5.exe", null, new File("C:\\Test\\Recording"));
            } catch (Exception e) {
            e.printStackTrace();
            }
                    
        //check whether left.wav file is available or not in wav file 02
        
        File file = new File("C:\\Test\\Wav file 02\\left.wav");
        
        while(!file.exists()){
            
                try {
                    Thread.sleep(1000);//1000 milliseconds is one second.
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }   
        }        
        try {
            Runtime.getRuntime().exec("C:\\Test\\Wav file 02\\Untitled2.exe", null, new File("C:\\Test\\Wav file 02"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
     
        File file1 = new File("C:\\Test\\Wav file 03\\filter.wav");
        
        while(!file1.exists()){
            try {
                    Thread.sleep(1000);//1000 milliseconds is one second.
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
        }
        
        try {
            Process p = Runtime.getRuntime().exec("C:\\Test\\Wav file 03\\Untitled4.exe", null, new File("C:\\Test\\Wav file 03"));
            //p.destroy();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        File file2 = new File("C:\\Test\\Text file\\frequency.txt");
        
        while(!file2.exists()){
            try {
                    Thread.sleep(1000);//1000 milliseconds is one second.
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
        }
            
        System.out.print(":)");
        
    }
    
    
    public double formantFrequencyone(){
        
        startMatlab();
        
        double one = 0;
        
        try{
        BufferedReader r = new BufferedReader(new FileReader("C:/Test/Text file/frequency.txt"));
        one = Double.parseDouble(r.readLine());
        
//        try{
//                
//                File filer = new File("C:\\Test\\Text file\\frequency.txt");
//                Scanner scan = new Scanner(filer);
//                scan.hasNext();
//                scan.nextLine();
//                one = Double.parseDouble(scan.nextLine());
//                //jLabel1.setText(nn);
//       
//            }catch(Exception e){
//                
//                System.out.println("Error");
//            }
        r.close();
        }catch(FileNotFoundException e){
            
        }catch(IOException e){
            
        }
        
        return one;
    }
    
        public double formantFrequencytwo(){
        
        double two = 0;
        
        try{
        BufferedReader r = new BufferedReader(new FileReader("C:/Test/Text file/frequency.txt"));
        two = Double.parseDouble(r.readLine());
        two = Double.parseDouble(r.readLine());
        r.close();
        
        }catch(Exception e){
            
        }
        
        
//        try{
//                
//                File filer = new File("C:/Test/Text file/frequency.txt");
//                Scanner scan = new Scanner(filer);
//                scan.hasNext();
//                scan.nextLine();
//                
//                two = Double.parseDouble(scan.nextLine());
//                //jLabel2.setText(n);
//                
//                
//                
//            }catch(Exception e){
//                
//                System.out.println("Error");
//            }
        
        return two;
    }
    
    public double formantFrequencythree(){
        
        double three = 0;
        
         try{
        BufferedReader r = new BufferedReader(new FileReader("C:/Test/Text file/frequency.txt"));
        three = Double.parseDouble(r.readLine());
        three = Double.parseDouble(r.readLine());
        three = Double.parseDouble(r.readLine());
        
        
        r.close();
        }catch(Exception e){
            
        }
        
//        try{
//                
//                File filer = new File("C:/Test/Text file/frequency.txt");
//                Scanner scan = new Scanner(filer);
//                scan.hasNext();
//                scan.nextLine();
//                scan.hasNext();
//                scan.nextLine();
//                scan.hasNext();
//                
//           //jLabel3.setText(scan.nextLine());
//                three = Double.parseDouble(scan.nextLine());
//                
//                if(filer.delete()){
//                    
//                    System.out.println("deleted");
//                    
//                }else{
//                    System.out.println("ghsdfkhgkhdfjkghdfjkhgjkdfhgjk");
//                }
//                
//            }catch(Exception e){
//                
//                System.out.println("Error");
//            }
        closeMatlab();
        return three;
    }
    
    public double speechImprovement(double f1, double f2, double f3){
        
        double voiceProbability = f1+f2+f3;
       // double probability = 0;
        
        if(voiceProbability > 2){
            
            System.out.println(voiceProbability);
            return 3;
        }
        else{
            
            System.out.println(voiceProbability);
        }
        
        return 0;
   
    }
    
    public void closeMatlab(){
        
    
        File index2 = new File("C:\\Test\\Wav file 02\\left.wav");
        if(index2.exists()){
                                                
        index2.delete();
        System.out.println("Deleted left wave file in text folder");
        }
            
        File index3 = new File("C:\\Test\\Wav file 03\\filter.wav");
        if(index3.exists()){
                                                
        index3.delete();
        System.out.println("Deleted filter wave file in text folder");
        }    
        
        File index1 = new File("C:\\Test\\Recording\\RecordAudio.wav");
        if(index1.exists()){
                                                
        index1.delete();
        System.out.println("Deleted wave file folder");
        }
        
//        ListOutFilesInDir2 find = new ListOutFilesInDir2();
//        File[] fileList = find.getFileList("C:\\Test\\Text file");
//        
//        for(File file : fileList) {
//                System.out.println(file.getName());
//                 String filename = file.getName();
//                if (filename.equals("frequency.txt")){
//                    
//                    file.delete();
//                   
//                    
//                }
//        }
//        
        File index4 = new File("C:\\Test\\Text file\\frequency.text");
        
        if(index4.exists()){
                                                
        index4.delete();
        System.out.println("Deleted frequency.txt file in text folder");
        }
        
        
    }    
}
