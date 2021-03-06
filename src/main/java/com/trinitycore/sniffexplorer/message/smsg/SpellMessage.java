/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trinitycore.sniffexplorer.message.smsg;

import java.util.List;

import com.trinitycore.sniffexplorer.exceptions.ParseException;
import com.trinitycore.sniffexplorer.game.entities.Unit;
import com.trinitycore.sniffexplorer.message.Message;
import com.trinitycore.sniffexplorer.message.ParseUtils;


 /* template
 0   ServerToClient: SMSG_SPELL_START (0x6415) Length: 53 ConnIdx: 2 Time: 06/17/2012 01:41:34.793 Number: 413913
 1   Caster GUID: Full: 0xF130CD160001CF6B Type: Creature Entry: 52502 Low: 118635
 2   Caster Unit GUID: Full: 0xF130CD160001CF6B Type: Creature Entry: 52502 Low: 118635
 3   Cast Count: 0
 4   Spell ID: 97155 (97155)
 5   Cast Flags: HasTrajectory, Projectile (34)
 6   Time: 0
 7   Time2: 0
 8   Target Flags: Unit (2)
 9   Target GUID: Full: 0xF130CD1800027FCC Type: Creature Entry: 52504 Low: 163788
 10  Ammo Display ID: 2414
 11  Ammo Inventory Type: Ammo (24)
    */

    /*
    ServerToClient: SMSG_SPELL_START (0x6415) Length: 39 ConnIdx: 2 Time: 06/16/2012 22:48:02.677 Number: 7012
    Caster GUID: Full: 0xFFFFEEEEDDDDCCC Type: Player Low: 11112222 Name: XXXXX
    Caster Unit GUID: Full: 0xFFFFEEEEDDDDCCC Type: Player Low: 11112222 Name: XXXXX
    Cast Count: 0
    Spell ID: 99055 (99055)
    Cast Flags: PendingCast, HasTrajectory, Unknown3 (11)
    Time: 0
    Time2: 0
    Target Flags: Unit (2)
    Target GUID: Full: 0xFFFFEEEEDDDDCCC Type: Player Low: 11112222 Name: XXXXX
    */

    /*
    ServerToClient: SMSG_SPELL_START (0x6415) Length: 33 ConnIdx: 2 Time: 06/17/2012 01:41:15.932 Number: 412134
    Caster GUID: Full: 0xFFFFEEEEDDDDCCC Type: Player Low: 11112222 Name: XXXXX
    Caster Unit GUID: Full: 0xFFFFEEEEDDDDCCC Type: Player Low: 11112222 Name: XXXXX
    Cast Count: 0
    Spell ID: 54181 (54181)
    Cast Flags: PendingCast, HasTrajectory, Unknown3 (11)
    Time: 0
    Time2: 0
    Target Flags: Self (0)
    */

    /*
    ServerToClient: SMSG_SPELL_GO (0x6DEF) Length: 44 ConnIdx: 2 Time: 02/25/2012 21:50:25.252 Number: 19793
    Caster GUID: Full: 0x500000004468452 Type: Player Low: 71730258
    Caster Unit GUID: Full: 0x500000004468452 Type: Player Low: 71730258
    Cast Count: 0
    Spell ID: 109860 (109860)
    Cast Flags: PendingCast, Unknown2, Unknown7 (261)
    Time: 0
    Time2: 3061742090
    Hit Count: 1
    [0] Hit GUID: Full: 0x500000004468452 Type: Player Low: 71730258
    Miss Count: 0
    Target Flags: Unit (2)
    Target GUID: 0x0
    */

    /*
    ServerToClient: SMSG_SPELL_GO (0x6DEF) Length: 45 ConnIdx: 2 Time: 02/25/2012 21:50:22.834 Number: 19588
    Caster GUID: Full: 0x45000002D5DB44B0 Type: Item Low: 12177851568
    Caster Unit GUID: Full: 0x50000000444F698 Type: Player Low: 71628440
    Cast Count: 0
    Spell ID: 53365 (53365)
    Cast Flags: PendingCast, Unknown3, Unknown7, Unknown23 (134217993)
    Time: 0
    Time2: 3061739676
    Hit Count: 1
    [0] Hit GUID: Full: 0x50000000444F698 Type: Player Low: 71628440
    Miss Count: 0
    Target Flags: Unit (2)
    Target GUID: 0x0
     */

    /*
    ServerToClient: SMSG_SPELL_GO (0x6E16) Length: 59 ConnIdx: 2 Time: 06/17/2012 00:39:28.662 Number: 307757
    Caster GUID: Full: 0xF112EA21000018EA Type: GameObject Entry: 191009 Low: 6378
    Caster Unit GUID: 0x0
    Cast Count: 0
    Spell ID: 17609 (17609)
    Cast Flags: PendingCast, Unknown2, Unknown7, Unknown13 (33029)
    Time: 0
    Time2: 4158746954
    Hit Count: 1
    [0] Hit GUID: Full: 0x60000000456E3D8 Type: Player Low: 72803288 Name: Salantharasa
    Miss Count: 0
    Target Flags: Unit, DestinationLocation (66)
    Target GUID: Full: 0x60000000456E3D8 Type: Player Low: 72803288 Name: Salantharasa
    Destination Transport GUID: 0x0
    Destination Position: X: 1776.5 Y: -4338.8 Z: -7.48
    Unk Byte 2: 0
     */

    /*
    ServerToClient: SMSG_SPELL_GO (0x0132) Length: 59 ConnIdx: 0 Time: 09/14/2010 09:07:31.000 Number: 781
    Caster GUID: Full: 0xF130007A79008E5F Type: Creature Entry: 31353 ([DND] Icecrown Airship (N) - Attack Controller) Low: 36447
    Caster Unit GUID: Full: 0xF130007A79008E5F Type: Creature Entry: 31353 ([DND] Icecrown Airship (N) - Attack Controller) Low: 36447
    Cast Count: 0
    Spell ID: Icecrown Airship - A - Attack - Tell Cannon to Fire - Single Start A (57659)
    Cast Flags: PendingCast, Unknown3, Unknown7, Unknown12 (16649)
    Time: 260061407
    Hit Count: 1
    [0] Hit GUID: Full: 0xF1300077BF008E60 Type: Creature Entry: 30655 ([DND] Icecrown Airship (A) - Cannon Controller 01) Low: 36448
    Miss Count: 0
    Target Flags: Unit, DestinationLocation (66)
    Target GUID: 0x0
    Destination Transport GUID: Full: 0x1FC0000000000027 Type: Transport Low: 39
    Destination Position: X: -21.7234 Y: 19.33753 Z: 9.687197
    Unk Byte 2: -90
     */

    /*
    ServerToClient: SMSG_SPELL_GO (0x0132) Length: 42 ConnIdx: 0 Time: 05/15/2010 19:33:24.000 Number: 377266
    Caster GUID: Full: 0xF1300077C300192D Type: Creature Entry: 30659 (Violet Hold Guard) Low: 6445
    Caster Unit GUID: Full: 0xF1300077C300192D Type: Creature Entry: 30659 (Violet Hold Guard) Low: 6445
    Cast Count: 0
    Spell ID: Permanent Feign Death (29266)
    Cast Flags: Unknown7 (256)
    Time: 2641683562
    Hit Count: 1
    [0] Hit GUID: Full: 0xF1300077C300192D Type: Creature Entry: 30659 (Violet Hold Guard) Low: 6445
    Miss Count: 0
    Target Flags: Unit (2)
    Target GUID: 0x0
     */
/**
 *
 * @author chaouki
 */
public abstract class SpellMessage extends Message {
    
    private Unit casterUnit;
    private Unit caster;
    
    private Integer spellId;
    private Integer targetFlags;
    private Unit targetUnit;
    
    @Override
    public void initialize(List<String> lines) throws ParseException {
        caster=ParseUtils.parseGuidRemovePrefix(lines.get(1), "Caster GUID");
        casterUnit=ParseUtils.parseGuidRemovePrefix(lines.get(2), "Caster Unit GUID");

        /**
         *  Spell ID
         */
        int spellIdIndex = ParseUtils.getLineIndexThatStartWithPrefix(lines, "Spell ID", 3);
        String spellIdString = ParseUtils.removePrefixAndGetLastElement(lines.get(spellIdIndex), "Spell ID");
        spellIdString = spellIdString.substring(1, spellIdString.length()-1);
        spellId=Integer.valueOf(spellIdString);

        /**
         * Target(s)
         */
        Integer targetFlagsIndex = ParseUtils.getLineIndexThatStartWithPrefix(lines, "Target Flags");
        String[] split = lines.get(targetFlagsIndex).split("\\s+");
        String targetFlagsString = split[split.length - 1].replace('(', ' ').replace(')', ' ').trim();
        targetFlags=Integer.valueOf(targetFlagsString);

        if(targetFlags==0){ // case Self
            targetUnit=getCasterUnit();
        }
        else if(targetFlags==2){ // case Unit
            targetUnit= ParseUtils.parseGuidRemovePrefix(lines.get(targetFlagsIndex+1), "Target GUID");
        }
//        else if(targetFlags==16)                                    // Item
//            log.warn("targetFlags 16 unsupported yet.");
//        else if(targetFlags==32)                                    // SourceLocation
//            log.warn("targetFlags 32 unsupported yet.");
//        else if(targetFlags==64)                                    // DestinationLocation
//            log.warn("targetFlags 64 unsupported yet.");
//        else if(targetFlags==96)                                    // SourceLocation, DestinationLocation
//            log.warn("targetFlags 96 unsupported yet.");
//        else if(targetFlags==2048)                                  // GameObject
//            log.warn("targetFlags 2048 unsupported yet.");
//        else
//            log.warn("targetFlags "+targetFlags+" unsupported yet.");
    }

    public Unit getCasterUnit() {
        return casterUnit;
    }

    public Integer getSpellId() {
        return spellId;
    }

    public Unit getCaster() {
        return caster;
    }

    public Integer getTargetFlags() {
        return targetFlags;
    }

    public Unit getTargetUnit() {
        return targetUnit;
    }
}
