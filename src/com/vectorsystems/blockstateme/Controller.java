package com.vectorsystems.blockstateme;

public class Controller {
    private Data model;
    private View view;


    public Controller(Data model, View view){
        this.model=model;
        this.view= view;

    }


    public void setDataName(String name) {
        model.setName(name);
    }

    public String getDataName(){
        return model.getName();
    }

    public  void setIntro(String intro){
        model.setIntro(intro);
    }
    public String getIntro(){
        return model.getIntro();
    }

    public void setMiddle(String middle){
        model.setMiddle(middle);
    }

    public String getMiddle(){
        return model.getMiddle();
    }

    public void updateView(){
        view.printViewData(model.getIntro(), model.getMiddle(), model.getName());
    }


}
