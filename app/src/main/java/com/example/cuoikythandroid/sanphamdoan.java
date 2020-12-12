package com.example.cuoikythandroid;

public class sanphamdoan {
    private int anh;
    private String name;
    private String gia;

    public sanphamdoan(int anh, String name, String gia) {
        this.anh = anh;
        this.name = name;
        this.gia = gia;
    }

    public int getAnh() {
        return anh;
    }

    public void setAnh(int anh) {
        this.anh = anh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }
}