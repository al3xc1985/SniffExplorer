/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tc.sniffexplorer.criteria;

import java.util.HashSet;
import java.util.Set;
import tc.sniffexplorer.message.Message;

/**
 *
 * @author chaouki
 */
public class CriteriaSet {
    private Set<Criteria> criterion=new HashSet<>(); // two "same" criteria object shoudn't be in the set. 
    // therefore, equals() and hashcode() need to be reimplemented for Criteria and each child classes.
    
    public boolean IsSatisfiedBy(Message message){
        for(Criteria criteria:criterion)
            if(criteria.isSatisfiedBy(message))
                return true;
        return false;
    }
    
    public void addCriteria(Criteria criteria){
        criterion.add(criteria);
    }
}
