package com.gik.sburestdemo.ch5_prop;

//третий способ если нужно подключить внешний бин в SburRestDemoApplication   getDroid(). настраиваем так же в application.prop
public class Droid {

    private String id;
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
