/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem_logic;

/**
 *
 * @author A-7
 */
public class sistem_perkuliahan {
    private perkuliahan[] data_perkuliahan;
    private dosen[] data_dosen;
    private mahasiswa[] data_mahasiswa;
    private staff[] data_staff;

    public sistem_perkuliahan() {
    }

    public sistem_perkuliahan(perkuliahan[] data_perkuliahan, dosen[] data_dosen, mahasiswa[] data_mahasiswa, staff[] data_staff) {
        this.data_perkuliahan = data_perkuliahan;
        this.data_dosen = data_dosen;
        this.data_mahasiswa = data_mahasiswa;
        this.data_staff = data_staff;
    }
    
    
}
