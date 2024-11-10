/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package culturemedia.repository.impl;

import culturemedia.model.View;

import java.util.ArrayList;
import java.util.List;
import culturemedia.repository.ViewRepository;

public class ViewRepositoryImpl implements ViewRepository {
    private final List<View> views;

    public ViewRepositoryImpl() {
        this.views = new ArrayList<>();
    }

    @Override
    public View add(View view) {
        this.views.add( view );
        return view;
    }
}
/**
 *
 * @author Juan
 */