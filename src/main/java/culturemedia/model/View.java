/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package culturemedia.model;

import java.time.LocalDateTime;

public record View(String userFullName, LocalDateTime startPlayingTime, Integer age, Video video) {
}
/**
 *
 * @author Juan
 */