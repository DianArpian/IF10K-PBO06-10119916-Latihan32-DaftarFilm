/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo06.pkg10119916.latihan32.daftarfilm;

/**
 *
 * @author 
 * NAMA     : DIAN ARPIAN
 * NIM      : 10119916
 * KELAS    : IF10K
 * Deskripsi Program : Daftar Film
 */

public class PBO0610119916Latihan32DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("===Daftar Film Sedang Tayang===");
        System.out.println();
        
        Film f = new Film();
        f.filmName = "Venom";
        f.filmGenre = "Action, Horror, Scifi";
        f.filmRating = 8.5;
        f.filmDuration = 120;
        f.nowPlaying();
        System.out.println();
        
        f.filmName = "Small Foot";
        f.filmGenre = "Animation";
        f.filmRating = 9.0;
        f.filmDuration = 96;
        f.nowPlaying();
        System.out.println();
        
        f.filmName = "Crazy Rich Asian";
        f.filmGenre = "Comedy";
        f.filmRating = 7.8;
        f.filmDuration = 119;
        f.nowPlaying();
        System.out.println();
        
        f.filmName = "Asih";
        f.filmGenre = "Horror";
        f.filmRating = 6.0;
        f.filmDuration = 100;
        f.nowPlaying();
        System.out.println();
    }
    
}
