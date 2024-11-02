/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package culturemedia.exception;

import java.text.MessageFormat;

public class DurationNotValidException extends Exception{
    public DurationNotValidException(String title, Double duration){
        super(MessageFormat.format("Duration not valid for video: {0} and duration {0}", title, duration));
    }
}
/**
 *
 * @author Juan
 */