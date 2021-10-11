package com.example.watchshop;

public class Watch {
    private String Watch_name;
    private int Watch_price;
    private String url;

    public Watch(String Name, int Price, String url) {
        this.Watch_name = Name;
        this.Watch_price = Price;
        this.url = url;
    }

    public String getWatch_name() {
        return Watch_name;
    }

    public void setWatch_name(String watch_name) {
        Watch_name = watch_name;
    }

    public int getWatch_price() {
        return Watch_price;
    }

    public void setWatch_price(int watch_price) {
        Watch_price = watch_price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
