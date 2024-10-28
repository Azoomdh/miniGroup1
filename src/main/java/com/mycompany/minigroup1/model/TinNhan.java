/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minigroup1.model;

import  com.mycompany.minigroup1.view.GiaoDien1TinNhan;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author azoom
 */
public class TinNhan {
    private int idNguoiGui;
    private String noiDungTinNhan;
    
    public TinNhan(int idClient, String noiDungTinNhan) {
        this.idNguoiGui = idClient;
        this.noiDungTinNhan = noiDungTinNhan;
    }

    public int getIdNguoiGui() {
        return idNguoiGui;
    }

    public void setIdNguoiGui(int idNguoiGui) {
        this.idNguoiGui = idNguoiGui;
    }

    public String getNoiDungTinNhan() {
        return noiDungTinNhan;
    }

    public void setNoiDungTinNhan(String noiDungTinNhan) {
        this.noiDungTinNhan = noiDungTinNhan;
    }
    
}
