import attaque.Attaque;
import deplacement.Deplacement;

public class Unite {

    private String name;
    private String modeDeplacement;
    private String modeAttaque;

    public Unite(String name){
        this.name = name;
    }

    public String seDeplacer(Deplacement deplacement)
    {
        modeDeplacement = deplacement.deplacer();
        return deplacement.deplacer();
    }

    public String combattre( Attaque attaque)
    {
        modeAttaque = attaque.attaquer();
        return attaque.attaquer();
    }

    public String getName() {
        return name;
    }

    public String getModeDeplacement() {
        return modeDeplacement;
    }

    public String getModeAttaque() {
        return modeAttaque;
    }
}
