package inheritance2;

public class LimasSegitiga extends BangunRuang{
    
    float a;
    float ts;
    float tl;
    
    @Override
    float volume(){
        float volume = a * ts * tl / 3 / 2;
        System.out.println("Volume Limas Segitiga: " + volume);
        return volume;
    }
}
