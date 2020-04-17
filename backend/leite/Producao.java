
package leite;

import animais.Vaca;

public class Producao {
    private float ordenha1;
    private float ordenha2;
    private Vaca vaca;
    
    public Producao(float ordenha1, float ordenha2, Vaca vaca){
        this.ordenha1 = ordenha1;
        this.ordenha2 = ordenha2;
        this.vaca = vaca;
    }
    
    public void total (float ordenha1, float ordenha2, Vaca vaca, float total){
        total = ordenha1 + ordenha2;
    }
    
}
