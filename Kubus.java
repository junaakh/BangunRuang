package inheritance2;

public class Kubus extends BangunRuang{
    
    float s;
    
    @Override
    float volume(){
        float volume = s * s * s;
        System.out.println("Volume kubus: " + volume);
        return volume;
    }
    
    @Override
    float LuasPermukaan(){
        float LuasPermukaan = 6 * s * s;
        System.out.println("Luas Permukaan kubus: " + LuasPermukaan);
        return LuasPermukaan;
    }
    
}
