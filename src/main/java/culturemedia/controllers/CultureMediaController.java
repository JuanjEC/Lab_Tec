/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package culturoteca.controllers;

import java.util.List;
import java.util.Collections;

import culturoteca.exception.VideoNotFoundException;
import culturoteca.model.Video;
import culturoteca.service.impl.CultureMediaServiceImpl;

public class CultureMediaController {

    private final CultureMediaServiceImpl cultureMediaService;

    public CultureMediaController(CultureMediaServiceImpl cultureMediaService) {
        this.cultureMediaService = cultureMediaService;
    }

    public List<Video> findAllVideos() {
        try {
            return cultureMediaService.findAll();
        } catch (VideoNotFoundException e) {
            return Collections.emptyList();
        }
    }
}
/**
 *
 * @author Juan
 */