package inheritance2;

public class Balok extends BangunRuang{
    
    float p;
    float l;
    float t;
    
    @Override
    float volume(){
        float volume = p * l * t;
        System.out.println("Volume Balok: " + volume);
        return volume;
    }
    
    @Override
    float LuasPermukaan(){
        float LuasPermukaan =2 * (p*l + p*t + l*t);
        System.out.println("Luas Permukaan Balok: " + LuasPermukaan);
        return LuasPermukaan;
    }
    
}
