/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impostos.imposto;

import impostos.produto.Produto;

/**
 *
 * @author ra21506703
 */
public class ImpostoDilma extends Imposto{
    
    public ImpostoDilma (String n) {
        super (n);
    }
    @overide
    public float calcularValor(Produto p) {
    
    if(p.getNome().startsWith("C"))}
    float aliquota = 0.3F;
    return p.getPreco() * aliquota;

return 0;

}
