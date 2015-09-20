/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tc.sniffexplorer.model.smsg;

import java.util.List;
import tc.sniffexplorer.exceptions.ParseException;
import tc.sniffexplorer.model.Message;
import tc.sniffexplorer.model.entities.Creature;
import tc.sniffexplorer.model.entities.GameObject;
import tc.sniffexplorer.model.entities.Pet;
import tc.sniffexplorer.model.entities.Player;
import tc.sniffexplorer.model.entities.Unit;
import tc.sniffexplorer.model.entities.Vehicule;

/**
 *
 * @author chaouki
 */
public abstract class SpellMessage extends Message {
    
    private Unit casterUnit;
    private String itemCasterGUID;
    
    private Integer spellId;
    
    @Override
    public void initialize(List<String> lines) throws ParseException{
        
        /**
         * Caster
         */
        String[] words=lines.get(1).split("\\s+");
        if(!words[0].equals("Caster") || 
                (!words[5].equals("Creature") 
                && !words[5].equals("Player") 
                && !words[5].equals("Vehicle") 
                && !words[5].equals("Pet") 
                && !words[5].equals("Item")
                && !words[5].equals("GameObject")))
            throw new ParseException();
            
        if(words[5].equals("Creature"))
            casterUnit=new Creature(words[7], words[3]);
        else if(words[5].equals("Player"))
            casterUnit=new Player((words.length==10)?words[9]:"", words[3]);
        else if(words[5].equals("Vehicle"))
            casterUnit=new Vehicule(words[7], words[3]);
        else if(words[5].equals("Pet"))
            casterUnit=new Pet(words[3]);
        else if(words[5].equals("Item")){
            itemCasterGUID=words[3];
            
            words=lines.get(2).split("\\s+");
            if(words[6].equals("Player"))
                casterUnit=new Player((words.length==11)?words[10]:"", words[4]);
            else
                throw new ParseException();
        }
        else if(words[5].equals("GameObject")) // @todo: harmonize the way GOs are modeled and stored.
            casterUnit=new GameObject(words[7], words[3]);
        else
            throw new ParseException();
        
        /**
         *  Spell ID
         */
        words=lines.get(4).split("\\s+");
        if(!words[0].equals("Spell") || !words[1].equals("ID:"))
            throw new ParseException();
        
        spellId=Integer.valueOf(words[2]);
    }

    public Unit getCasterUnit() {
        return casterUnit;
    }

    public void setCasterUnit(Unit casterUnit) {
        this.casterUnit = casterUnit;
    }

    public String getItemCasterGUID() {
        return itemCasterGUID;
    }

    public void setItemCasterGUID(String itemCasterGUID) {
        this.itemCasterGUID = itemCasterGUID;
    }

    public Integer getSpellId() {
        return spellId;
    }

    public void setSpellId(Integer spellId) {
        this.spellId = spellId;
    }
    
    
}
