package com.trinitycore.sniffexplorer.launcher;

import com.trinitycore.sniffexplorer.core.Parser;
import com.trinitycore.sniffexplorer.criteria.CriteriaSet;
import com.trinitycore.sniffexplorer.exceptions.ParseException;
import com.trinitycore.sniffexplorer.game.entities.Unit;
import com.trinitycore.sniffexplorer.message.Direction;
import com.trinitycore.sniffexplorer.message.Message;
import com.trinitycore.sniffexplorer.message.OpCode;
import com.trinitycore.sniffexplorer.message.ParseUtils;
import com.trinitycore.sniffexplorer.message.smsg.SpellMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by chaouki on 23-12-16.
 */
@SuppressWarnings("Duplicates")
public class MovementPacketsAssertions3 {

    protected static final Logger logger = LoggerFactory.getLogger(MovementPacketsAssertions3.class);

    private static final String INPUT_SNIFF = "C:\\Sniffs\\335\\bin";
//    private static final String INPUT_SNIFF ="C:\\Sniffs\\335\\bin\\anfiteatro_argent_oculus_parsed.txt";
//    private static final String INPUT_SNIFF ="C:\\Sniffs\\335\\bin\\Dump_05_24_10_11_57_42_parsed.txt";
//    private static final String INPUT_SNIFF ="C:\\Sniffs\\335\\bin\\Dump_07_02_10_16_26_19_parsed.txt";
//    private static final String INPUT_SNIFF ="C:\\Sniffs\\335\\bin\\toc-and-more_parsed.txt";
//    private static final String INPUT_SNIFF ="C:\\Sniffs\\335\\bin\\BINBoreanTundraLeveling13_parsed.txt";
//    private static final String INPUT_SNIFF ="C:\\Sniffs\\335\\bin\\ICC50%_parsed.txt";
//    private static final String INPUT_SNIFF ="C:\\Sniffs\\335\\bin\\BINSlavePens_parsed.txt";
    private static final String OUTPUT_SNIFF_FILE_NAME = "sniffexplorer.txt";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File dir = new File(INPUT_SNIFF);
        File[] directoryListing = dir.listFiles();
        if (directoryListing != null) {
            // case where INPUT_SNIFF is a directory. then analyse every files in it.
            for (File file : directoryListing) {
                if (file.getName().endsWith("_parsed.txt")) {
                    logger.warn("parsing now: " + file.toString());
                    processFile(file);
                }
            }
        } else {
            // INPUT_SNIFF is a file. analyse it.
            logger.warn("parsing now: " + dir.toString());
            processFile(dir);
        }
    }

    private static void processFile(File file) {
        CriteriaSet criteriaSet = new CriteriaSet(message -> {
            if(message instanceof SpellMessage){
                SpellMessage spellMessage = (SpellMessage) message;
                if(spellMessage.getSpellId().equals(56446))
                    return true;
//                if(spellMessage.getSpellId().equals(781))
//                    return true;
            }
            return false;
        });

        Parser parser=new Parser(file, true);
        parser.parseFile(criteriaSet, message -> {
            System.out.println("condition not verified in " + file + " for opcode: " + message.getOpCode() + " and direction " + message.getDirection());
            printMessage(message);
        });
    }

    private static void printMessage(Message message){
        message.getMessageText().forEach(System.out::println);
        System.out.println();
    }

    private static Unit getUnit(Message message) {
        String line = message.getMessageText().get(1);
        Unit unit;
        try {
            if (line.startsWith("Guid"))
                unit = ParseUtils.parseGuidRemovePrefix(line, "Guid");
            else if (line.startsWith("GUID"))
                unit = ParseUtils.parseGuidRemovePrefix(line, "GUID");
            else
                throw new RuntimeException();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        return unit;
    }
}
