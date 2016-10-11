/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Isabel
 */
public class Imposto {
    public Imposto(){
	}
	public double calcula(Orcamento orcamento){
		System.out.println("teste");
		return orcamento.getValor() * 0.1;
	}
    
}
