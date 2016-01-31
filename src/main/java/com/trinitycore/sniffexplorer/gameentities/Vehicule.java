/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trinitycore.sniffexplorer.gameentities;

/**
 *
 * @author chaouki
 */
public class Vehicule extends Unit implements IdentifiableByEntry{
    
    private Integer entry;

    public Vehicule() {
    }

    public Vehicule(Integer entry, String GUID) {
        super(GUID);
        this.entry = entry;
    }

    @Override
    public Integer getEntry() {
        return entry;
    }

    public void setEntry(Integer entry) {
        this.entry = entry;
    }

    @Override
    public String toString() {
        return "Vehicule{" + "entry=" + entry + ", GUID="+GUID+"}";
    }
    
    
}