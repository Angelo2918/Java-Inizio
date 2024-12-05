package com.example.jpa.otherStuff.recap.designpatterns;

class SistemAudio{
    public void pornesteAudio(){
        System.out.println("Sistem audio pornit!");
    }
}
class SistemLumini{
    public void pornesteLumini(){
        System.out.println("Sistem lumini pornit!");
    }
}

class SistemVideo{
    public void pornesteVideo(){
        System.out.println("Sistem video pornit!");
    }
}

class HomeCinemaFacade {
    private SistemLumini lumini;
    private SistemAudio audio;
    private SistemVideo video;

    public HomeCinemaFacade(){
        lumini = new SistemLumini();
        audio = new SistemAudio();
        video = new SistemVideo();
    }

    public void pornesteFilm(){
        lumini.pornesteLumini();
        audio.pornesteAudio();
        video.pornesteVideo();
    }


}


public class Facade {
    public static void main(String... a){
HomeCinemaFacade facade = new HomeCinemaFacade();
facade.pornesteFilm();
    }
}
