package inheritance2;

public class Bola extends BangunRuang{
    
    float r;
    
    @Override
    float volume(){
        float volume = 4/3 * 22/7 * r * r * r;
        System.out.println("Volume Bola " + "= " + volume);
        return volume;
    }
    
    @Override
    float LuasPermukaan(){
        float LuasPermukaan = 4 * 22/7 * r * r;
        System.out.println("Luas Pemukaan Bola " + "= " + LuasPermukaan);
        return LuasPermukaan;
    }
    
}
