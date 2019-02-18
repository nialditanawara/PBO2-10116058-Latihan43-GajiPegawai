/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116058.latihan43.gajipegawai;

public class PBO210116058Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GajiPegawai gp = new GajiPegawai();
        gp.setNama("Alfan Wahyudi");
        gp.setAlamat("Jalan Sekeloa Utara 1");
        gp.setUangTransport(250000);
        gp.setUangTunjangan(300000);
        gp.setGajiPokok(4500000);
        gp.setTotalGaji(gp.totalGaji(gp.getUangTunjangan(),
                gp.getUangTransport(), gp.getGajiPokok()));
        gp.tampilData(gp.getNama(),gp.getAlamat(),gp.getUangTunjangan(),
                gp.getUangTransport(), gp.getGajiPokok(),gp.getTotalGaji());

    }

}