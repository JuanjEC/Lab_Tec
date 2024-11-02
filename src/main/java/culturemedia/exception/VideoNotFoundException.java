/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package culturemedia.exception;

import java.text.MessageFormat;

public class VideoNotFoundException extends Exception {
    public VideoNotFoundException(){
        super("Video not found");
    }
    public VideoNotFoundException(String title){
        super(MessageFormat.format("Video not found with title; {9}", title));
    }
}
/**
 *
 * @author Juan
 */