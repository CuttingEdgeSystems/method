package com.vectorsystems.blockstateme;

public class MVCPattern {

    public static void main(String[] args) {
        Data model = retrieveDataFromDatabase();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.updateView();
    }

    private static Data retrieveDataFromDatabase(){
        Data data = new Data();
        data.setIntro("line 1-intro");
        data.setMiddle("line 2- middle");
        data.setName("StatusCode:200");
        return data;


    }

}
