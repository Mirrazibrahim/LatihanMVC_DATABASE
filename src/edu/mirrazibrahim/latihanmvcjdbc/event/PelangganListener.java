/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mirrazibrahim.latihanmvcjdbc.event;

import edu.mirrazibrahim.latihanmvcjdbc.entity.Pelanggan;
import edu.mirrazibrahim.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author 
 * Nama : Mirraz Ibrahim
 * Nim  : 10118056
 * Kelas: IF-2
 */
public interface PelangganListener {
    public void onChange(PelangganModel model);
    public void onInsert(Pelanggan pelanggan);
    public void onDelete();
    public void onUpdate(Pelanggan pelanggan);
}
