package com.example.psang_kt1;

public class CongAn {
    private String Ten;
    private String CapBac;
    private int Hinh;
    private String NoiCongTac;
    private String QuocGia;
    private int SoSao;

    public CongAn(String ten, String capBac, int hinh, String noiCongTac, String quocGia, int soSao) {
        Ten = ten;
        CapBac = capBac;
        Hinh = hinh;
        NoiCongTac = noiCongTac;
        QuocGia = quocGia;
        SoSao = soSao;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getCapBac() {
        return CapBac;
    }

    public void setCapBac(String capBac) {
        CapBac = capBac;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }

    public String getNoiCongTac() {
        return NoiCongTac;
    }

    public void setNoiCongTac(String noiCongTac) {
        NoiCongTac = noiCongTac;
    }

    public int getSoSao() {
        return SoSao;
    }

    public void setSoSao(int soSao) {
        SoSao = soSao;
    }

    public String getQuocGia() {
        return QuocGia;
    }

    public void setQuocGia(String quocGia) {
        QuocGia = quocGia;
    }
}
