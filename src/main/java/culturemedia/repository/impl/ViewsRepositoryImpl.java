/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package culturemedia.repository.impl;

import culturemedia.model.View;
import culturemedia.repository.ViewsRepository;

import java.util.ArrayList;
import java.util.List;

public class ViewsRepositoryImpl implements ViewsRepository {
    private final List<View> views;

    public ViewsRepositoryImpl() {
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